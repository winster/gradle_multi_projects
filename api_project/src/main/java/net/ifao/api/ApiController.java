package net.ifao.api;

import com.example.gradlemulti.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/user")
    String user() {
        return "";
    }

    @GetMapping("/user1")
    String user1() {
        return new User().getName();
    }
}
