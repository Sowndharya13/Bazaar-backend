package com.bazaar.app.controller.stores;

        import com.bazaar.app.DTO.products.Products;
        import com.bazaar.app.DTO.stores.Stores;
        import com.bazaar.app.DTO.users.Users;
        import com.bazaar.app.Services.stores.StoreService;
        import org.springframework.beans.factory.annotation.*;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.NoSuchElementException;

@RestController
public class StoreController {

    @Autowired
    private StoreService service;

    @GetMapping("/store")
    public List<Stores> list() {
        System.out.println(service.getAllStores());

        return service.getAllStores();

    }

    @GetMapping("/store/{store_id}")
    public ResponseEntity<Stores> get(@PathVariable Integer store_id) {
        try {
            System.out.println("Stores get by store id from controller" + store_id);

            Stores stores = service.get(store_id);
            return new ResponseEntity<Stores>(stores, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Stores>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping("/store")
    public void add(@RequestBody Stores store) {
        service.save(store);
        }
    @GetMapping("/store/user/{user_id}")
    public List<Stores> get(Users users, @PathVariable Integer user_id) {
        System.out.println("Stores owned by  user_id id from controller" + user_id);
        return service.getStoresOwnedByUser(user_id);
    }
}
