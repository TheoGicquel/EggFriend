public class main{

	public static void main(String[] args){
		Tamagotchi tamago = new Tamagotchi("tamago");

        System.out.print("nom : ");
		System.out.print(tamago.getName());

        System.out.printf("\n");

        System.out.print("Energie : ");
		System.out.print(tamago.getEnergy());

	}

}