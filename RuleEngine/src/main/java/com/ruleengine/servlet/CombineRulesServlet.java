package com.ruleengine.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ruleengine.Node;

@WebServlet("/combine_rules")
public class CombineRulesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] rules = request.getParameterValues("rules");
        Node combinedAst = combineRules(rules);
        
        // Convert combined AST to JSON and return
        Gson gson = new Gson();
        String jsonAst = gson.toJson(combinedAst);
        response.setContentType("application/json");
        response.getWriter().write(jsonAst);
    }

    private Node combineRules(String[] rules) {
        // Logic to combine multiple ASTs
        return new Node("combined", null); // Placeholder implementation
    }
}

