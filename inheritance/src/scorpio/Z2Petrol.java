package scorpio;

public class Z2Petrol extends ScorpioN {

	
	public Z2Petrol(int airBags, int seatingCapacity, String transmission, double price, double insurance,
			double roadTax, double maxPower, boolean touchScreenInfotainment, boolean secondRowACVents,
			boolean ledTurnIndicator, boolean pentalinkSuspension) {
		
		super(airBags, seatingCapacity, transmission, price, insurance, roadTax, maxPower, touchScreenInfotainment,
				secondRowACVents, ledTurnIndicator, pentalinkSuspension);
		
	}

	@Override
	public double calculatePrice () {
		return this.price + this.insurance + this.roadTax;
	}
}
