package de.hnu.repository;

import de.hnu.data.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findDistinctByEmailAndPassword(String email, String password);
}



//Team’s contribution



//Joshua Kakembo
//Project structure, Controller, Service, backend, Deployment with Docker, dto, data

//Pratik Naik 
//Project structure, Controller, Service,

//Supratim Chakraborty
//Project structure, Controller, Service,

//Andrea Spitoni
//Project structure, Application Properties, Service,

//Ayooluwa Ajayi
//Project structure, Repository, Service,

//Dharati Trivedi 
//Project structure, data, Service,