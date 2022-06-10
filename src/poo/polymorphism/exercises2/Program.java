package poo.polymorphism.exercises2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");
		List<Product> priceTags = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		
		
		for (int i = 1; i <= N; i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.nextLine().charAt(0);
			
			if (typeProduct == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				// Instanciação da superclasse Product na lista
				priceTags.add (new Product(name, price)); 
			}
			else if (typeProduct == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				// Instanciação da subclasse ImportedProduct na lista
				priceTags.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				// Instanciação da subclasse UsedProduct na lista
				priceTags.add(new UsedProduct(name, price, manufactureDate));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : priceTags) {
			// Impressão das etiquetas de preços que sofreram polimorfismo
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
