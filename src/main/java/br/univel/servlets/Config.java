package br.univel.servlets;

import java.io.IOException;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Config", asyncSupported = true)
@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(interfaceName = "javax.jms.Queue", name = "java:/queue/QueuePedido", destinationName = "MDBQueuePedido"),
		@JMSDestinationDefinition(interfaceName = "javax.jms.Queue", name = "java:/queue/TopicVenda", destinationName = "MDBTopicVenda")})
public class Config extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = -5713489352526154493L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}



}
