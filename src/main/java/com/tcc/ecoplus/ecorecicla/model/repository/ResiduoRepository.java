package com.tcc.ecoplus.ecorecicla.model.repository;


import com.tcc.ecoplus.ecorecicla.model.entity.Residuo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResiduoRepository extends JpaRepository<Residuo, Long> {


}