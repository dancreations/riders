package com.riders.spring.util;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
public class DebugPhaseListener implements PhaseListener {

	private Logger logger = Logger.getLogger(this.getClass());
	
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {
//    	logger.trace("Start phase " + event.getPhaseId());
    	
    	if (event.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {
    		Iterator<String> i = FacesContext.getCurrentInstance().getClientIdsWithMessages();
    		
    		while (i.hasNext()) {
    			String clientId = i.next();
    			logger.debug("Client id with message: " + clientId);
    			
    			Iterator<FacesMessage> messages = FacesContext.getCurrentInstance().getMessages(clientId);
    			
    			while (messages.hasNext()) {
    				logger.debug("Message: " + messages.next().getSummary());
    			}
    		}
    	}
    }

    public void afterPhase(PhaseEvent event) {
//    	logger.trace("End phase " + event.getPhaseId());
    }
}