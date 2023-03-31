package com.example.ens.dto;


import com.example.ens.entities.Source;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BourseDTO {
    private Long id;
    private String refBourse;
    private Date dateBourse;
    private double montantBourse;
    private SourceDTO source;
}
