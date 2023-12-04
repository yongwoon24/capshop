import org.springframework.data.jpa.repository.JpaRepository;

import com.rubypaper.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
