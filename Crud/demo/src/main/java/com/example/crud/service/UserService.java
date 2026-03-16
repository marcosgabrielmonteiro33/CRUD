package com.example.crud.service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listarUsuarios() {
        return repository.findAll();
    }

    public User salvarUsuario(User user) {
        return repository.save(user);
    }

    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }
}