package scorpio;

public class Z4Petrol  extends Z2Petrol {

	private boolean androidAuto;
	private boolean appleCarPlay;
	private boolean cruiseControl;
	private boolean fabricUpholstery;
	
	public Z4Petrol(int airBags, int seatingCapacity, String transmission, double price, double insurance,
			double roadTax, double maxPower, boolean touchScreenInfotainment, boolean secondRowACVents,
			boolean ledTurnIndicator, boolean pentalinkSuspension) {
		
		super(airBags, seatingCapacity, transmission, price, insurance, roadTax, maxPower, touchScreenInfotainment,
				secondRowACVents, ledTurnIndicator, pentalinkSuspension);
		
		this.androidAuto = true;
		this.appleCarPlay = true;
		this.cruiseControl = true;
		this.fabricUpholstery = true;
	}
	
	

	public boolean isAndroidAuto() {
		return androidAuto;
	}
	public boolean isAppleCarPlay() {
		return appleCarPlay;
	}

	public boolean isCruiseControl() {
		return cruiseControl;
	}

	public boolean isFabricUpholstery() {
		return fabricUpholstery;
	}


	
@Override
	public double calculatePrice () {
		return this.price + this.insurance + this.roadTax;
	}

	
}
