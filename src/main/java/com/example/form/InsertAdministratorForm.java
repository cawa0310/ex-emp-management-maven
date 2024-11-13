package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * AdministratorをinsertするためのFormクラス
 * @author Kawaguchi_Ryuya
 */
public class InsertAdministratorForm {
    /**
     * Formに入力されたAdministratorのname
     */
    @NotBlank(message="氏名を入力してください")
    private String name;
    /**
     * Formに入力されたAdministratorのmail_address
     */
    @NotBlank(message="メールアドレスを入力してください")
    @Email(message="メールアドレスを入力してください")
    private String mailAddress;
    /**
     * Formに入力されたAdministratorのpassword
     */
    @NotBlank(message="パスワードを入力してください")
    private String password;
    
    @Override
    public String toString() {
        return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
                + "]";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
