package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner venta = new Scanner(System.in);
		DecimalFormat redondeo = new DecimalFormat("#.00");
		
		System.out.println("Ingrese el valor del gasto: ");
		float gasto = venta.nextFloat();
		
		float disminuye = gasto * 0.12f;
		
		System.out.println("======RESUSLTADOS======");
		System.out.println("Precio del gasto.....: " + gasto);
		System.out.println("El valor del gasto disminuido en 12% es  " + redondeo.format(gasto - disminuye));

	}

}
