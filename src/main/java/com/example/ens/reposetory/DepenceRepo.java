package com.example.ens.reposetory;

import com.example.ens.entities.Depence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepenceRepo extends JpaRepository<Depence,Long> {

}
