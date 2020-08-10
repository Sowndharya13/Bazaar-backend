package com.bazaar.app.Repository;

import com.bazaar.app.DTO.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
