package com.alfa.bank.controllers;


import com.alfa.bank.models.CreditExpenses;
import com.alfa.bank.services.CreditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/creditExpenses")
public class CreditExpensesController {


    @Autowired
    CreditService creditService;


    @GetMapping( "/{id}")
    public Optional<CreditExpenses> getUser(@PathVariable long id) {
        log.info("getUser called");
        return creditService.getUserById(id);
    }


    @GetMapping("/list")
    public List<CreditExpenses> list() {
        return (List<CreditExpenses>) creditService.getAllUsers();
    }



    @PostMapping("/addOrUpdate")
    public void addOrUpdateUser(@RequestBody CreditExpenses creditExpenses) {
        creditService.addOrUpdateUser(creditExpenses);
    }






}
