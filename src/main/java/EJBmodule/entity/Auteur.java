package EJBmodule.entity;
import  javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Auteur implements Serializable {

    @Id
     private String id;
     private String  nom;

     @ManyToMany(mappedBy = "auteurs")
     private List<Livre> livres;

    public Auteur(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
