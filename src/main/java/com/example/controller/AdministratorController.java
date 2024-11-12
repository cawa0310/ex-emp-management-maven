package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Administrator;
import com.example.form.InsertAdministratorForm;
import com.example.form.LoginForm;
import com.example.service.AdministratorService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class AdministratorController {
    @Autowired
    private AdministratorService service;

    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form) {
        return "administrator/insert";
    }

    @PostMapping("/insert")
    public String inset(InsertAdministratorForm form) {
        Administrator administrator = new Administrator();
        administrator.setName(form.getName());
        administrator.setMailAddress(form.getMailAddress());
        administrator.setPassword(form.getPassword());
        service.insert(administrator);
        return "redirect:/";
    }

    @GetMapping("/")
    public String toLogin(LoginForm form) {
        return "administrator/login";
    }

    @Autowired
    private HttpSession session;

    @PostMapping("/login")
    public String login(LoginForm form, Model model) {
        Administrator administrator = service.login(form.getMailAddress(), form.getPassword());

        if (administrator == null) {
            model.addAttribute("error", "メールアドレスまたはパスワードが不正です。");
            return "administrator/login";
        } else {
            session.setAttribute("administratorName", administrator.getName());
            return "redirect:/employee/showList";
        }
    }
}
