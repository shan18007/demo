package com.corona.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.corona.entity.Corona;

@Repository
public interface CoronaRepository extends JpaRepository<Corona, Long> {
	
//	@Query("select c from corona c where c.city=:ct")
//	public Corona findByCity(String ct);
}
