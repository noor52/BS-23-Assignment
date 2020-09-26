package com.spring5.practice.repositories;

import com.spring5.practice.model.BankAccunt;
import com.spring5.practice.model.EmployeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




@Repository
@Transactional
public interface BankRepository extends JpaRepository<BankAccunt, Long> {

    @Query("select MIN(currentBalance) from BankAccunt")
    Double findAllByCurrentBalanceExists( );

}
