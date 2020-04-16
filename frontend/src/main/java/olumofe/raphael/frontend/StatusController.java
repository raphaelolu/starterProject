package olumofe.raphael.frontend;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Controller

public class StatusController
{
    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return  "status: ok";
    }
}
