package com.micompu.cliente.clienteot;

import java.util.List;

import org.micomupu.ot.service.Equipo;
import org.micomupu.ot.service.Trabajo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClienteOrdenTrabajo cte = new ClienteOrdenTrabajo();
		if (args[0].equals( "ingresar")) {
			Trabajo ot= new Trabajo();
			Equipo equipoIngreso= new Equipo();
			equipoIngreso.setMarca(args[1]);
			equipoIngreso.setModelo(args[2]);
			equipoIngreso.setNumeroSerie(args[3]);
			ot.setEquipoIngreso(equipoIngreso);
			ot.setCausaIngreso(args[4]);
			ot.setPersonaIngreso(args[5]);
			ot.setFechaIngreso("01/03/2020");
			ot.setFechaEntrega("PENDIENTE");
			ot.setPersonaAtiende("BRENDA");
			cte.ingresarOrden(ot);
		}else if (args[0].equals("consultarTodo")) {
			List<Trabajo> lista=cte.consultarOrdenTrabajo();
			for (Trabajo trabajo : lista) {
				System.out.println("Equipo ingreso: "+
						trabajo.getEquipoIngreso().getModelo()+" "+
						trabajo.getEquipoIngreso().getMarca()+" "+
						trabajo.getEquipoIngreso().getNumeroSerie());
			}
		}

	}
}
