package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
import com.example.service.EmployeeService;

/**
 * EmployeeのControllerクラス
 * @author Kawaguchi_Ryuya
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    /**
     * EmployeeのListをshowするメソッド
     * @param model
     * @return EmployeeのList
     */
    @GetMapping("/showList")
    public String showList(Model model) {
        List<Employee> employeeList = service.showList();
        model.addAttribute("employeeList", employeeList);
        return "employee/list";
    }

    /**
     * idが一致するEmployeeのDetailをshowするメソッド
     * @param id
     * @param model
     * @param form
     * @return idが一致するEmployee
     */
    @GetMapping("/showDetail")
    public String showDetail(String id, Model model, UpdateEmployeeForm form) {
        Employee employee = service.showDetail(Integer.parseInt(id));
        model.addAttribute("employee", employee);
        return "employee/detail";
    }

    /**
     * Employeeをupdateするメソッド
     * @param form
     * @param result
     * @param model
     * @return
     * updateが成功した場合はEmployeeのList
     * updateが失敗した場合はEmployeeのDetail
     */
    @PostMapping("/update")
    public String update(
        @Validated UpdateEmployeeForm form
        , BindingResult result
        , Model model) {

        if (result.hasErrors()) {
            return showDetail(form.getId(), model, form);
        }

        Employee employee = service.showDetail(Integer.parseInt(form.getId()));
        employee.setDependentsCount(Integer.parseInt(form.getDependentsCount()));
        service.update(employee);
        return "redirect:/employee/showList";
    }
}
