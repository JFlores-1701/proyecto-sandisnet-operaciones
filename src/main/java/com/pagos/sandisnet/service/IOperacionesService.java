package com.pagos.sandisnet.service;

import java.util.List;

import com.pagos.sandisnet.models.Operaciones;

public interface IOperacionesService {
	
	public Operaciones registrarOperacion(Operaciones operacion);

	public List<Operaciones> listarIngresos();

	public List<Operaciones> listarEgresos();
}
