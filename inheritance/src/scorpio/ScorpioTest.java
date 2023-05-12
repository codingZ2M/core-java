package scorpio;

public class ScorpioTest {

	public static void main(String[] args) {

		Z2Petrol z2Petrol = new Z2Petrol(4, 7, "Manual", 1365000.00d, 55000.00d,
				10000.00d, 149.14, true, true,  true,  true);
		
		double z2PetrolOnRoadPrice = z2Petrol.calculatePrice();
		System.out.println("Z2Petrol On Road Price: " + z2PetrolOnRoadPrice);
		
		System.out.println(
				"AirBags: " + z2Petrol.getAirBags() + "\n" +
				"Seating Capacity: " + z2Petrol.getSeatingCapacity() + "\n" +
				"Transmission: " + z2Petrol.getTransmission() + "\n" +
				"Price: " + z2Petrol.getPrice() + "\n" +
				"Insurance: " +z2Petrol.getInsurance() + "\n" + 
				"Road Tax: " + z2Petrol.getRoadTax() +  "\n" +
				"MaxPower: " + z2Petrol.getMaxPower() + "\n" +
				"LedTurnIndicator: " + z2Petrol.isLedTurnIndicator() + "\n" +
				"PentalinkSuspension: " + z2Petrol.isPentalinkSuspension() + "\n" + 
				"SecondRowACVents: " + z2Petrol.isSecondRowACVents() +"\n" +
				"TouchScreenInfotainment: " + z2Petrol.isTouchScreenInfotainment()
				);
		
		System.out.println("-------------------------------------------------------------------");
		
		Z4Petrol z4Petrol = new Z4Petrol(4, 7, "Manual", 1465000.00d, 75000.00d,
				15000.00d, 149.14, true, true,  true,  true);
		
		double z4PetrolOnRoadPrice = z4Petrol.calculatePrice();
		System.out.println("Z4Petrol On Road Price: " +  z4PetrolOnRoadPrice);
		
		System.out.println(
				"AirBags: " + z4Petrol.getAirBags() +  "\n" +
				"SeatingCapacity: " + z4Petrol.getSeatingCapacity()  + "\n" +
				"Transmission: " + z4Petrol.getTransmission()  + "\n" +
				"Price: " + z4Petrol.getPrice() + "\n" +
				"Insurance: " + z4Petrol.getInsurance()  +  "\n" +
				"RoadTax: " + z4Petrol.getRoadTax()  + "\n" +
				"MaxPower: " + z4Petrol.getMaxPower() + "/n" +
				"LedTurnIndicator: " + z4Petrol.isLedTurnIndicator() + "\n" +
				"PentalinkSuspension: " + z4Petrol.isPentalinkSuspension()  + "\n" +
				"SecondRowACVents: " + z4Petrol.isSecondRowACVents() + "\n" +
				"TouchScreenInfotainment: " + z4Petrol.isTouchScreenInfotainment() + "\n" +
				"AndroidAuto: " + z4Petrol.isAndroidAuto() + "\n" +
				"AppleCarPlay: " + z4Petrol.isAppleCarPlay() + "\n" +
				"CruiseControl: " + z4Petrol.isCruiseControl()  + "\n" +
				"FabricUpholstery: " + z4Petrol.isFabricUpholstery()
				);
	}

}
