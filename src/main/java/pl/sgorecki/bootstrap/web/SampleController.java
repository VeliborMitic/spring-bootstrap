package pl.sgorecki.bootstrap.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sgorecki.bootstrap.service.CityService;
import pl.sgorecki.bootstrap.service.SampleService;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", sampleService.getHelloMessage());
        model.addAttribute("cities", cityService.fetchAllCities());
        return "index";
    }
}
