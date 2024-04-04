package com.example.course.controller;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import com.example.course.services.OrderService;
import com.example.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;
    @GetMapping("/orders")
    public ResponseEntity<List<Order>>findAll() {
    List<Order> list = service.findAll();
    return  ResponseEntity.ok(list);}
    @GetMapping(value = "/orders/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok(obj);

    }

    }



