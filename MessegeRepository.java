package com.bankingSystem.Baking_Backend.userRepositoryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingSystem.Baking_Backend.Entityy.Messege;

@Repository
public interface MessegeRepository extends JpaRepository<Messege, Long> {

}
