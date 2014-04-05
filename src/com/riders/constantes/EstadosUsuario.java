package com.riders.constantes;

import java.util.HashMap;

public class EstadosUsuario {

	public static Integer NUEVO = 1;
	public static Integer DEUDOR = 2;
	public static Integer ACTIVO = 3;
	public static Integer INACTIVO = 4;
	
	private HashMap<Integer, String> map = new HashMap<Integer, String>();

	public EstadosUsuario() {
		super();
	
		map.put(NUEVO, "NUEVO");
		map.put(DEUDOR, "DEUDOR");
		map.put(ACTIVO, "ACTIVO");
		map.put(INACTIVO, "INACTIVO");
		
	}
	
	public String get(Integer value){
		return map.get(value);
	}
	
	
	
}
