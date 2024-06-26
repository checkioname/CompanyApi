package com.company.consultoria.repository;

import com.company.consultoria.entity.Client;
import com.company.consultoria.entity.dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findById(long id);
}
