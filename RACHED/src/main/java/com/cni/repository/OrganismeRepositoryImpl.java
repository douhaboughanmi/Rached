package com.cni.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.cni.entity.organisme;

@Repository
public class OrganismeRepositoryImpl implements OrganismeRepository {

	

     public OrganismeRepositoryImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
     }  
     NamedParameterJdbcTemplate template;
	@Override
	public <S extends organisme> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends organisme> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<organisme> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterable<organisme> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(organisme entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends organisme> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<organisme> findAll() {

//return template.query("select * from employee", new EmployeeRowMapper());
		return null;
	}
	@Override
	public void insertOrganisme(organisme orga) {
		 final String sql = "insert into organisme(id_org, libelle_l_org ) values(:id_org,:libelle_l_org)";
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
	.addValue("id_org", orga.getId_org())
	.addValue("employeeAddress", orga.getLibelle_l_org());
	        template.update(sql,param, holder);
		
	}
	@Override
	public void updateOrganismee(organisme orga) {
		final String sql = "update organisme set libelle_l_org=:libelle_l_org, libelle_c_org=:libelle_c_org where id_org=:id_org";
		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("libelle_l_org", orga.getLibelle_l_org()); 
		   
		
	}
	@Override
	public void executeUpdateOrganisme(organisme orga) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteOrganisme(organisme orga) {
		 final String sql = "delete from organisme where id_org=:id_org";
		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("employeeId", orga.getId_org());
		/* template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});  */

		
	}  
	
	
}
