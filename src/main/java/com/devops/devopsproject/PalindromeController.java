package com.devops.devopsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class PalindromeController {
    @GetMapping("/checkpalindrome/{input}")
    public Map<String, Object> checkPalindrome(@PathVariable("input") String input){
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed=new StringBuilder(cleanedInput).reverse().toString();
        boolean isPalindrome = cleanedInput.equals(reversed);
        Map<String, Object> response = new HashMap<>();
        response.put("input", input);
        response.put("isPalindrome", isPalindrome);

        return response;

    }
    @GetMapping
    public String checkPalindrome(){
        String ans="Hello from this side";
        return ans;

    }

}
