package com.micompu.cliente.clienteot;

import java.util.List;

import org.micomupu.ot.service.OrdenService;
import org.micomupu.ot.service.OrdenServiceImplService;
import org.micomupu.ot.service.Trabajo;


public class ClienteOrdenTrabajo {
	private OrdenService os;

	public Trabajo ingresarOrden(Trabajo ot) {
		os=new OrdenServiceImplService().getOrdenServiceImplPort();
		return os.ingresarOrden(ot) ;
	}

	public List<Trabajo> consultarOrdenTrabajo() {
		os=new OrdenServiceImplService().getOrdenServiceImplPort();
		return os.consultarOrdenTrabajo();
	}
	
}
