package com.example.domain;

import java.util.Date;

/**
 * EmployeeのDomainクラス
 * @author Kawaguchi_Ryuya
 */
public class Employee  {
    /**
     * Employeeのid
     */
    private Integer id;
    /**
     * Employeeのname
     */
    private String name;
    /**
     * Employeeのimage
     */
    private String image;
    /**
     * Employeeのgender
     */
    private String gender;
    /**
     * Employeeのhire_date
     */
    private Date hireDate;
    /**
     * Employeeのmail_address
     */
    private String mailAddress;
    /**
     * Employeeのzip_code
     */
    private String zipCode;
    /**
     * Employeeのaddress
     */
    private String address;
    /**
     * Employeeのtelephone
     */
    private String telephone;
    /**
     * Employeeのsalary
     */
    private Integer salary;
    /**
     * Employeeのcharacteristics
     */
    private String characteristics;
    /**
     * Employeeのdependents_count
     */
    private Integer dependentsCount;
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", image=" + image + ", gender=" + gender + ", hireDate="
                + hireDate + ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address
                + ", telephone=" + telephone + ", salary=" + salary + ", characteristics=" + characteristics
                + ", dependentsCount=" + dependentsCount + "]";
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
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getCharacteristics() {
        return characteristics;
    }
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
    public Integer getDependentsCount() {
        return dependentsCount;
    }
    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }
}
