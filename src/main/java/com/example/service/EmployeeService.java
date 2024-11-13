package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

/**
 * EmployeeのServiceクラス
 * @author Kawaguchi_Ryuya
 */
@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    /**
     * EmployeeのListをshowするメソッド
     * @return EmployeeのList
     */
    public List<Employee> showList() {
        return repository.findAll();
    }

    /**
     * EmployeeのDetailをshowするメソッド
     * @param id
     * @return idが一致するEmployee
     */
    public Employee showDetail(Integer id) {
        return repository.load(id);
    }

    /**
     * Employeeをupdateするメソッド
     * @param employee
     */
    public void update(Employee employee) {
        repository.update(employee);
    }
}
