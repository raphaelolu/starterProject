package olumofe.raphael.frontEnd;

import org.springframework.web.bind.annotation.*;
import starterProject.domain.*;

import java.util.ArrayList;
import java.util.List;
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
