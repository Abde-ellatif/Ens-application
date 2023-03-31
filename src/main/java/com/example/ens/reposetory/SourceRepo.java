package com.example.ens.reposetory;

import com.example.ens.entities.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepo extends JpaRepository<Source,Long> {
}
