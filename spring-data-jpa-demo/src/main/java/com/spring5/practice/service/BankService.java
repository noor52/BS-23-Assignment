package com.spring5.practice.service;

import com.spring5.practice.model.BankAccunt;
import com.spring5.practice.model.EmployeInfo;
import com.spring5.practice.repositories.BankRepository;
import com.spring5.practice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;




@Service
@Transactional
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public void addBankAccount(BankAccunt bankAccount) {

        Double priviousBalance = bankRepository.findAllByCurrentBalanceExists();
        if (priviousBalance != null) {
            Double companyBalanceAfterAdd = 0.0;
            companyBalanceAfterAdd = bankAccount.getCurrentBalance();
            companyBalanceAfterAdd += priviousBalance;

            bankAccount.setAccName(bankAccount.getAccName());
            bankAccount.setCurrentBalance(companyBalanceAfterAdd);
            bankAccount.setBankName("DBBL");
            bankAccount.setBankBranchName("Motizeel");


            bankRepository.save(bankAccount);
        }
    }

    public List<BankAccunt> getAllBank() {
        return bankRepository.findAll();
    }
}