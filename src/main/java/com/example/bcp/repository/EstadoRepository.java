package com.example.bcp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bcp.model.Estado;

public interface EstadoRepository  extends JpaRepository<Estado, Long> {
}
