package first;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public class ReceptenRepository{

    @PersistenceContext
    EntityManager entityManager;

     public List<Recept> getRecepten(){

        Query query = entityManager.createQuery("SELECT r FROM Recept r");
        return (List<Recept>) query.getResultList();
    }

}
