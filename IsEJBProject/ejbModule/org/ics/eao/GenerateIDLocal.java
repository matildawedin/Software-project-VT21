package org.ics.eao;

import javax.ejb.Local;

@Local
public interface GenerateIDLocal {
	public String generateID(String type);
}
