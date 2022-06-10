package poo.polymorphism.exercises3;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
	
	@Override
	public double tax () {
		if (super.getAnualIncome() < 20000.0) {
			return super.getAnualIncome() * 0.15;
		}
		if (super.getAnualIncome() >= 20000.0 && healthExpenditures == 0.0) {
			return super.getAnualIncome() * 0.25;
		}
		if (super.getAnualIncome() >= 20000.0 && healthExpenditures > 0) {
			return (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		}
		else
			return 0.0;
	}

}
