package com.devgeekslab.jswtest.utils;

import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class JWSTestOperationUtils {

	private final static Logger logger = Logger.getLogger(JWSTestOperationUtils.class
			.getName());

	/**
	 * Gets the BeanManager through JNDI using initialContext
	 * lookup
	 * @return BeanManager
	 */
	public static BeanManager getBeanManager() {
		try {
			InitialContext ic = new InitialContext();
			return (BeanManager) ic.lookup("java:comp/BeanManager");
		} catch (NamingException e) {
			logger.info("Cannot find BeanManager");
			return null;
		}
	}
	
}
