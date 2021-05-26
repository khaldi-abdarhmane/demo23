package EJBmodule.session;

import EJBmodule.entity.Livre;
import  javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface GestionLivresRemote {
    Livre creerLivre(String titre);
    void ajouterLivre(Livre livre);
    List<Livre> recuprrerLivres();

}
