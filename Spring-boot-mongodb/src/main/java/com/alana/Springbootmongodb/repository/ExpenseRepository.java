package com.alana.Springbootmongodb.repository;

import com.alana.Springbootmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

}
