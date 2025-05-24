package com.example.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double amount;
	private String category;
	private String date;
	private String description;

	 // Getter and Setter for id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for amount
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // Getter and Setter for date
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
