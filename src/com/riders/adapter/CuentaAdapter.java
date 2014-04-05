package com.riders.adapter;

import com.riders.model.CuentaCorriente;
import com.riders.vos.CuentaCorrienteVO;

public class CuentaAdapter {

	public static CuentaCorrienteVO convert(CuentaCorriente cuenta){
	
		CuentaCorrienteVO cuentaVO = new CuentaCorrienteVO();
		
		cuentaVO.setDebe_total(cuenta.getDebeTotal());
//		cuentaVO.setFactura(cuenta.getFactura());
		
		return cuentaVO;
		
	}
	
	public static CuentaCorriente convert(CuentaCorrienteVO cuentaVO){
		
		CuentaCorriente cuenta = new CuentaCorriente();
		
		cuenta.setDebeTotal(cuentaVO.getDebeTotal());
//		cuentaVO.setFactura(cuenta.getFactura());
		
		return cuenta;
		
	}
	
}
