package com.example.activity3_2.controller;

import jakarta.servlet.http.HttpSession;
import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafTestController {

    private final MessageSource messageSource;

    public ThymeleafTestController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/thym-test")
    public String thymeleafTest(Model model, HttpSession session, Locale locale) {
        model.addAttribute("title", messageSource.getMessage("thym.title", null, locale));
        model.addAttribute("message", messageSource.getMessage("thym.message", null, locale));
        model.addAttribute("currentTime", System.currentTimeMillis());

        session.setAttribute("userSession", messageSource.getMessage("thym.user.demo", null, locale));
        session.setAttribute("loginTime", System.currentTimeMillis());

        return "thym-test";
    }
}
