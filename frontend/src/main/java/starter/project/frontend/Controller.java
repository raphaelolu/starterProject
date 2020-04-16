package starter.project.frontend;
import org.springframework.web.bind.annotation.*;
//import starterProject.domain.*;
import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Controller
public class Controller
{
    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return  "status: ok";
    }
}
