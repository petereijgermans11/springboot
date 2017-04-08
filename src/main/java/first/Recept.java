package first;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by pei20063 on 22-2-2017.
 */
@Entity
public class Recept {

    @Id @GeneratedValue
    Long id;

    String titel;

    @ElementCollection
    List<String> ingredienten;
    String omschrijving;

    protected Recept(){}

    Recept(Long id, String titel, String ingredient, String omschrijving) {
        this.id = id;
        this.titel = titel;
        this.ingredienten = null;
        this.omschrijving = omschrijving;
    }

    public List<String> getIngredienten() {
        return ingredienten;
    }

    public Long getId() {
        return id;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getTitel() {
        return titel;
    }
}
