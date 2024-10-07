package com.tu_paquete.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
public class Corredor {
    
    @Id @GeneratedValue
    private Long id;
    private String nombre;
    private String pais;
    private int victorias;

    // Getters y Setters
}