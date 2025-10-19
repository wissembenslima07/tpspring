package my.company.tpclass.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Customer extends User {
    private String adress;
    private String city;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
}
