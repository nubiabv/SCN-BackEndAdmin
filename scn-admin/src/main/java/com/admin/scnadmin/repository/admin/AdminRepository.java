package com.admin.scnadmin.repository.admin;

import com.admin.scnadmin.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long>{
    Admin findByUsernameAndPassword(String username, String password);
}
