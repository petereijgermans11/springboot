package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pei20063 on 22-2-2017.
 */
@RestController
@EnableCaching
@Controller
public class ReceptController {

    private ReceptService receptService;

    @Autowired
    public void setReceptService(ReceptService receptService) {
        this.receptService = receptService;
    }

    @RequestMapping("/recepten")
    @Cacheable("recepten")
    public List<Recept> getAll()
    {
        return receptService.getAllRecepten();
    }


}
