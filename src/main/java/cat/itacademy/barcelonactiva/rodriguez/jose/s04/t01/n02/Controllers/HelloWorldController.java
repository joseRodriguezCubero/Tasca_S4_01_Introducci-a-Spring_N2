package cat.itacademy.barcelonactiva.rodriguez.jose.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    @ResponseBody
    public String saludo(@RequestParam Optional<String> nom) {
        return "Hola, " + nom.orElseGet(() -> "UNKNOWN") + ". Estàs executant un projecte Gradle";
    }

    @RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saludo2(@PathVariable(required = false) String nom) {
        if (nom != null) {
            return "Hola, " + nom + ". Estàs executant un projecte Gradle";
        }
        return "Hola, estàs executant un projecte Gradle";

    }

}
