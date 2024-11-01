package com.example.cliente.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String sobrenme;
	@Column(unique = true, nullable = false)
	private String email;
	private Date criado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenme() {
		return sobrenme;
	}
	public void setSobrenme(String sobrenme) {
		this.sobrenme = sobrenme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCriado() {
		return criado;
	}
	public void setCriado(Date criado) {
		this.criado = criado;
	}
	
	
}
