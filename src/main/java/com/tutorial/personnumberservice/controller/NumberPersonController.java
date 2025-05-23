package com.tutorial.personnumberservice.controller;

import com.tutorial.personnumberservice.entity.NumberPersonEntity;
import com.tutorial.personnumberservice.service.NumberPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/numberPerson")
@CrossOrigin("*")
public class NumberPersonController {

    @Autowired
    NumberPersonService numberPersonService;

    @GetMapping("/{number}")
    public double getDiscountForNumber(@PathVariable Integer number) {
        return numberPersonService.getDiscountForNumber(number);
    }
}
