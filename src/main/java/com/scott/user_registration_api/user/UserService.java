package com.scott.user_registration_api.user;

import com.scott.user_registration_api.user.exceptions.EmailAlreadyExisits;
import com.scott.user_registration_api.user.exceptions.InvalidPasswordException;
import com.scott.user_registration_api.user.exceptions.UserNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public RegisterResponse registerUser(RegisterRequest registerRequest) {

        String message = "Registration Sucessfull";

        //check email does not already exist
        if (emailExists(registerRequest.getEmail())){
            throw new EmailAlreadyExisits("user has account already");
        }

        User user = new User(
                registerRequest.getUsername(),
                registerRequest.getEmail(),
                registerRequest.getPassword()
        );

        // Hash the password before saving
        String hashedPassword = passwordEncoder.encode(registerRequest.getPassword());

        // Replace plain text password with hash
        user.setPassword(hashedPassword);

        // Save user to database
        User savedUser = userRepository.save(user);

        return new RegisterResponse(
                savedUser.getId(),
                savedUser.getUsername(),
                savedUser.getEmail(),
                message
        );





    }

    public User findUserByEmail(String email) {

        return userRepository
                .findByEmail(email)
                .orElseThrow(() ->
                        new UserNotFoundException("Email not found"));
    }

    public LoginResponse loginUser(LoginRequest loginRequest){
        User user = findUserByEmail(loginRequest.getEmail());
        String message = "Welcome Back " + user.getUsername();

        boolean passwordMatches = passwordEncoder.matches(
                loginRequest.getPassword(),
                user.getPassword()
        );

        if (passwordMatches){
            return new LoginResponse(
                    user.getId(),
                    user.getUsername(),
                    user.getEmail(),
                    message
            );
        }

        throw new InvalidPasswordException("Wrong Password");

    }

    public boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }

}

