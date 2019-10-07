package com.by3vsby4.flatexpenses.data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="expenses")
public class Expenses {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="expense_id")
    private Integer expenseId;

    public Expenses(String expensesName, String category, Integer amount) {
        this.expensesName = expensesName;
        this.category = category;
        this.amount = amount;
    }

    @Column(name="expenses_name")
    private String expensesName;
    private String category;
    private Integer amount;


}
