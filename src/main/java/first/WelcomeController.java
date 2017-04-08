package first;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by pei20063 on 22-2-2017.
 */
@RestController
@EnableCaching
public class WelcomeController {


    @RequestMapping("/freemarker")
    public ModelAndView sayWelcome() {

        return new ModelAndView("welcome");
    }

}
