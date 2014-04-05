package com.riders.errors;

import javax.faces.application.Application;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.sun.faces.application.ActionListenerImpl;

public class ExceptionHandlingActionListener extends ActionListenerImpl
		implements ActionListener {

	public void handleBeanAction(ActionEvent event) {
		try {
			super.processAction(event);
		} catch (Exception exception) {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			Application application = facesContext.getApplication();
			NavigationHandler navigationHandler = application
					.getNavigationHandler();
			navigationHandler.handleNavigation(facesContext, null,
					"exceptionOccured");
			facesContext.renderResponse();
		}
	}

}
