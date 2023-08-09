package com.demo;
public class Duck {

	static {
		System.out.println("This is static block..");
	}
    private static int duckCount=0;

    private String duckName="";

    public Duck(String name){
        this.duckName=name;
        duckCount++;
    }

    public String getDuckName(){
        return "I am "+this.duckName+" we are total "+this.duckCount;
    }

    public static int getDuckCount(){
       // getDuckName();
        return duckCount;
    }
}
