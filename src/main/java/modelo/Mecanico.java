package modelo;

import java.util.List;

public class Mecanico extends Departamento implements Sistema{

	public Mecanico(int id, List<Trabajador> equipo, String ciudad) {
		super(id, equipo, ciudad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void llamada(TipoPeticion tp, String ciudad) {
		if(this.ciudad.equals(ciudad) 
				&& (tp.equals(TipoPeticion.CocheAccidentado)) || tp.equals(TipoPeticion.ProblemasMecanicos)) {
			
			System.out.println("##Departamento "+this.id+" de Mecanica en la ciudad de "+this.ciudad+
					" ha recibido la notifición y se dirige recepción##");
		}
	}
	
}
