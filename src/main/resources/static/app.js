const API_BASE = "http://localhost:8080/api/expenses";

document.getElementById("expense-form").addEventListener("submit", async function (e) {
  e.preventDefault();

  const expense = {
    category: document.getElementById("category").value,
    amount: parseFloat(document.getElementById("amount").value),
    date: document.getElementById("date").value,
    description: document.getElementById("description").value
  };

  await fetch(API_BASE, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(expense)
  });

  loadExpenses();
});

async function loadExpenses() {
  const response = await fetch(API_BASE);
  const expenses = await response.json();

  const listDiv = document.getElementById("expenses-list");
  listDiv.innerHTML = "";
  expenses.forEach(exp => {
    const div = document.createElement("div");
    div.textContent = `${exp.date} | ${exp.category} | ₹${exp.amount} | ${exp.description}`;
    listDiv.appendChild(div);
  });
}

loadExpenses();
