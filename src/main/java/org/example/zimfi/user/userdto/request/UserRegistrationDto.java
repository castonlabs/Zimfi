package org.example.zimfi.user.userdto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {
    @NotBlank(message = "please fill the name")
    private String firstName;

    @NotBlank(message = "please fill the lastname ")
    private String lastName;

    @Email(message = "please provide a valid email")
    @NotBlank(message = "please provide the email address")
    private String email;

    @NotBlank(message = "Please put your password")
    private String password;

    @NotBlank(message = "please fill the phone number section")
    private String phone;

    @NotBlank(message = "please fill the adress section")
    private String address;

    @NotBlank(message = "please fill the city section")
    private String city;

    @NotBlank(message = "please fill the state section")
    private String state;

   @NotBlank(message = "please fill the nationalId section")
    private String nationalId;

}
