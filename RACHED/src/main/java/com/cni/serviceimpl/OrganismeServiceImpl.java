package com.cni.serviceimpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cni.entity.organisme;
import com.cni.repository.OrganismeRepository;
import com.cni.service.OrganismeService;

@Service
@Transactional
public class OrganismeServiceImpl implements OrganismeService {

	@Autowired
	OrganismeRepository repository;
	
	@Override
	public List<organisme> getAllorOrganismes() {
		// TODO Auto-generated method stub
		return (List<organisme>)repository.findAll();
	}

	@Override
	public organisme getByidOrganisme(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void saveorUpdate(organisme organ) {
		
 //repository.save(organisme);
	
		
	}

	@Override
	public void deleteOrganisme(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	
}
