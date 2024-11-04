package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depCodigo;
	@Size(min=8,message="minimo de 8 caracteres")
	private String nome;
	
	public Long getDepCodigo() {
		return depCodigo;
	}
	
	public void setDepCodigo(Long depCodigo) {
		this.depCodigo=depCodigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	


}
