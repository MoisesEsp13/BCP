package com.example.bcp.rest;

import com.example.bcp.model.Migracion;
import com.example.bcp.service.MigracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/migracion/")
public class MigracionRest {

    @Autowired
    private MigracionService migracionService;

    @GetMapping
    private ResponseEntity<List<Migracion>> getAllMigraciones() {
        return ResponseEntity.ok(migracionService.findAll());
    }
}
