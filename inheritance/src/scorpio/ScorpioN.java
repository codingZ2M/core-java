package scorpio;

public abstract class ScorpioN {

	private int airBags;
	private int seatingCapacity;
	
	private String transmission;
	 double price;
	double insurance;
	 double roadTax;
	private double maxPower;

	private boolean touchScreenInfotainment;
	private boolean secondRowACVents;
	private boolean ledTurnIndicator;
	private boolean pentalinkSuspension;
	

	public ScorpioN(int airBags, int seatingCapacity, String transmission, double price, double insurance,
			double roadTax, double maxPower, boolean touchScreenInfotainment, boolean secondRowACVents,
			boolean ledTurnIndicator, boolean pentalinkSuspension) {
		super();
		this.airBags = airBags;
		this.seatingCapacity = seatingCapacity;
		this.transmission = transmission;
		this.price = price;
		this.insurance = insurance;
		this.roadTax = roadTax;
		this.maxPower = maxPower;
		this.touchScreenInfotainment = touchScreenInfotainment;
		this.secondRowACVents = secondRowACVents;
		this.ledTurnIndicator = ledTurnIndicator;
		this.pentalinkSuspension = pentalinkSuspension;
	}


	public int getAirBags() {
		return airBags;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}


	public String getTransmission() {
		return transmission;
	}

	public double getPrice() {
		return price;
	}

	public double getInsurance() {
		return insurance;
	}

	public double getRoadTax() {
		return roadTax;
	}

	public double getMaxPower() {
		return maxPower;
	}

	public boolean isTouchScreenInfotainment() {
		return touchScreenInfotainment;
	}

	public boolean isSecondRowACVents() {
		return secondRowACVents;
	}

	public boolean isLedTurnIndicator() {
		return ledTurnIndicator;
	}

	public boolean isPentalinkSuspension() {
		return pentalinkSuspension;
	}

	public abstract double calculatePrice ();
	
}
