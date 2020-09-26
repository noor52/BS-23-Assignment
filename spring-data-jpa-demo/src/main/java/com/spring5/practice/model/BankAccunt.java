package com.spring5.practice.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_bankAccount")
public class BankAccunt  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "accId", nullable = false)
    private Long accountId;

    @Column(name = "accType")
    private String accType;

    @Column(name = "accName")
    private String accName;

    @Column(name = "currentBalance")
    private Double   currentBalance;

    @Column(name = "bankName")
    private String bankName;

    @Column(name = "bankBranchName")
    private String bankBranchName;

    public BankAccunt() {
    }

    public BankAccunt( String accType, String accName, Double currentBalance, String bankName, String bankBranchName) {

        this.accType = accType;
        this.accName = accName;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.bankBranchName = bankBranchName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
}
