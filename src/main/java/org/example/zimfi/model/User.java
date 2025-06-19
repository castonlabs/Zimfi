package org.example.zimfi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.zimfi.roleenum.UserRole;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

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
    @NotBlank(message = "please fill the phone")
    private String phone;
    @NotBlank(message = "please fill the address")
    private String address;

    @NotBlank(message = "please fill the blank")
    private String city;

    @NotBlank(message = "please fill the blank")
    private String state;
   @CreationTimestamp

    private LocalTime createdAt;
@ElementCollection(fetch = FetchType.EAGER)
@Enumerated(EnumType.STRING)
    private Set<UserRole> role = new HashSet<>();
}
