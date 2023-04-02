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
    BourseDTO save(BourseDTO bourseDTO);
    BourseDTO update(BourseDTO bourseDTO) throws BourseException;
    BourseDTO getBourseById(Long idBourse) throws BourseException;
    List<BourseDTO> getAllBourse();
    void deletBourse(Long id) throws BourseException;


    //Source

    SourceDTO save(SourceDTO sourceDTO);
    SourceDTO update(SourceDTO sourceDTO) throws SourceException;
    SourceDTO getSourceById(Long idSource) throws SourceException, BourseException;
    List<SourceDTO> getAllSource();
    void deletSource(Long idSource) throws SourceException;


    //Depence

    DepenceDTO save(DepenceDTO depenceDTO);
    DepenceDTO update(DepenceDTO depenceDTO) throws DepenceException;
    DepenceDTO getDepenceById(Long idDepence) throws DepenceException;
    List<DepenceDTO> getAllDepence();
    void deletDepence(Long idDepence) throws DepenceException;

    //Type Depence

    TypeDepenceDTO save(TypeDepenceDTO typeDepenceDTO);
    TypeDepenceDTO update(TypeDepenceDTO typeDepenceDTO) throws TypeDepenceException;
    TypeDepenceDTO getTypeDepenceById(Long idTypeDepence) throws TypeDepenceException;
    List<TypeDepenceDTO>  getAllTypeDepence();
    void deletTypeDepenceDTO(Long idTypeDepence) throws TypeDepenceException;



}
