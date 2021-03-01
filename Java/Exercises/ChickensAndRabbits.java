class Tester {
	public static void main(String[] args) {
		int heads = 150, legs = 500;

		int rabbits = countRabbits(heads, legs);
		if (heads - rabbits <= 0 || rabbits <= 0) {
			System.out.println("The number of chickens and rabbits cannot be found");
		} else {
			System.out.println("Chickens = " + (heads - rabbits));
			System.out.println("Rabbits = " + rabbits);
		}

	}

	static int countRabbits(int heads, int legs) {
		int count = 0;
		count = (legs) - 2 * (heads);
		count = count / 2;

		return count;
	}
}

/*
 * 
 * 4r + 2c = 500 
 * 4r = 500 - 2 (150 - r) 
 * 4r = 500 - 300 + 2r 
 * 2r = 200 
 * r = 100
 * 
 */