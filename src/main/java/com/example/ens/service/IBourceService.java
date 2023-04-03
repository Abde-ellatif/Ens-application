package com.example.ens.service;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.exception.SourceException;
import com.example.ens.exception.TypeDepenceException;

import java.util.List;

public interface IBourceService {

    //Bouse
    BourseDTO saveBourse(BourseDTO bourseDTO);
    BourseDTO updateBourse(BourseDTO bourseDTO) throws BourseException;
    BourseDTO getBourseById(Long idBourse) throws BourseException;
    BourseDTO getAllBourseBySource(Long idSource) throws BourseException;
    List<BourseDTO> getAllBourse();
    void deletBourse(Long id) throws BourseException;


    //Source

    SourceDTO saveSource(SourceDTO sourceDTO);
    SourceDTO updateSource(SourceDTO sourceDTO) throws SourceException;
    SourceDTO getSourceById(Long idSource) throws SourceException;
    List<SourceDTO> getAllSource();
    void deletSource(Long idSource) throws SourceException;


    //Depence

    DepenceDTO saveDepence(DepenceDTO depenceDTO);
    DepenceDTO updateDepence(DepenceDTO depenceDTO) throws DepenceException;
    DepenceDTO getDepenceById(Long idDepence) throws DepenceException;
    List<DepenceDTO> getAllDepence();
    List<DepenceDTO> getAllDepenceByBourse(Long idBource);
    void deletDepence(Long idDepence) throws DepenceException;

    //Type Depence

    TypeDepenceDTO saveTypeDepence(TypeDepenceDTO typeDepenceDTO);
    TypeDepenceDTO updateTypeDepence(TypeDepenceDTO typeDepenceDTO) throws TypeDepenceException;
    TypeDepenceDTO getTypeDepenceById(Long idTypeDepence) throws TypeDepenceException;
    List<TypeDepenceDTO>  getAllTypeDepence();
    void deletTypeDepence(Long idTypeDepence) throws TypeDepenceException;
}
