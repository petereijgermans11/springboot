package first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @Value("${prefix.stringProp1}")
    private String stringProp1;

    EchoController() {

    }

    @RequestMapping("/echo")
    public String  sayHello() {
        return "Hello" + stringProp1;
    }

}