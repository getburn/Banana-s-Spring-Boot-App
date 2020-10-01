package mbanana.mb.cfg;

import mbanana.mb.model.UserEntity;
import mbanana.mb.repo.UserEntityRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Test {

    public Test(UserEntityRepo userEntityRepo, PasswordEncoder passwordEncoder) {
        UserEntity admin = new UserEntity();
        admin.setUserName("admin");
        admin.setUserPassword(passwordEncoder.encode("admin"));
        admin.setUserRole("ADMIN");
        admin.setEnabled(true);
        userEntityRepo.save(admin);

    }
}
