package org.example.zimfi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "please fill the name")
    private String firstName;
    @NotBlank(message = "please fill the lastname ")
    private String lastName;
    @Email(message = "please provide a valid email")
    @Column(unique = true,nullable = false)
    @NotBlank(message = "please provide the email adress")
    private String email;

    @NotBlank(message = "Please put your password")
    private String password;
    @NotBlank(message = "please fill the blank")
    private String phone;
    @NotBlank(message = "please fill the blank")
    private String address;

    @NotBlank(message = "please fill the blank")
    private String city;
    @NotBlank(message = "please fill the blank")
    private String state;
   @CreationTimestamp
    private LocalTime createdAt;

}
