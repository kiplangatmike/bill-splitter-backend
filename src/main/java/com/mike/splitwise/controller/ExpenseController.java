package com.mike.splitwise.controller;

import com.mike.splitwise.entity.Expense;
import com.mike.splitwise.model.ExpenseModel;
import com.mike.splitwise.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/create")
    public Expense createExpense(@RequestBody ExpenseModel expenseModel){

        return expenseService.createExpense(expenseModel);
    }
    @GetMapping("/group/{id}")
    public List<Expense> getGrpExpenses(@PathVariable("id") Long groupId){
        return expenseService.getGrpExpenses(groupId);
    }
    @GetMapping("/resolve/{id}")
    public String resolveExpense(@PathVariable("id") Long expId){
        return expenseService.resolveExpense(expId);
    }
}
