package com.dio.projetoControleAcesso.repository;

import com.dio.projetoControleAcesso.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
