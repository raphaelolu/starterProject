package olumofe.raphael.frontend;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller
{
    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return  "status: ok";
    }
}
