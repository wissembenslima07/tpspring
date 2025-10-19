package my.company.tpclass.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ref;
    private double price;
    private Date date;

    @ManyToOne
    @JoinTable(name = "Customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}
