package com.bazaar.app.Repository;

        import com.bazaar.app.DTO.stores.Stores;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Stores, Integer> {
}
