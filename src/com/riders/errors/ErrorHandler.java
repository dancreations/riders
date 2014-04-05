package com.riders.errors;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ErrorHandler {

	public static void addMessages(String idElement, String messages) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage fMessage = new FacesMessage();
		fMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
		fMessage.setSummary(messages);
		fMessage.setDetail("Validation error");
		context.addMessage(idElement, fMessage);
	}

}
