package olumofe.raphael.frontEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller
public class Controller
{
    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return  "status: ok";
    }


}
