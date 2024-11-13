package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Administrator;
import com.example.form.InsertAdministratorForm;
import com.example.form.LoginForm;
import com.example.service.AdministratorService;

import jakarta.servlet.http.HttpSession;

/**
 * AdministratorのControllerクラス
 * @author Kawaguchi_Ryuya
 */
@Controller
@RequestMapping("/")
public class AdministratorController {
    @Autowired
    private AdministratorService service;

    /**
     * Administratorのinsertページを表示するメソッド
     * @param form
     * @return Administratorのinsertページ
     */
    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form) {
        return "administrator/insert";
    }

    @ModelAttribute
    public InsertAdministratorForm setUpForm() {
        return new InsertAdministratorForm();
    }

    /**
     * Administratorをinsertするメソッド
     * @param form
     * @param result
     * @return Administratorのlogin
     */
    @PostMapping("/insert")
    public String inset(
            @Validated InsertAdministratorForm form
            , BindingResult result) {

        if (result.hasErrors()) {
            return toInsert(form);
        }

        Administrator administrator = new Administrator();
        administrator.setName(form.getName());
        administrator.setMailAddress(form.getMailAddress());
        administrator.setPassword(form.getPassword());
        service.insert(administrator);
        return "redirect:/";
    }

    /**
     * Administratorのloginページを表示するメソッド
     * @param form
     * @return Administratorのloginページ
     */
    @GetMapping("/")
    public String toLogin(LoginForm form) {
        return "administrator/login";
    }

    @Autowired
    private HttpSession session;

    /**
     * Administratorのloginをするメソッド
     * @param form
     * @param model
     * @return
     * loginが成功した場合はEmployeeのList
     * loginが失敗した場合はAdministratorのlogin
     */
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

    /**
     * Administratorのlogoutをするメソッド
     * @param form
     * @return Administratorのlogin
     */
    @GetMapping("/logout")
    public String logout(LoginForm form) {
        session.invalidate();
        return "redirect:/";
    }
}
