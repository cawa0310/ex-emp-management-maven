package com.example.form;

import jakarta.validation.constraints.Pattern;

/**
 * EmployeeをupdateするためのFormクラス
 * @author Kawaguchi_Ryuya
 */
public class UpdateEmployeeForm {
    /**
     * Formに入力されたEmployeeのid
     */
    private String id;
    /**
     * Formに入力されたEmployeeのdependents_count
     */
    @Pattern(regexp="[0-9]+", message="扶養人数を入力してください")
    private String dependentsCount;
    
    @Override
    public String toString() {
        return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + "]";
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDependentsCount() {
        return dependentsCount;
    }
    public void setDependentsCount(String dependentsCount) {
        this.dependentsCount = dependentsCount;
    }
}
