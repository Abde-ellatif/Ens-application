package com.example.ens.service;

import com.example.ens.dto.BourseDTO;
import com.example.ens.dto.DepenceDTO;
import com.example.ens.dto.SourceDTO;
import com.example.ens.dto.TypeDepenceDTO;
import com.example.ens.entities.Bourse;
import com.example.ens.entities.Depence;
import com.example.ens.entities.Source;
import com.example.ens.entities.TypeDepence;
import com.example.ens.exception.BourseException;
import com.example.ens.exception.DepenceException;
import com.example.ens.exception.SourceException;
import com.example.ens.exception.TypeDepenceException;
import com.example.ens.mapper.IBourseMapper;
import com.example.ens.reposetory.BourseRepo;
import com.example.ens.reposetory.DepenceRepo;
import com.example.ens.reposetory.SourceRepo;
import com.example.ens.reposetory.TypeDepenceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BourseService implements IBourceService{

    BourseRepo bourseRepo;
    IBourseMapper bourseMapper;
    @Override
    public BourseDTO save(BourseDTO bourseDTO) {
        Bourse save = bourseRepo.save(bourseMapper.fromBourseDTO(bourseDTO));
        return bourseMapper.fromBourse(save);
    }

    @Override
    public BourseDTO update(BourseDTO bourseDTO) throws BourseException {
        Bourse save = bourseRepo.save(bourseMapper.fromBourseDTO(bourseDTO));
        return bourseMapper.fromBourse(save);
    }

    @Override
    public BourseDTO getBourseById(Long idBourse ) throws BourseException {
        Bourse bourse = bourseRepo.findById(idBourse).orElseThrow(() -> {
            return new BourseException("bourse not found");
        });
        BourseDTO bourseDTO = bourseMapper.fromBourse(bourse);
        return bourseDTO;
    }

    @Override
    public List<BourseDTO> getAllBourse() {
        Bourse bourse = (Bourse) bourseRepo.findAll();
        BourseDTO bourseDTO= bourseMapper.fromBourse(bourse);
        return (List<BourseDTO>) bourse;
    }

    @Override
    public void deletBourse(Long id) throws BourseException {
        Bourse bourse = null; try {
            bourseRepo.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("bourse not found");
        }
        BourseDTO bourseDTO = bourseMapper.fromBourse(bourse);

    }
    SourceRepo sourceRepo;

    @Override
    public SourceDTO save(SourceDTO sourceDTO) {
        Source save = sourceRepo.save(bourseMapper.fromSourceDTO(sourceDTO));
        return bourseMapper.fromSource(save);
    }

    @Override
    public SourceDTO update(SourceDTO sourceDTO) throws SourceException {
        Source save = sourceRepo.save(bourseMapper.fromSourceDTO(sourceDTO));
        return bourseMapper.fromSource(save);
    }

    @Override
    public SourceDTO getSourceById(Long id) throws SourceException {
        Source source = sourceRepo.findById(id).orElseThrow(() -> {
            return new SourceException("source not found");
        });
        SourceDTO sourceDTO = bourseMapper.fromSource(source);
        return sourceDTO;
    }

    @Override
    public List<SourceDTO> getAllSource() {
        Source source = (Source) bourseRepo.findAll();
        SourceDTO sourceDTO= bourseMapper.fromSource(source);
        return (List<SourceDTO>) source;
    }

    @Override
    public void deletSource(Long id) throws SourceException {
        Source source = null; try {
            sourceRepo.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("source not found");
        }
        SourceDTO sourceDTO = bourseMapper.fromSource(source);

    }
    DepenceRepo depenceRepo;
    @Override
    public DepenceDTO save(DepenceDTO depenceDTO) {
        Depence save = depenceRepo.save(bourseMapper.fromDepenceDTO(depenceDTO));
        return bourseMapper.fromDepence(save);
    }

    @Override
    public DepenceDTO update(DepenceDTO depenceDTO) throws DepenceException {
        Depence save = depenceRepo.save(bourseMapper.fromDepenceDTO(depenceDTO));
        return bourseMapper.fromDepence(save);
    }

    @Override
    public DepenceDTO getDepenceById(Long id) throws DepenceException {
        Depence depence = depenceRepo.findById(id).orElseThrow(() -> {
            return new DepenceException("depence not found");
        });
        DepenceDTO depenceDTO = bourseMapper.fromDepence(depence);
        return depenceDTO;
    }

    @Override
    public List<DepenceDTO> getAllDepence() {
        Depence depence = (Depence) depenceRepo.findAll();
        DepenceDTO depenceDTO= bourseMapper.fromDepence(depence);
        return (List<DepenceDTO>) depence;
    }

    @Override
    public void  deletDepence(Long id) throws DepenceException {
        Depence depence = null; try {
            depenceRepo.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("depence not found");
        }
        DepenceDTO depenceDTO = bourseMapper.fromDepence(depence);

    }
    TypeDepenceRepo typeDepenceRepo;
    @Override
    public TypeDepenceDTO save(TypeDepenceDTO typeDepenceDTO) {
        TypeDepence save = typeDepenceRepo.save(bourseMapper.fromTypeDepenceDTO(typeDepenceDTO));
        return bourseMapper.fromTypeDepence(save);
    }

    @Override
    public TypeDepenceDTO update(TypeDepenceDTO typeDepenceDTO) throws TypeDepenceException {
        TypeDepence save = typeDepenceRepo.save(bourseMapper.fromTypeDepenceDTO(typeDepenceDTO));
        return bourseMapper.fromTypeDepence(save);
    }

    @Override
    public TypeDepenceDTO getTypeDepenceById(Long id) throws TypeDepenceException {
        TypeDepence typeDepence = typeDepenceRepo.findById(id).orElseThrow(() -> {
            return new TypeDepenceException("source not found");
        });
        TypeDepenceDTO typeDepenceDTO = bourseMapper.fromTypeDepence(typeDepence);
        return typeDepenceDTO;
    }

    @Override
    public List<TypeDepenceDTO> getAllTypeDepence() {
        TypeDepence typeDepence = (TypeDepence) typeDepenceRepo.findAll();
        TypeDepenceDTO typeDepenceDTO= bourseMapper.fromTypeDepence(typeDepence);
        return (List<TypeDepenceDTO>) typeDepence;
    }

    @Override
    public void deletTypeDepenceDTO(Long id) throws TypeDepenceException {
        TypeDepence typeDepence = null; try {
            typeDepenceRepo.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("depence not found");
        }
        TypeDepenceDTO typeDepenceDTO = bourseMapper.fromTypeDepence(typeDepence);

    }
}
