package mbanana.mb.service;

import mbanana.mb.repo.UserEntityRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserEntityRepo userEntityRepo;
    private PasswordEncoder passwordEncoder;

    public UserService(UserEntityRepo userEntityRepo, PasswordEncoder passwordEncoder) {
        this.userEntityRepo = userEntityRepo;
        this.passwordEncoder = passwordEncoder;
    }

    //to do addUser
}
