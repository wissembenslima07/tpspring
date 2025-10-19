package my.company.tpclass.Entity;
import jakarta.persistence.*;
import my.company.tpclass.Entity.Product;

import java.util.List;

@Entity
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private  my.company.tpclass.Entity.Category category;
    @OneToMany(mappedBy = "subcategory", cascade = CascadeType.ALL)
    private List<Product> products;
}