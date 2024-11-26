package br.sp.gov.fatec.ubs.backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository
extends JpaRepository<PacienteEntity, Integer> { 

     @Query(value = "select * from cesta where codigoCliente=?1 ",  nativeQuery = true)
    List<PacienteEntity> carregaCestaCliente(int codigoCliente);
}

