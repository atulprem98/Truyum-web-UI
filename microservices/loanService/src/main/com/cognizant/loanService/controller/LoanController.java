package com.cognizant.loanService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loanService.model.Loan;

@RestController
public class LoanController {

	@GetMapping("/loans/{number}")
	public Loan getLoanDetails(@PathVariable String number) {
		return new Loan(number,"car" , 234343,3258,18);
	}
}
