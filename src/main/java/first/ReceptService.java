package first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pei20063 on 22-2-2017.
 */
@Component
public class ReceptService {

    public List<Recept> getAllRecepten() {

        List<Recept> recepten = new ArrayList<Recept>();
        Recept r = new Recept(1L, "GreekFood", null, "Moussaka");
        recepten.add(r);
        r = new Recept(2L, "DutchFood", null, "Boerenkool");
        recepten.add(r);
        return recepten;
    }

}
