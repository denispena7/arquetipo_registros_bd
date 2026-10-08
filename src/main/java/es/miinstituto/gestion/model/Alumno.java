package es.miinstituto.gestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "alumnos")
public class Alumno 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "telefono", nullable = false)
	private int telefono;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	
	public Alumno() {}
	
	public Alumno(Long id, String nombre, String apellidos, String email, int telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	// Getters y Setters
	public Long getId() {return id;}
	
	public void setId(Long id) { this.id = id;}
	
	public String getNombre() {return nombre;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getApellidos() {return apellidos;}
	
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public int getTelefono() {return telefono;}

	public void setTelefono(int telefono) {this.telefono = telefono;}

	public String getDireccion() {return direccion;}

	public void setDireccion(String direccion) {this.direccion = direccion;}
}
