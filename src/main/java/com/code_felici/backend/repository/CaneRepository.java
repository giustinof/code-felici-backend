package com.code_felici.backend.repository;

import com.code_felici.backend.model.Cane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaneRepository extends JpaRepository<Cane, Long> {
}
