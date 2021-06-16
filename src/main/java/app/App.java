package app;

import java.util.Arrays;

import builder.DepartamentosBuilder;
import modelo.ChapaPintura;
import modelo.Mecanico;
import modelo.ServicioDepartamentos;
import modelo.Trabajador;
import modelo.VendedorDedicado;

public class App {

	public static void main(String[] args) {
		
		// Creamos todos los trabajadores
		Trabajador uno = new Trabajador(1, "Sergio");
		Trabajador dos = new Trabajador(2, "Sergio");
		Trabajador tres = new Trabajador(3, "Sergio");
		Trabajador cuatro = new Trabajador(4, "Sergio");
		Trabajador cinco = new Trabajador(5, "Sergio");
		Trabajador seis = new Trabajador(6, "Sergio");
		Trabajador siete = new Trabajador(7, "Sergio");
		Trabajador ocho = new Trabajador(8, "Sergio");
		
		// Asignamos trabajadores al departamento mecanico
		Mecanico m1 = DepartamentosBuilder.crearMecanicos(1, Arrays.asList(uno), "Zaragoza");
		Mecanico m2 = DepartamentosBuilder.crearMecanicos(2, Arrays.asList(dos), "Huesca");
		Mecanico m3 = DepartamentosBuilder.crearMecanicos(3, Arrays.asList(tres), "Teruel");
		
		// Asignamos trabajadores al departamento ChapaPintura
		ChapaPintura c1 = DepartamentosBuilder.crearChapaPintura(4, Arrays.asList(cuatro), "Zaragoza");
		ChapaPintura c2 = DepartamentosBuilder.crearChapaPintura(5, Arrays.asList(cinco), "Huesca");
		ChapaPintura c3 = DepartamentosBuilder.crearChapaPintura(6, Arrays.asList(seis), "Teruel");
		
		// Asignamos trabajadores al departamento Vendedores
		VendedorDedicado v1 = DepartamentosBuilder.crearVendedoresDeidicados(7, Arrays.asList(siete), "Zaragoza");
		VendedorDedicado v2 = DepartamentosBuilder.crearVendedoresDeidicados(8, Arrays.asList(ocho), "Teruel");
		
		
		
		
	}

}
