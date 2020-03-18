//import com.google.gson.Gson;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import starterProject.App;
//import starterProject.domain.Car;
//
//import java.util.List;
//
//public class CarController {
//
//
//
//    private List<Car> carList = App.createCar();
//
//    @GetMapping("/getCars")
//    //insures that the http GET requests are maped to the sayhello method
//    @ResponseBody
//    public String getCars(@RequestParam() List car ) {
//        String jsonCarList = new Gson().toJson(carList );
//        System.out.println(jsonCarList);
//
//        return jsonCarList;
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//}
