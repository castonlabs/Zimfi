package org.example.zimfi.user.userdto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDto {
    @NotBlank(message = "please fill the name")
    private String firstName;

    @NotBlank(message = "please fill the lastname ")
    private String lastName;

    @NotBlank(message = "please provide the email address")
    private String address;

    @NotBlank(message = "provide an email address")
    @Email(message = "please provide a valid email")
    private String email;

    @NotBlank(message = "Please put your password")
    private String password;

    @NotBlank(message = "please fill the phone section")
    private String phone;


    @NotBlank(message = "please fill the city section")
    private String city;

    @NotBlank(message = "please fill the state section")
    private String state;

    @NotBlank(message = "please provide a national id ")
    private String nationalId;
}
