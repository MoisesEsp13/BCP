package com.example.bcp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bcp.model.Migracion;

public interface MigracionRepository extends JpaRepository<Migracion, Long> {
}
