package classwork_9_19_22;

public class car {


		// TODO Auto-generated method stub
		String color;
		String make;
		String model;
		String bodyType;
		int year;
		double speed;
		
		
		int carState = 0; //car off
		
		void start() {
			carState = 1; //car idling
		}
		
		void accelerate(double inputForce) {
			if(carState != 0) {
				carState = 2; //car accel
				speed += inputForce *2;
			}
			
		}
		
		void slowDown(double inputForce) {
			speed -= inputForce *2;
			if(speed <= 0) {
				carState = 1;
				speed = 0;
			}
		}
		
		


}
