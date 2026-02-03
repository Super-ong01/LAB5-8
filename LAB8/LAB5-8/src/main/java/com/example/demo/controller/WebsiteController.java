package com.example.demo.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("/home")
    public String homepage(Model model) {
        // Get the authenticated user's details
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // Check if the user is authenticated
        if (authentication == null || !authentication.isAuthenticated() || authentication instanceof AnonymousAuthenticationToken) {
            // Redirect to the login page if the user is not authenticated
            return "redirect:/login";
        }
        // Get the username
        String username = authentication.getName();
        model.addAttribute("username", username);
        // Get the user's role
        String role = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .findFirst()
                .orElse("ROLE_STAFF"); // Default role if no authority is found
        // Redirect to the appropriate page based on the role
        if (role.equals("ROLE_ADMIN")) {
            return "admin"; // Return the admin.html template
        } else {
            return "viewer"; // Return the viewer.html template
        }
    }
}
