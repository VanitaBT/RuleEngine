package com.ruleengine;

public class Node {
	    String type; // "operator" or "operand"
	    Node left; // left child
	    Node right; // right child
	    String value; // Optional value for operand nodes

	    public Node(String type, String value) {
	        this.type = type;
	        this.value = value;
	        this.left = null;
	        this.right = null;
	    }
	}



