package src.entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	public OutsourcedEmployee() {
		super();
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour,Double additional) {
		super(name, hours, valuePerHour);
		this.additionalCharge=additional;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
