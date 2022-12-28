package com.jadevirek.microservice.repo;

import com.jadevirek.microservice.domain.entities.MedicalTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicalTestRepository extends JpaRepository<MedicalTest,Long> {

}
