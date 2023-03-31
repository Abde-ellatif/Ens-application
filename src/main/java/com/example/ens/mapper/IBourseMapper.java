package com.example.ens.mapper;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.entities.Bourse;
import com.example.ens.entities.Depence;
import com.example.ens.entities.Source;
import com.example.ens.entities.TypeDepence;

@Mapper
public interface IBourseMapper {
    BourseDTO fromBourse(Bourse bourse);
    Bourse fromBourseDTO(BourseDTO bourseDTO);

    DepenceDTO fromDepence(Depence depence);
    Depence fromDepenceDTO(DepenceDTO depenceDTO);

    SourceDTO fromSource(Source source);
    Source fromSourceDTO(SourceDTO sourceDTO);

    TypeDepenceDTO fromTypeDepence(TypeDepence typeDepence);
    TypeDepence fromTypeDepenceDTO(TypeDepenceDTO typeDepenceDTO);
}
