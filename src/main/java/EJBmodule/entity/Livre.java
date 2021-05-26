package EJBmodule.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Livre implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    private String intitule;
    @ManyToMany
    private List<Auteur> auteurs;

    public Livre(int id, String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    public Livre(String titre) {
        this.intitule=titre;
    }

    public int getId() {
        return id;
    }


    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
