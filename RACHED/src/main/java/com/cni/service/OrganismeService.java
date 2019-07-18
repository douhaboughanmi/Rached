package com.cni.service;

import java.util.List;

import com.cni.entity.organisme;

public interface OrganismeService {

	public List<organisme> getAllorOrganismes();
	
	public organisme getByidOrganisme(Long id);
	
	public void saveorUpdate(organisme organ);
	
	public void deleteOrganisme(Long id);
}
