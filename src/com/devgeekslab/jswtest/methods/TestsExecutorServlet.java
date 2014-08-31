package com.devgeekslab.jswtest.methods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * 
 * This servlet will execute the tests by calling JWSTest engine 
 * and displays back the test results.
 * <p>
 * @author Ankit Singh
 *
 */
@WebServlet(value = "/executeTests", asyncSupported = true)
public class TestsExecutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final static Logger logger = Logger.getLogger(TestsExecutorServlet.class
			.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestsExecutorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
