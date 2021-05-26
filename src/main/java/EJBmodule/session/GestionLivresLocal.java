package EJBmodule.session;

import EJBmodule.entity.Livre;
import  javax.ejb.Local;
import java.util.List;

@Local
public interface GestionLivresLocal {
    Livre creerLivre(String titre);
    void ajouterLivre(Livre livre);
    List<Livre> recuprrerLivres();

}
