package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        private UserService userService;

        // Show all users
        @GetMapping
        public String getAllUsers(Model model) {
            model.addAttribute("users", userService.getAllUsers());
            return "index";  // JSP file is named 'index.jsp'
        }

        // Show the form to create a new user
        @GetMapping("/create")
        public String showCreateUserForm() {
            return "create-user";  // JSP file is named 'create-user.jsp'
        }

        // Handle the creation of a new user
        @PostMapping
        public String createUser(User user) {
            userService.createUser(user);
            return "redirect:/users";  // Redirect to the list of users
        }

        // Show the form to edit an existing user
        @GetMapping("/edit/{id}")
        public String showEditUserForm(@PathVariable Long id, Model model) {
            Optional<User> user = userService.getUserById(id);
            if (user.isPresent()) {
                model.addAttribute("user", user.get());
                return "edit-user";  // JSP file is named 'edit-user.jsp'
            }
            return "redirect:/users";  // Redirect to the user list if not found
        }

        // Handle the update of an existing user
        @PostMapping("/{id}")
        public String updateUser(@PathVariable Long id, User user) {
            userService.updateUser(id, user);
            return "redirect:/users";  // Redirect to the list of users
        }

        // Handle the deletion of a user
        @GetMapping("/delete/{id}")
        public String deleteUser(@PathVariable Long id) {
            userService.deleteUser(id);
            return "redirect:/users";  // Redirect to the list of users after deletion
        }
    }

