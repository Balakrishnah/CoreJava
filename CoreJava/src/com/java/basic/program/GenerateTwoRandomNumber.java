package com.java.basic.program;

public class GenerateTwoRandomNumber {
	
		  public static void main(String[] args) {
		    // It will generate random number between 0 and 50
		   System.out.println((int) (Math.random() * 50));
		    /*
		     * Below code will generate random number
		     * between 10 and 50. ((int)
		     * (Math.random()*(maximum - minimum))) +
		     * minimum
		     * 
		     * This is simple tweak which is used
		     * here. First we generate random number
		     * between 0 and (maximum - minimum)(40 in
		     * current scenario) and then adding
		     * minimum number after random number gets
		     * generated.
		     * 
		     */
		   System.out.println(
		        ((int) (Math.random() * (50 - 10))) + 10);
		    
		    /* This another way to Generate random number
		     Random randomObj = new Random();                                  
		    int randomNum = randomObj.nextInt((50 - 10)) + 10;
		    System.out.println(randomNum);*/
		  }
		}