package my.company.tpclass.Repository;

import my.company.tpclass.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String eamil);
    List<User> findByNameContaining(String name);
    List<User> findByNameAndEmail(String name, String email);
    @Query("SELECT u FROM User u WHERE u.email= :email")
    User chercherParEmail(@Param("email") String email);

    @Query("SELECT u FROM User u WHERE u.name LIKE  %:name%")
    List<User> findByName(@Param("name") String name);

    @Query(value="SELECT * FROM user WHERE email = :eamil", nativeQuery =true)
    User chercherParEmailSQL(@Param("eamil") String eamil);


}
