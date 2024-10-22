package com.ruleengine.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ruleengine.Node;

@WebServlet("/evaluate_rule")
public class EvaluateRuleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonAst = request.getParameter("ast");
        String jsonData = request.getParameter("data");
        
        // Parse JSON to Node and attributes map
        Node ast = new Gson().fromJson(jsonAst, Node.class);
        Map<String, Object> data = new Gson().fromJson(jsonData, Map.class);
        
        boolean result = evaluateRule(ast, data);
        
        response.setContentType("application/json");
        response.getWriter().write("{\"result\":" + result + "}");
    }

    private boolean evaluateRule(Node ast, Map<String, Object> data) {
        // Logic to evaluate the AST against the provided data
        return true; // Placeholder implementation
    }
}

