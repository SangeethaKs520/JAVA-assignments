/*Create an Interface Instrument which has play as a method. Create three classes from 
Instrument which is Piano, Flute, and Guitar. Override the play
Method inside all three classes, printing a message
“Piano is playing pee peee peee ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin tin ” for Guitar class
Create an array of 10 Instruments. Assign different type of instrument to Instrument reference. 
Check for the polymorphic behavior of play method. */

package assign3;

public interface Instrument {
	void play();
}
	class Piano implements Instrument{
		
		public void play(){
			System.out.println("Piano is playing pee peee peee");
		}
		
	}
	
	class Guitar implements Instrument{
		public void play(){
			System.out.println("Guitar is playing tin tin tin tin");
		}
		
	}
	
	class Flute implements Instrument {
		public void play(){
			System.out.println("Flute is playing toot toot toot toot");
		}
		
	}
	
	class Tester1{
		public static void main(String[] args){
			Instrument[] instrument = new Instrument[10];
			
			 instrument[1] = new Piano();
			 instrument[2] = new Guitar();
			 instrument[3] = new Flute();
			 instrument[4] = new Piano();
			 instrument[5] = new Guitar();
			 instrument[6] = new Piano();
			 
			 for(int i=1;i<7;i++){
				 instrument[i].play();
			 }
			 
			 
			 
			
		}
	}


