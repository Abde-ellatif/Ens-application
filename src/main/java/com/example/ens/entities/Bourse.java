package com.example.ens.entities;

import com.example.ens.dto.BourseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;


//@OneToMany one class for many attribut
//@ManyToMany many class for many attribut
//@ManyToOne many class for one attribut
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Bourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refBourse;
    private Date dateBourse;
    private double montantBourse;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;


    /*@OneToMany(mappedBy = "bourse")
    List<Depence> depences=new ArrayList<>();*/


}
