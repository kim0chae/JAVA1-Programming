import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Lighting on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
