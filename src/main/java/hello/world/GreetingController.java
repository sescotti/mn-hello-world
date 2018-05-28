package hello.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello-world")
public class GreetingController {

    @Get
    public GreetingDto greet(){
        GreetingDto dto = new GreetingDto();
        dto.setGreeting("Hello World!");

        return dto;
    }

}
