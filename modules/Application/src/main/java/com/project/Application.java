package com.project;

import com.project.example.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.project")
@RestController
public class Application {

    private LibraryService LibraryService;

    // constructor

    @GetMapping("/validate/")
    public String isEvenOrOdd(
            @RequestParam("number") Integer number) {
        return LibraryService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


