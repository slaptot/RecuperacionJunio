package modelo;

import java.util.List;

public abstract class Departamento implements Sistema{

	protected int id;
	protected String tipoDepartamento;
	protected List<Trabajador> equipo;
	protected String ciudad;
	
	
	public Departamento(int id, List<Trabajador> equipo, String ciudad) {
		super();
		this.id = id;
		this.equipo = equipo;
		this.ciudad = ciudad;
	}
	
	
	public void llamada(TipoPeticion tp, String ciudad) {};

}
