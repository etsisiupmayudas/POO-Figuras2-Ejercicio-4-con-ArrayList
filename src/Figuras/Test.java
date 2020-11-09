package Figuras;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
			figuras.add(new Rectangulo(3.5,5.5));
			figuras.add(new Cuadrado(3)); 
			figuras.add(new Cuadrado(5.5));
			figuras.add(new Rombo(7,6)); 
			figuras.add(new Rombo(5.0,3.0, 4.0));
			figuras.add(new Trapecio(4, 3, 2));
			figuras.add(new Trapecio(4.5, 3.5, 2.5));
			figuras.add(new Triangulo(4, 3, 5));
			figuras.add(new Triangulo(4.5, 3.5, 5.5));
			figuras.add(new Triangulo(4)); 
			figuras.add(new PoligonoRegular(new double[]{4, 4, 4}));
			figuras.add(new Cuadrado(3)); 
			figuras.add(new PoligonoRegular(new double[]{3, 3, 3, 3}));
			figuras.add(new PentagonoR(5)); 
			figuras.add(new PentagonoR(5.6));
			figuras.add(new HexagonoR(3)); 
			figuras.add(new HexagonoR(3.1));
			figuras.add(new Circulo(2)); 
			figuras.add(new Circulo(2.5));
			figuras.add(new Elipse(3, 2)); 
			figuras.add(new Elipse(2.5, 2.5));
			
		AnalizadorFiguras analizador = new AnalizadorFiguras(figuras);

		System.out.println();
		System.out.println("Resulados del analizador de las figuras");
		System.out.println("---------------------------------------");

		for(Figura f: figuras) {
			System.out.println(f.toString());
		}
		System.out.println();
		System.out.println(analizador.resumenPerimetros());
		System.out.println(analizador.resumenAreas());

		DecimalFormat fd = new DecimalFormat("#.000");

		System.out.println();
		System.out.println("Total perímetros: " + fd.format(analizador.calculaTotalPerimetros()));
		System.out.println("Media perímetros: " + fd.format(analizador.calculaMediaPerimetros()));
		System.out.println("Máximo perímetros: " + fd.format(analizador.calculaMaximoPerimetros()));
		System.out.println("Mínimo perímetros: " + fd.format(analizador.calculaMinimoPerimetros()));
		System.out.println("Total áreas: " + fd.format(analizador.calculaTotalAreas()));
		System.out.println("Media áreas: " + fd.format(analizador.calculaMediaAreas()));
		System.out.println("Máximo áreas: " + fd.format(analizador.calculaMaximoAreas()));
		System.out.println("Mínimo áreas: " + fd.format(analizador.calculaMinimoAreas()));
		System.out.println();
	}

}
