package com.example.loan.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.AdminModel;
@Repository
public interface AdminRepo extends JpaRepository<AdminModel, String> {

	
}
