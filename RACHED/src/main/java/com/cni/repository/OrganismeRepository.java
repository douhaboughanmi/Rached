package com.cni.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cni.entity.organisme;

public interface OrganismeRepository extends CrudRepository<organisme, Long> {

	List<organisme>findAll();

void insertOrganisme(organisme orga);
void updateOrganismee(organisme orga);
void executeUpdateOrganisme(organisme orga);
public void deleteOrganisme(organisme orga);
	 
}
