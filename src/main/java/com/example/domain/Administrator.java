package com.example.domain;

/**
 * AdministratorのDomainクラス
 * @author Kawaguchi_Ryuya
 */
public class Administrator {
    /**
     * Administratorのid
     */
    private Integer id;
    /**
     * Administratorのname
     */
    private String name;
    /**
     * Administratorのmail_address
     */
    private String mailAddress;
    /**
     * Administratorのpassword
     */
    private String password;

    @Override
    public String toString() {
        return "Administrator [id=" + id + ", name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
                + "]";
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
