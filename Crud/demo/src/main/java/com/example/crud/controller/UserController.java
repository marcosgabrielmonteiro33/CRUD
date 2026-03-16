package com.example.crud.controller;

import com.example.crud.model.User;
import com.example.crud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> listar() {
        return service.listarUsuarios();
    }

    @PostMapping
    public User criar(@RequestBody User user) {
        return service.salvarUsuario(user);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarUsuario(id);
    }
}