package com.example.form;

/**
 * loginするためのFormクラス
 * @author Kawaguchi_Ryuya
 */
public class LoginForm {
    /**
     * Formに入力されたmail_address
     */
    private String mailAddress;
    /**
     * Formに入力されたpassword
     */
    private String password;
    
    @Override
    public String toString() {
        return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
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
