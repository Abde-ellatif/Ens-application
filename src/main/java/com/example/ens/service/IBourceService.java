package com.example.ens.service;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.dto.req.BourseReq;
import com.example.ens.dto.req.DepenceReq;
import com.example.ens.entities.Bourse;
import com.example.ens.entities.Depence;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.exception.SourceException;
import com.example.ens.exception.TypeDepenceException;

import java.util.List;

public interface IBourceService {

    //Bouse
    BourseDTO saveBourse(BourseReq req) throws SourceException;
    BourseDTO updateBourse(BourseDTO bourseDTO) throws BourseException;
    BourseDTO getBourseById(Long idBourse) throws BourseException;
    //BourseDTO getAllBourseBySource(Long idSource) throws BourseException;
    List<BourseDTO> findAllBysource_id(Long id) throws SourceException;
    List<BourseDTO> getAllBourse();
    void deletBourse(Long id) throws BourseException;
    double sumBourse() throws BourseException;


    //Source

    SourceDTO saveSource(SourceDTO sourceDTO);
    SourceDTO updateSource(SourceDTO sourceDTO) throws SourceException;
    SourceDTO getSourceById(Long idSource) throws SourceException;
    List<SourceDTO> getAllSource();
    void deleteSource(Long idSource) throws SourceException;


    //Depence

    DepenceDTO saveDepence(DepenceReq req) throws BourseException,TypeDepenceException;
    DepenceDTO updateDepence(DepenceDTO depenceDTO) throws DepenceException;
    DepenceDTO getDepenceById(Long idDepence) throws DepenceException;
    List<DepenceDTO> getAllDepence();
    //List<DepenceDTO> getAllDepenceByBourse(Long idBource);
    void deletDepence(Long idDepence) throws DepenceException;
    List<DepenceDTO> findAllByBourse_Id(Long id) throws BourseException;
    List<DepenceDTO> findAllByTypeDepence_Id(Long id) throws TypeDepenceException;
    double sumDepence() throws DepenceException;
    //Type Depence

    TypeDepenceDTO saveTypeDepence(TypeDepenceDTO typeDepenceDTO);
    TypeDepenceDTO updateTypeDepence(TypeDepenceDTO typeDepenceDTO) throws TypeDepenceException;
    TypeDepenceDTO getTypeDepenceById(Long idTypeDepence) throws TypeDepenceException;
    List<TypeDepenceDTO>  getAllTypeDepence();
    void deletTypeDepence(Long idTypeDepence) throws TypeDepenceException;

}
