package helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    private int i = 0;

    @RequestMapping
    public String index() {
        return String.format("Hello World (%d)", ++i);
    }
}