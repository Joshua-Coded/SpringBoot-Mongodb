package com.alana.Springbootmongodb.service;

import com.alana.Springbootmongodb.model.Expense;
import com.alana.Springbootmongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public void getExpenseByName(){}
    public void deleteExpense(){}
}
