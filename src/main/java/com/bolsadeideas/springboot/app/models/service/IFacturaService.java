package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Factura;

public interface IFacturaService {

	public Factura findFacturaById(Long id);
	
	public void save(Factura factura);
	
	public void deleteFactura(Long id);
}
