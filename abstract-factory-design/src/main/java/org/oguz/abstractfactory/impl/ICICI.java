package org.oguz.abstractfactory.impl;

import org.oguz.abstractfactory.Bank;

public class ICICI implements Bank{
	
	private final String BNAME;
	public ICICI() {
		BNAME ="ICICI BANK";
	}

	@Override
	public String getBankName() {
		return BNAME; 
	}

}
