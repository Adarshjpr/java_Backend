package com.example.QuoteBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.QuoteBook.model.Quote;
import com.example.QuoteBook.repository.QuoteRepository;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @PostMapping
    public Quote addQuote(@RequestBody Quote quote) {
        return quoteRepository.save(quote);
    }

    @DeleteMapping("/{id}")
    public void deleteQuote(@PathVariable String id) {
        quoteRepository.deleteById(id);
    }
}
