package builder;

import java.util.List;

import modelo.ChapaPintura;
import modelo.Mecanico;
import modelo.Trabajador;
import modelo.VendedorDedicado;

public class DepartamentosBuilder {

	// Builder del departamento ChapaPintura
	public static ChapaPintura crearChapaPintura(int id, List<Trabajador> equipo, String ciudad) {
		ChapaPintura chapaPintura = null;
		if(equipo.size() == 3) {
			chapaPintura = new ChapaPintura(id, equipo, ciudad);
		}
		
		return chapaPintura;
	}
	
	// Builder del departamento Mecanico
	public static Mecanico crearMecanicos(int id, List<Trabajador> equipo, String ciudad) {
		Mecanico mecanicos = null;
		if(equipo.size() == 3) {
			mecanicos = new Mecanico(id, equipo, ciudad);
		}
		
		return mecanicos;
	}
	
	// Builder del departamento Vendedores
	public static VendedorDedicado crearVendedoresDeidicados(int id, List<Trabajador> equipo, String ciudad) {
		VendedorDedicado vendedorDedicado = null;
		if(equipo.size() == 2) {
			vendedorDedicado = new VendedorDedicado(id, equipo, ciudad);
		}
		
		return vendedorDedicado;
	}
}
