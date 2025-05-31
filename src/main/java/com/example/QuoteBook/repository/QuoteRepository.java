package com.example.QuoteBook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.QuoteBook.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

}
