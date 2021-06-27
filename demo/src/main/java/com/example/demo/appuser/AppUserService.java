package com.example.demo.appuser;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//impliments an interface for spring security
// below is how we try to find users once we try to login

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {
    private final static String USER_BOT_FOUND_MSG =
            "user with email %s not found";
    private final AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException(String.format(USER_BOT_FOUND_MSG,email)));
        //TODO: we need a query against our postgres database
    }
}
