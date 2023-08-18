package aug.product.inventry.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aug.product.inventry.store.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer>{

}
