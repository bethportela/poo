import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int area, perimetro;
		
		System.out.println("Base: ");
		int base = sc.nextInt();
		System.out.println("Altura: ");
		int altura = sc.nextInt();
		sc.close();
		
		area = base*altura;
		perimetro = 2*base + 2*altura;
		
		System.out.println("Area: "+area);
		System.out.println("Perimetro: "+perimetro);
	}
}
