package id.my.openapi.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private static final String DEFAULT_USERNAME = "openapi-demo";
    private static final String DEFAULT_PASSWORD = "$2a$10$NEbPueY8xefhWVqiXUYbiuwXWrG8tkSNqe/bRsyNhO8hYiobOxe6G";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (DEFAULT_USERNAME.equals(username)) {
            return new User(DEFAULT_USERNAME, DEFAULT_PASSWORD, Collections.emptyList());
        }

        throw new UsernameNotFoundException("sorry, wrong username.");
    }
}
