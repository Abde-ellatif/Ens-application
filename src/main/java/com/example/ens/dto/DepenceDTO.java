package com.example.ens.dto;

import com.example.ens.entities.Bourse;
import com.example.ens.entities.TypeDepence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DepenceDTO {
    private Long id;
    private String refDepence;
    private Date dateDepence;
    private double montantDepence;
    private TypeDepenceDTO typeDepence;
    private BourseDTO bourse;
}
