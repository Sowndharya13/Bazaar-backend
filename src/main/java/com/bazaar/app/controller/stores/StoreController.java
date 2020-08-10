package com.bazaar.app.controller.stores;

        import com.bazaar.app.DTO.stores.Stores;
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

    @GetMapping("/stpre/{store_id}")
    public ResponseEntity<Stores> get(@PathVariable Integer store_id) {
        try {
            Stores stores = service.get(store_id);
            return new ResponseEntity<Stores>(stores, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Stores>(HttpStatus.NOT_FOUND);
        }

    }
//    @PostMapping("/user")
//    public void add(@RequestBody Users user) {
//        service.save(user);
//    }
}
