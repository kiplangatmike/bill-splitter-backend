package com.mike.splitwise.service;

import com.mike.splitwise.entity.Expense;
import com.mike.splitwise.model.ExpenseModel;

import java.util.List;


public interface ExpenseService {
    Expense createExpense(ExpenseModel expenseModel);

    List<Expense> getGrpExpenses(Long groupId);

    String resolveExpense(Long expId);
}
