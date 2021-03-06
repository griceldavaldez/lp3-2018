package py.edu.uca.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesional extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 300980297943482450L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Profesional() {
		super();
	}

	public Profesional(String nombre, String apellido, Integer ci, String titulo) {
		super(nombre, apellido, ci);
		this.titulo = titulo;
	}

}
