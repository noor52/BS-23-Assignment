package com.spring5.practice.repositories;

import com.spring5.practice.model.EmployeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<EmployeInfo, Long> {

    @Query("select SUM(totalSalary) from EmployeInfo")
    Double findAllByTotalSalary();

    @Query("select MIN(currentBalance) from EmployeInfo")
    Double findAllByCurrentBalanceExists( );
}
