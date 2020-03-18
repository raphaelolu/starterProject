package olumofe.raphael.frontEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller
public class Controller {

    private static  final String template = "Status ok";
    @GetMapping("/status")
    @ResponseBody
    public representation sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new representation( String.format(template, name));
    }


}
