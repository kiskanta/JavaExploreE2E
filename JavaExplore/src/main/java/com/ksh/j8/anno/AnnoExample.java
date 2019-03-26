package com.ksh.j8.anno;

//Repeating annotation  
@Game(name = "Cricket",  day = "Sunday")  
@Game(name = "Hockey",   day = "Friday")  
@Game(name = "Football", day = "Saturday")  

public class AnnoExample {
	 public static void main(String[] args) {  
	        // Getting annotation by type into an array  
	        Game[] game = AnnoExample.class.getAnnotationsByType(Game.class);
	        
	        Game game3 = AnnoExample.class.getAnnotation(Game.class);
	        System.out.println(game3.name()+" on "+game3.day());
	        for (Game game2 : game) {    // Iterating values  
	            System.out.println(game2.name()+" on "+game2.day());  
	        }  
	    }  
}
