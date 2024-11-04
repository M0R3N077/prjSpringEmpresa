package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long funCodigo;
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String nome;
	@Size(min=8,message="minimo de 8 caracteres")
	private String data;
	private double salario;
	
	@ManyToOne
	@JoinColumn(name = "departamento_cod")
	private Departamento departamento;
	
	
	
	//metodos getts e setts
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getFuncodigo() {
		return funCodigo;
	}
	public void setFunCodigo(Long funCodigo) {
		this.funCodigo = funCodigo;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}	
	
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	


}
