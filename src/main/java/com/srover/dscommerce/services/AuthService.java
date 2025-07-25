package com.srover.dscommerce.services;

import com.srover.dscommerce.entities.User;
import com.srover.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validadeSelfOdAdmin(long userId) {
        User me = userService.authenticated();
        if(!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)){
            throw new ForbiddenException("Access denied");
        }
    }
}
