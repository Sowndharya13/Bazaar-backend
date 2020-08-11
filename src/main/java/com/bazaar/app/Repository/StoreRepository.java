package com.bazaar.app.Repository;

        import com.bazaar.app.DTO.stores.Stores;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;

        import java.util.List;

public interface StoreRepository extends JpaRepository<Stores, Integer> {
        @Query(value = "SELECT s from Stores s where s.user_id = :user_id")
        List<Stores> getStoresOwnedByUser(Integer user_id);
}
