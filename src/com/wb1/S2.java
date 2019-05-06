package com.wb1;

class S2 {//this to pass as an argument
	  
		  void m(S2 obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
		  public static void main(String args[]){  
		  S2 s1 = new S2();  
		  s1.p();  
		  }  
		}  


