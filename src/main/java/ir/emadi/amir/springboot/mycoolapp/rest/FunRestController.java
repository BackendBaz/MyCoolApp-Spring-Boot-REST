package ir.emadi.amir.springboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // GET -> http://localhost:8080/
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // GET -> http://localhost:8080/workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // GET -> http://localhost:8080/fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
