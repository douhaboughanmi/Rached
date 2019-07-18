package com.cni.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organisme")
public class organisme implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_org;
	
	@Column(name ="libelle_l_org")
	private String libelle_l_org;
	
	@Column(name ="libelle_c_org")
	private String libelle_c_org;
	
	@Column(name ="adresse_org")
	private String adresse_org;
	
	@Column(name ="tel_org")
	private int tel_org;
	
	@ManyToOne
	private type_organisme typeorganisme;
	
	
	public int getId_org() {
		return id_org;
	}
	public void setId_org(int id_org) {
		this.id_org = id_org;
	}
	public String getLibelle_l_org() {
		return libelle_l_org;
	}
	public void setLibelle_l_org(String libelle_l_org) {
		this.libelle_l_org = libelle_l_org;
	}
	public String Libelle_c_org() {
		return libelle_c_org;
	}
	public void setlibelle_c_org(String libelle_c_org) {
		this.libelle_c_org = libelle_c_org;
	}
	public String getAdresse_org() {
		return adresse_org;
	}
	public void setAdresse_org(String adresse_org) {
		this.adresse_org = adresse_org;
	}
	public int getTel_org() {
		return tel_org;
	}
	public void setTel_org(int tel_org) {
		this.tel_org = tel_org;
	}
	public type_organisme getTypeorganisme() {
		return typeorganisme;
	}
	public void setTypeorganisme(type_organisme typeorganisme) {
		this.typeorganisme = typeorganisme;
	}
	public organisme(int id_org, String libelle_l_org) {
		super();
		this.id_org = id_org;
		this.libelle_l_org = libelle_l_org;
	}
	@Override
	public String toString() {
		return "organisme [id_org=" + id_org + ", libelle_l_org=" + libelle_l_org + ", libelle_c_org=" + libelle_c_org
				+ ", adresse_org=" + adresse_org + ", tel_org=" + tel_org + "]";
	}
	
	
	
}

