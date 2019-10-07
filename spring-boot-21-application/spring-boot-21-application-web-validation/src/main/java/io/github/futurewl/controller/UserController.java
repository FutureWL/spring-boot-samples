package io.github.futurewl.controller;

import io.github.futurewl.validation.ValidationGroup2;
import io.github.futurewl.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @PostMapping("/user")
    public List<String> addUser(@Validated(ValidationGroup2.class) User user, BindingResult result) {
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError objectError : allErrors) {
                errors.add(objectError.getDefaultMessage());
            }
        }
        return errors;
    }
}
