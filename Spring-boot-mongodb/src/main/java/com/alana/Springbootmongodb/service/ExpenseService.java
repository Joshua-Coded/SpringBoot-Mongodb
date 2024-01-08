package com.alana.Springbootmongodb.service;

import com.alana.Springbootmongodb.model.Expense;
import com.alana.Springbootmongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    }
    public void updateExpense(){}
    public void getAllExpenses(){}

    public void getExpenseByName(){}
    public void deleteExpense(){}
}
