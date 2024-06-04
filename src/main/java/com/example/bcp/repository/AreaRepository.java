package com.example.bcp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bcp.model.Area;

public interface AreaRepository extends JpaRepository<Area, Long> {
}
