package com.company.consultoria.repository;

import com.company.consultoria.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Query(value = "SELECT * FROM Clients WHERE cpf = ?1", nativeQuery = true)
    Optional<Client> findByCpf(String cpf);
}
