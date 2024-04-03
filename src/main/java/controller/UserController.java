package controller;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria", "MAria@gmail", "99999", "12345");
        return ResponseEntity.ok().body(user);

    }


}
