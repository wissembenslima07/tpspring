package my.company.tpclass.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Provider extends User{

    private String matricule;
    private String service;
    private String company;
    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Product> products;

}
