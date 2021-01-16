package ru.itis.javalab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.javalab.models.User;
import ru.itis.javalab.services.interfaces.UserService;
import ru.itis.javalab.utils.Validator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(HttpServletRequest request,
                            HttpServletResponse response,
                            @RequestParam String email,
                            @RequestParam String password) throws IOException {
        String emailFromRequest = request.getParameter("email");
        String passwordFromRequest = request.getParameter("password");

        if (Validator.validLoginData(emailFromRequest, passwordFromRequest)) {
            User user = userService.getUser(emailFromRequest);

            if (user != null) {
                System.out.println("valid");
                request.getSession().setAttribute("user", userService.getUser(user.getEmail()));

                Cookie emailCookie = new Cookie("email", emailFromRequest);
                    emailCookie.setMaxAge(60 * 60 * 24 * 365);
                    Cookie hashCookie = new Cookie("password", passwordEncoder.encode(passwordFromRequest));
                    hashCookie.setMaxAge(60 * 60 * 24 * 365);
                    response.addCookie(emailCookie);
                    response.addCookie(hashCookie);

                return "redirect:/main";
            } else {
                return "redirect:/register";
            }
        } else {
            return "redirect:/login";
        }
    }
}
