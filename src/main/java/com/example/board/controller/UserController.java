package com.example.board.controller;

import com.example.board.domain.User;
import com.example.board.service.UserService;
import com.example.board.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User insertUser(User user) throws SQLException {
        return userService.insertUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() throws SQLException {
        return userService.getAllUsers();
    }
    @GetMapping("/{userId}")
    public User getUserByUserId(@PathVariable Long userId) throws SQLException {
        return userService.getUserByUserId(userId);
    }

    @PutMapping("/{userId}")
    public void updateUserPw(@PathVariable Long userId, User user) throws SQLException {
        userService.updateUserPw(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) throws SQLException {
        userService.deleteUser(userId);
    }
}
