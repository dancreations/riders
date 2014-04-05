package com.riders.adapter;

import com.riders.model.Domicilio;
import com.riders.vos.DomicilioVO;

public class DomicilioAdapter {

	public static DomicilioVO convert(Domicilio domicilio) {

		DomicilioVO domicilioVO = new DomicilioVO();

		domicilioVO.setCalle(domicilio.getCalle());
		domicilioVO.setNumero(domicilio.getNumero());
		domicilioVO.setProvincia(domicilio.getProvincia());
		domicilioVO.setLocalidad(domicilio.getLocalidad());
		domicilioVO.setCodigoPostal(domicilio.getCodigoPostal());

		return domicilioVO;

	}
	
	public static Domicilio convert(DomicilioVO domicilioVO) {

		Domicilio domicilio = new Domicilio();

		domicilio.setCalle(domicilioVO.getCalle());
		domicilio.setNumero(domicilioVO.getNumero());
		domicilio.setProvincia(domicilioVO.getProvincia());
		domicilio.setLocalidad(domicilioVO.getLocalidad());
		domicilio.setCodigoPostal(domicilioVO.getCodigoPostal());

		return domicilio;

	}

}
