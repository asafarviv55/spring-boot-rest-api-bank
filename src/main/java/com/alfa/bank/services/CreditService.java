package com.alfa.bank.services;

import com.alfa.bank.models.CreditExpenses;
import com.alfa.bank.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditService {



    @Autowired
    private CreditRepository creditRepository;


    public Iterable<CreditExpenses> getAllUsers(){    return  creditRepository.findAll();  }


    public Optional<CreditExpenses> getUserById(long id){   return creditRepository.findById(id);  }


    public void addOrUpdateUser(CreditExpenses creditExpenses){  creditRepository.save(creditExpenses);  }



}
