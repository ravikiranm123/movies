package aug.product.inventry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aug.product.inventry.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer>{

}
