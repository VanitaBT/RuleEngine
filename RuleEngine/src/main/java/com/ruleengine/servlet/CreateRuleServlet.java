package com.ruleengine.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ruleengine.Node;

@WebServlet("/create_rule")
	public class CreateRuleServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String ruleString = request.getParameter("rule_string");
	        Node ast = createRule(ruleString);
	        
	        // Convert AST to JSON and return
	        Gson gson = new Gson();
	        String jsonAst = gson.toJson(ast);
	        response.setContentType("application/json");
	        response.getWriter().write(jsonAst);
	    }

	    private Node createRule(String ruleString) {
	        // Logic to parse ruleString and create AST
	        // This would involve tokenizing the string and creating Node objects
	        return new Node("dummy", null); // Placeholder implementation
	    }
	}



