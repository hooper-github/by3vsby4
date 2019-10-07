package com.by3vsby4.flatexpenses.controllers;

import com.by3vsby4.flatexpenses.data.Expenses;
import com.by3vsby4.flatexpenses.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ExpensesController {


    @Autowired
    ExpensesRepository expensesRepository;

    @GetMapping("/expenses")
    public List<Expenses> listexpenses()
    {
        return expensesRepository.findAll();
    }


    @GetMapping("/expenses/{id}")
    public Optional<Expenses> getExpenseById(@PathVariable String id){
        int expenseId = Integer.parseInt(id);
        Optional<Expenses> expense=expensesRepository.findById(expenseId);
        return  expense;
    }


    @PostMapping("/expenses/{name}/{category}/{amount}")
    public Expenses create(@PathVariable String name,@PathVariable String category
                         ,@PathVariable String amount){


       String expenseName=name;
       String categoryName=category;
       Integer expenseAmount=Integer.parseInt(amount);

        return expensesRepository.save(new Expenses(expenseName,categoryName,expenseAmount));
    }

    @PutMapping("/expenses/update/{id}/{amount}")
    public Expenses update(@PathVariable String id, @PathVariable String amount){
        int expenseId = Integer.parseInt(id);
        int newAmount=Integer.parseInt(amount);
        Optional<Expenses> expense=expensesRepository.findById(expenseId);
        Expenses expenses=expense.get();
        expenses.setAmount(newAmount);
        return expensesRepository.save(expenses);
    }

    @DeleteMapping("expenses/{id}")
    public void delete(@PathVariable String id){
        int expenseId = Integer.parseInt(id);
        expensesRepository.deleteById(expenseId);
    }

}
