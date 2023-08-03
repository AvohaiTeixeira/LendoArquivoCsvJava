package lendoArquivoCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		/* Terceira versão usando try whith resorces:
		O recurso que for instanciado dentro do try já será finalizado ao final do try ou caso hava alguma exceção, 
		não havendo a necessidadde de usar o bloco fynally
		Segue exemplo abaixo: */
		
		String path = "C:\\\\Users\\\\Avohai Teixeira\\\\Desktop\\\\in.txt";
		
		List<Product> list = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
			
			String line = br.readLine();
			//Pega a partir da segunda linha do arquivo.
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				
				Product p = new Product();
				p.setName(vect[0]);
				p.setPryce( Double.parseDouble(vect[1]) );
				p.setQuantity( Integer.parseInt( vect[2]) );
			
				list.add(p);
				
				line = br.readLine();
			}
			System.out.println("PRODUTOS:");
			for (Product prod: list) {
				System.out.println(prod);
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		//Segunda versão:
		/*
		String path = "C:\\\\Users\\\\Avohai Teixeira\\\\Desktop\\\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//primeira versão: 
		/*
		File file = new File("C:\\Users\\Avohai Teixeira\\Desktop\\in.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			
			//Lendo as linhas do arquivo:
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e ) {
			System.out.println(e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		*/

	}

}
