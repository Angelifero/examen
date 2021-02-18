package com.recluit.demo.interfaceService;

import java.util.*;

import com.recluit.demo.modelo.Persona;

public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
