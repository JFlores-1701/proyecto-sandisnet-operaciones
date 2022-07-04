package com.pagos.sandisnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pagos.sandisnet.models.Operaciones;

@Repository
public interface OperacionesRepository extends JpaRepository<Operaciones, Integer> {

}
