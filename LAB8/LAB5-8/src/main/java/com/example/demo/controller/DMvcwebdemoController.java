// package com.example.demo.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class MvcwebdemoController {
//     // Serve the index.html page
//     @GetMapping("/")
//     public String home() {
//         return "index"; // Refers to src/main/resources/templates/index.html
//     }

//     // Serve the registration.html page
//     @GetMapping("/registration")
//     public String registration() {
//         return "registration";
//     }
// }

// comment this file when u use Lab7&Lab8
// package com.example.demo.controller;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import com.example.demo.model.RegistrationForm;
// // import com.app.webdemo.model.RegistrationForm;

// import jakarta.validation.Valid;
// @Controller
// public class DMvcwebdemoController {
// 	// Serve the index.html page
// 	@GetMapping("/")
// 	public String home() {
// 		return "index"; // returns Thymeleaf template index.html
// 	}

// 	// Display the registration form
// 	@GetMapping("/registration")
// 	public String showRegistrationForm(Model model) {
// 		model.addAttribute("registrationForm", new RegistrationForm());
// 		return "registration"; // returns Thymeleaf template registration.html
// 	}

// 	// Handle form submission
// 	@PostMapping("/register")
// 	public String handleRegistration(
// 			@Valid RegistrationForm registrationForm,
// 			BindingResult bindingResult,
// 			Model model) {
// 		// Check for validation errors
// 		if (bindingResult.hasErrors()) {
// 			return "registration"; // Return to the form with error messages
// 		}
// 		// Add form data to the model for the success page
// 		model.addAttribute("firstName", registrationForm.getFirstName());
// 		model.addAttribute("lastName", registrationForm.getLastName());
// 		model.addAttribute("country", registrationForm.getCountry());
// 		model.addAttribute("dob", registrationForm.getDob());
// 		model.addAttribute("email", registrationForm.getEmail());
// 		return "success"; // returns Thymeleafe template success.html
// 	}

// }
