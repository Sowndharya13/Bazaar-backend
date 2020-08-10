package com.bazaar.app.Services.users;

import com.bazaar.app.DTO.users.Users;
import com.bazaar.app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<Users> getAllUsers() {
        return (List<Users>) repo.findAll();
    }
    public void save(Users user) {
        repo.save(user);
    }
    public Users get(Integer user_id) {
        return repo.findById(user_id).get();
    }

    public Users validateLoginUser(String email, String pwd) {
        Users user = repo.validateLoginUser(email, pwd);
        return user;
    }

    public void delete(Integer user_id) {
         repo.deleteById(user_id);
    }
}
