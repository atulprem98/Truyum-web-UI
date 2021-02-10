package Automobiles;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

	public MercedesFactory() {
		System.out.println("Mercedes Factory");
	}
}
