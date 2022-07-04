package com.pagos.sandisnet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagos.sandisnet.models.Operaciones;
import com.pagos.sandisnet.repository.OperacionesRepository;
import com.pagos.sandisnet.service.IOperacionesService;

@Service
public class IOperacionesServiceImpl implements IOperacionesService {
	
	@Autowired
	private OperacionesRepository operacionesRepository;

	@Override
	public List<Operaciones> listarIngresos() {
		return operacionesRepository.findAll().stream().filter(operacion-> operacion.equals("1")).collect(Collectors.toList());
	}

	@Override
	public List<Operaciones> listarEgresos() {
		return operacionesRepository.findAll().stream().filter(operacion-> operacion.equals("2")).collect(Collectors.toList());
	}

	@Override
	public Operaciones registrarOperacion(Operaciones operacion) {
		return operacionesRepository.save(operacion);
	}
}
