package com.bazaar.app.Repository;

import com.bazaar.app.DTO.users.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends CrudRepository<Users, Integer> {

    @Query(value = "SELECT u from Users u where u.user_email like :email AND (u.user_password like :pwd)")

    Users validateLoginUser(String email, String pwd);
}
