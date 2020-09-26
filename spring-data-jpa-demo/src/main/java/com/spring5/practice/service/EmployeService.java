package com.spring5.practice.service;

import com.spring5.practice.exceptions.ResourceAlreadyExistsException;
import com.spring5.practice.model.EmployeInfo;
import com.spring5.practice.repositories.BankRepository;
import com.spring5.practice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeService {

    @Autowired
     EmployeeRepository employeeRepository;

    @Autowired
    BankRepository bankRepository;

    public void addEmployee(EmployeInfo employeeInfo) {

        Double totalSalary =getTotalSalary(employeeInfo);
        Double basicsalary =getBasicSalary(employeeInfo);
        Double  allEmpolyeeSalry = getAllEmpolyeeSalary(employeeInfo);
//        Double  companybankStatus = getCompanyCurrentBankStatusFull(employeeInfo, allEmpolyeeSalry);


        employeeInfo.setName(employeeInfo.getName());
        employeeInfo.setRank(employeeInfo.getRank());
        employeeInfo.setAddress(employeeInfo.getAddress());
        employeeInfo.setMobile(employeeInfo.getMobile());
        employeeInfo.setBankAccountNo(employeeInfo.getBankAccountNo());
        employeeInfo.setTotalSalary(totalSalary);
        employeeInfo.setBasicSalary(basicsalary);
        employeeInfo.setAllEmployeeTotalSalary(allEmpolyeeSalry);
        employeeInfo.setPaidSalary(allEmpolyeeSalry);
//        employeeInfo.setCompanyCurrentBankStatus(companybankStatus);

        employeeRepository.save(employeeInfo);
    }
    public List<EmployeInfo> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Double getTotalSalary(EmployeInfo employeeInfo){

        Double totalSalary;
        Double basicsalary =getBasicSalary(employeeInfo);
        Double houseRent ;
        houseRent =   basicsalary * .20;
        Double medical = basicsalary * .15;
        totalSalary =  basicsalary + houseRent+  medical;

       return  totalSalary;
    }

  public Double   getBasicSalary( EmployeInfo employeeInfo){
      String rank = employeeInfo.getRank();
      Double lowestBasicSalary= employeeInfo.getBasicSalary();
      Double totalSalary=0.0;
      Double salaryIncriment=0.0;


      if(rank.equals("6")){
          salaryIncriment=0.0;
      }
      else  if(rank.equals("5")){
          salaryIncriment=5000.0;
      }
      else  if(rank.equals("4")){
          salaryIncriment=10000.0;
      }
      else  if(rank.equals("3")){
          salaryIncriment=15000.0;
      }
      else  if(rank.equals("2")){
          salaryIncriment=20000.0;
      }
      else  if(rank.equals("1")){
          salaryIncriment=25000.0;
      }

      Double basicsalary = lowestBasicSalary + salaryIncriment;

      return basicsalary;
    }

    public double getAllEmpolyeeSalary(EmployeInfo employeInfo){
        Double getAllEmpolyeeSalary;
        getAllEmpolyeeSalary = employeeRepository.findAllByTotalSalary();

        return getAllEmpolyeeSalary;
    }

    public Double getCompanyCurrentBankStatusFull(EmployeInfo employeInfo, Double allEmpolyeeSalry){
        Double companyFullBankStatus=0.0;


        Double  bankCurrentBalance = employeeRepository.findAllByCurrentBalanceExists( );

        if( bankCurrentBalance >0 ) {
            if (allEmpolyeeSalry < bankCurrentBalance) {
                companyFullBankStatus = bankCurrentBalance - allEmpolyeeSalry;
            } else {
                throw new ResourceAlreadyExistsException("Bank Account Insaficiant Fund Please enter Balance");
            }
        }else {
            throw new ResourceAlreadyExistsException("Bank bankCurrentBalance is null ");
        }
        return companyFullBankStatus;
    }
}