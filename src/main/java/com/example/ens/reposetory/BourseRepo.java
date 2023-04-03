package com.example.ens.reposetory;

import com.example.ens.entities.Bourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BourseRepo extends JpaRepository<Bourse,Long> {

    List<Bourse> findAllBysource_id(Long id);
}
