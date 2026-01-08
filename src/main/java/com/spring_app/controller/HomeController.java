package com.spring_app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login"; // templates/login.html
    }

    @GetMapping("/home")
    public String home(Authentication auth, Model model) {
        model.addAttribute("usuario", auth.getName());
        return "home"; // templates/home.html
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin"; // templates/admin.html
    }

    @GetMapping("/empleado")
    public String empleado() {
        return "empleado"; // templates/empleado.html
    }

    @GetMapping("/cliente")
    public String cliente() {
        return "cliente"; // templates/cliente.html
    }
}


