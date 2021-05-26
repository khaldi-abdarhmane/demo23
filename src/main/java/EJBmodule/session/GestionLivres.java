package EJBmodule.session;
import EJBmodule.entity.Livre;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class GestionLivres implements GestionLivresRemote,GestionLivresLocal {
   @PersistenceContext(unitName = "catalogue")
    private EntityManager manager;


    @Override
    public Livre creerLivre(String titre) {
        return new Livre(titre);
    }

    @Override
    public void ajouterLivre(Livre livre) {
        manager.persist(livre);


    }

    @Override
    public List<Livre> recuprrerLivres() {
        return manager.createQuery("select l from Livre l").getResultList();
    }
}
