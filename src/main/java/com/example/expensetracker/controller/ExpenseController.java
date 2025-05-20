package com.example.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return service.saveExpense(expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }

    @GetMapping("/category/{category}")
    public List<Expense> getByCategory(@PathVariable String category) {
        return service.getByCategory(category);
    }
}
