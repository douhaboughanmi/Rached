package com.cni.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class type_organisme  implements Serializable{
	
	
	   @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id_typ;
		private String libelle_l_typ;
		private String libelle_c_typ;
		
		
		
		
		@OneToMany(mappedBy="typeorganisme",fetch=FetchType.EAGER )
		private List<organisme>ListOrganisme;
		
		
		
		
		
		
		public int getId_typ() {
			return id_typ;
		}
		public void setId_typ(int id_typ) {
			this.id_typ = id_typ;
		}
		public String getLibelle_l_typ() {
			return libelle_l_typ;
		}
		public void setLibelle_l_typ(String libelle_l_typ) {
			this.libelle_l_typ = libelle_l_typ;
		}
		public String getLibelle_c_typ() {
			return libelle_c_typ;
		}
		public void setLibelle_c_typ(String libelle_c_typ) {
			this.libelle_c_typ = libelle_c_typ;
		}
		public List<organisme> getListOrganisme() {
			return ListOrganisme;
		}
		public void setListOrganisme(List<organisme> listOrganisme) {
			ListOrganisme = listOrganisme;
		}
		
		
		
		
		
		

}
