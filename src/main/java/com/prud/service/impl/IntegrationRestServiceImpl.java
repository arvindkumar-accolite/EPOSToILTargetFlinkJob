package com.prud.service.impl;

import com.prud.service.ILService;

public class IntegrationRestServiceImpl {
	private ILService iLService = new ILServiceImpl();

	public String createILRequest(String json) {
		if (json.isEmpty())
			System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		else
			System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");

		String soapEnvelop = iLService.serviceRequest(json);
		System.out.println(soapEnvelop);
		return soapEnvelop;
	}
}
