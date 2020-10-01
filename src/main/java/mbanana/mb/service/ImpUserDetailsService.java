package mbanana.mb.service;

import mbanana.mb.repo.UserEntityRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class ImpUserDetailsService implements UserDetailsService {

    private UserEntityRepo userEntityRepo;

    public ImpUserDetailsService(UserEntityRepo userEntityRepo){
        this.userEntityRepo = userEntityRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userEntityRepo.findByUsername(s).get();
    }
}
