package at.technikum.slmcalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Datenaustauschen
public class CalculatorController {

    @RequestMapping("/calc/sum")    // Über eine Route erreichbar   http://localhost:8080/calc/sum?a=3&b=5
    public int sum(@RequestParam int a, @RequestParam int b) {  //@RequestParam Parameter wird aus Internet requestet
        return a + b;
    }
}
