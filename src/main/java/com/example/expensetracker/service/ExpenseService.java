package com.example.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository repo;

	public List<Expense> getAllExpenses() {
		return repo.findAll();
	}

	public Expense saveExpense(Expense expense) {
		return repo.save(expense);
	}

	public void deleteExpense(Long id) {
		repo.deleteById(id);
	}

	public List<Expense> getByCategory(String category) {
		return repo.findByCategory(category);
	}
}
