package com.spring5.practice.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Optional;

@Entity
@Table(name = "tbl_employeInfo")
public class EmployeInfo  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "empId", nullable = false)
    private Long empId;

    @Column(name = "name")
    private String name;

    @Column(name = "rank")
    private String rank;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "bankAccountNo")
    private String bankAccountNo;

    @Column(name = "totalSalary")
    private Double totalSalary;

    @Column(name = "basicSalary")
    private Double basicSalary;

    @Column(name = "allEmployeeTotalSalary")
    private Double allEmployeeTotalSalary;

    @Column(name = "paidSalary")
    private Double   paidSalary;

    @Column(name = "CompanyCurrentBankStatus")
    private Double   CompanyCurrentBankStatus;

    @Column(name = "currentBalance")
    private Double   currentBalance;

    public EmployeInfo() {
    }

    public EmployeInfo(String name, String rank, String address, String mobile, String bankAccountNo, Double totalSalary, Double basicSalary, Double allEmployeeTotalSalary) {
        this.name = name;
        this.rank = rank;
        this.address = address;
        this.mobile = mobile;
        this.bankAccountNo = bankAccountNo;
        this.totalSalary = totalSalary;
        this.basicSalary = basicSalary;
        this.allEmployeeTotalSalary  = totalSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary ;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getAllEmployeeTotalSalary() {


        return allEmployeeTotalSalary;
    }

    public void setAllEmployeeTotalSalary(Double allEmployeeTotalSalary) {
        this.allEmployeeTotalSalary = allEmployeeTotalSalary;
    }

    public Double getPaidSalary() {
        return paidSalary;
    }

    public void setPaidSalary(Double paidSalary) {
        this.paidSalary = paidSalary;
    }

    public Double getCompanyCurrentBankStatus() {
        return CompanyCurrentBankStatus;
    }

    public void setCompanyCurrentBankStatus(Double companyCurrentBankStatus) {
        CompanyCurrentBankStatus = companyCurrentBankStatus;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

