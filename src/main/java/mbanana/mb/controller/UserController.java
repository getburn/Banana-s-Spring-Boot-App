package mbanana.mb.controller;

import mbanana.mb.model.UserEntity;
import mbanana.mb.repo.TokenEntityRepo;
import mbanana.mb.repo.UserEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private UserEntity userEntity;
    private UserEntityRepo userEntityRepo;
    private TokenEntityRepo tokenEntityRepo;

    public UserController(UserEntity userEntity,
                          UserEntityRepo userEntityRepo,
                          TokenEntityRepo tokenEntityRepo) {
        this.userEntity = userEntity;
        this.userEntityRepo = userEntityRepo;
        this.tokenEntityRepo = tokenEntityRepo;
    }


    @GetMapping("/mainView")
    @ResponseBody
    public String mainView () {
        return "startPage";
    }

}

