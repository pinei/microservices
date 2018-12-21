package helloworld;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/hello") 
public class HelloController {
	private int i = 0;

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return String.format("Hello World (%d)", ++i);
    }
}