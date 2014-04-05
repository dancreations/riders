package com.riders.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
@Qualifier("pagingBacking")
public class PagingBacking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String currentPage = "/pages/main.xhtml";

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	
	public void changePage(String currentPage) {
		this.currentPage = currentPage;
	}

}
