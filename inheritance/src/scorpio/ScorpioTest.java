package scorpio;

public class ScorpioTest {

	public static void main(String[] args) {

		ScorpioN scorpioN;
		scorpioN = new Z2Petrol(4, 7, "Manual", 1365000.00d, 55000.00d,
				10000.00d, 149.14, true, true,  true,  true);
		
		double z2PetrolOnRoadPrice = scorpioN.calculatePrice();
		System.out.println("Z2Petrol On Road Price: " + z2PetrolOnRoadPrice);
		
		System.out.println(
				"AirBags: " + scorpioN.getAirBags() + "\n" +
				"Seating Capacity: " + scorpioN.getSeatingCapacity() + "\n" +
				"Transmission: " + scorpioN.getTransmission() + "\n" +
				"Price: " + scorpioN.getPrice() + "\n" +
				"Insurance: " +scorpioN.getInsurance() + "\n" + 
				"Road Tax: " + scorpioN.getRoadTax() +  "\n" +
				"MaxPower: " + scorpioN.getMaxPower() + "\n" +
				"LedTurnIndicator: " + scorpioN.isLedTurnIndicator() + "\n" +
				"PentalinkSuspension: " + scorpioN.isPentalinkSuspension() + "\n" + 
				"SecondRowACVents: " + scorpioN.isSecondRowACVents() +"\n" +
				"TouchScreenInfotainment: " + scorpioN.isTouchScreenInfotainment()
				);
		
		System.out.println("-------------------------------------------------------------------");
		
		scorpioN = new Z4Petrol(4, 7, "Manual", 1465000.00d, 75000.00d,
				15000.00d, 149.14, true, true,  true,  true);
		
		double z4PetrolOnRoadPrice = scorpioN.calculatePrice();
		System.out.println("Z4Petrol On Road Price: " +  z4PetrolOnRoadPrice);
		
		System.out.println(
				"AirBags: " + scorpioN.getAirBags() +  "\n" +
				"SeatingCapacity: " + scorpioN.getSeatingCapacity()  + "\n" +
				"Transmission: " + scorpioN.getTransmission()  + "\n" +
				"Price: " + scorpioN.getPrice() + "\n" +
				"Insurance: " + scorpioN.getInsurance()  +  "\n" +
				"RoadTax: " + scorpioN.getRoadTax()  + "\n" +
				"MaxPower: " + scorpioN.getMaxPower() + "/n" +
				"LedTurnIndicator: " + scorpioN.isLedTurnIndicator() + "\n" +
				"PentalinkSuspension: " + scorpioN.isPentalinkSuspension()  + "\n" +
				"SecondRowACVents: " + scorpioN.isSecondRowACVents() + "\n" +
				"TouchScreenInfotainment: " + scorpioN.isTouchScreenInfotainment() + "\n" +
				"AndroidAuto: " + ((Z4Petrol) scorpioN).isAndroidAuto() + "\n" +
				"AppleCarPlay: " + ((Z4Petrol) scorpioN).isAppleCarPlay() + "\n" +
				"CruiseControl: " + ((Z4Petrol) scorpioN).isCruiseControl()  + "\n" +
				"FabricUpholstery: " + ((Z4Petrol) scorpioN).isFabricUpholstery()
				);
	}

}
