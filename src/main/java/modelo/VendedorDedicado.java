package modelo;

import java.util.List;

public class VendedorDedicado extends Departamento implements Sistema{

	public VendedorDedicado(int id, List<Trabajador> equipo, String ciudad) {
		super(id, equipo, ciudad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void llamada(TipoPeticion tp, String ciudad) {
		if(this.ciudad.equals(ciudad) 
				&& (tp.equals(TipoPeticion.CocheAccidentado)) || tp.equals(TipoPeticion.ProblemasMecanicos)
				|| tp.equals(TipoPeticion.NuevoComprador)) {
			
			System.out.println("##Departamento "+this.id+" de Vendedor Dedicado en la ciudad de "+this.ciudad+
					" ha recibido la notifición y se dirige recepcion##");
		}
	}

}
