/*Create an Interface Game which is having start, play, and stop methods. Create classes Car, 
Bike, Bicycle by implementing Game interface. Create an array of 10 Games. Generate 10 random 
numbers in the range 1 to 3. If random number is 1 – add Car, 2-add Bike, 3- add Bicyle objects to the 
array. Process the elements from the array and display details of each object.
Hint: to generate the random number use Math class api */

package assign3;

public interface Game {

	void start();
	void play();
	void stop();
}

class Car implements Game{
	public void start(){
		System.out.println("car started");
	}
	
	public void play(){
		System.out.println("car running");
	};
	
	public void stop(){
		System.out.println("car stoped");
	};
}

class Bike implements Game{
	public void start(){
		System.out.println("Bike started");
	}
	
	public void play(){
		System.out.println("Bike running");
	};
	
	public void stop(){
		System.out.println("Bike stoped");
	};
}

class Bicycle implements Game{
	public void start(){
		System.out.println("Bicycle started");
	}
	
	public void play(){
		System.out.println("Bicycle running");
	};
	
	public void stop(){
		System.out.println("Bicycle stoped");
	};
}

class tester2 {
	public static void main(String[] args){
		Game[] games = new Game[10];
		
		for(int i=0;i<10;i++){
			int a  = (int)(Math.random()*(3-1+1)+1);  
			
			if(a == 1){
				games[i] = new Car();
			}
			else if(a==2){
				games[i] = new Bike();
			}
			else{
				games[i] = new Bicycle();
			}
		}
		
		for(int i=0; i<10; i++){
			games[i].start();
			games[i].play();
			games[i].stop();
		}
		
		
	}
}
