package com.bazaar.app.Services.stores;

        import com.bazaar.app.DTO.stores.Stores;
        import com.bazaar.app.Repository.StoreRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.transaction.Transactional;
        import java.util.List;

@Service
@Transactional
public class StoreService {

    @Autowired
    private StoreRepository repo;

    public List<Stores> getAllStores() {
        return repo.findAll();
    }
    public void save(Stores stores) {
        repo.save(stores);
    }

    public Stores get(Integer store_id) {
        return repo.findById(store_id).get();
    }
    public List<Stores> getStoresOwnedByUser(Integer user_id) {
        return repo.getStoresOwnedByUser(user_id);
    }
    public void delete(Integer store_id) {
        repo.deleteById(store_id);
    }
}
