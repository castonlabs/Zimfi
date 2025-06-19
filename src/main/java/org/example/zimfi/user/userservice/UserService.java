package org.example.zimfi.user.userservice;

import org.example.zimfi.user.userdto.request.UpdateUserDto;
import org.example.zimfi.user.userdto.request.UserRegistrationDto;
import org.springframework.security.core.userdetails.User;

public interface UserService {
    void registerUser(UserRegistrationDto request);

    void findUserByEmail(String email);

    User updateUser(UpdateUserDto updaterequest);

    User getCurrentUser();

    User findUserByUsername(String username);

    void deleteUser(User user);

    void changePassword(String oldPassword, String newPassword);

    void assignRoleToUser(User user, Role role);



}
