package com.wb1;

 class test123 {
	  
		int rollno;  
		String name;  
		float fee;  
		test123()
		{
			System.out.println("hello world!!");
		}
		test123(int rollno,String name,float fee){  
			this();
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		}  
		void anu()
		{
			System.out.println("hi anu");
		}
		void display(){
			this.anu();//invoking current class method
		System.out.println(rollno+" "+name+" "+fee);
		
		}  
		  

		public static void main(String args[])
		{  
		test123 s1=new test123(111,"ankit",5000f);  
		test123 s2=new test123(112,"sumit",6000f); 
		s1.display();  
		s2.display();  
		}
		}

