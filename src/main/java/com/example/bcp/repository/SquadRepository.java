package com.example.bcp.repository;
import com.example.bcp.model.Squad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquadRepository extends JpaRepository<Squad, Long> {
}
