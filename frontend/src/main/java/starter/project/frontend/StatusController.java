package starter.project.frontend;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Controller
@RestController
public class StatusController
{
    @GetMapping("/status")
    public String status() {
        return  "status: ok";
    }
}
