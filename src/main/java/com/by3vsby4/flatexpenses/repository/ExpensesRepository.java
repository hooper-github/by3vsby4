package com.by3vsby4.flatexpenses.repository;

import com.by3vsby4.flatexpenses.data.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses,Integer> {



}
