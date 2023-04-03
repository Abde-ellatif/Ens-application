package com.example.ens.entities;


import lombok.ToString;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.*;



//@OneToMany one class for many attribut
//@ManyToMany many class for many attribut
//@ManyToOne many class for one attribut
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Depence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refDepence;
    private Date dateDepence;
    private double montantDepence;
    private String benificiare;
    @ManyToOne
    @JoinColumn(name = "TypeDepence_id")
    private TypeDepence typeDepence;
    @ManyToOne
    @JoinColumn(name = "bourse_id")
    private Bourse bourse;


}