package modelo;

import java.util.List;

public class ChapaPintura extends Departamento implements Sistema{

	public ChapaPintura(int id, List<Trabajador> equipo, String ciudad) {
		super(id, equipo, ciudad);
		
	}

	@Override
	public void llamada(TipoPeticion tp, String ciudad) {
		if(this.ciudad.equals(ciudad) 
				&& (tp.equals(TipoPeticion.CocheAccidentado))) {
			
			System.out.println("##Departamento "+this.id+" de Chapa y Pintura en la ciudad de "+this.ciudad+
					" ha recibido la notifición y se dirige recepción##");
		}
	}
	
}
