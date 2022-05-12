package com.alfa.bank.repositories;

import com.alfa.bank.models.CreditExpenses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends CrudRepository<CreditExpenses, Long> {


}
