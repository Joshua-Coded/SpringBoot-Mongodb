package com.alana.Springbootmongodb.controller;

import com.alana.Springbootmongodb.model.Expense;
import com.alana.Springbootmongodb.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")

public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses(){
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }


    @GetMapping("/{name}")
    public ResponseEntity<Expense> getExpenseByName(@PathVariable String name){
        expenseService.getExpenseByName(name);
        return ResponseEntity.ok(expenseService.getExpenseByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id){
        expenseService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
