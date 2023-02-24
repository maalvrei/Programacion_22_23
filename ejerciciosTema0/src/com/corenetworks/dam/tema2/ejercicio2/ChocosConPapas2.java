package com.corenetworks.dam.tema2.ejercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChocosConPapas2 {
  private static double chocos;
  private static double papas;

  public ChocosConPapas2(double chocos, double papas) {
    ChocosConPapas2.chocos = chocos;
    ChocosConPapas2.papas = papas;
  }

  public static void escribirEnCSV(double chocos, double papas) {
    String csvFile = "chocos_con_papas.csv";

    try (FileWriter writer = new FileWriter(csvFile)) {
      writer.append("Chocos,Papas\n");
      writer.append(chocos + "," + papas + "\n");
      System.out.println("Valores escritos en el archivo " + csvFile);
    } catch (IOException e) {
      System.err.println("Error al escribir en el archivo " + csvFile);
    }
  }

  public static void leerCSV() {
    String csvFile = "chocos_con_papas.csv";
    File file = new File(csvFile);



    try (Scanner scanner = new Scanner(file)) {
      scanner.nextLine(); // Saltar la primera línea (encabezado)

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] fields = line.split(",");

        double cantidadChocos = Double.parseDouble(fields[0]);
        double cantidadPapas = Double.parseDouble(fields[1]);

        chocos += cantidadChocos;
        papas += cantidadPapas;
      }

      System.out.println("Tienes " + chocos + " kilos de chocos y " + papas + " kilos de papas.");
    } catch (FileNotFoundException e) {
      System.err.println("El archivo " + csvFile + " no se encuentra.");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Que quieres hacer? 1 para actualizar tu inventario y 2 para consultarlo");
    
    int accion = scanner.nextInt();
    
    if (accion == 1) {
    	System.out.print("Ingrese la cantidad de chocos en kilos: ");
        double chocos = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de papas en kilos: ");
        double papas = scanner.nextDouble();
    	escribirEnCSV(chocos, papas);
    	scanner.close();
    } else {
    	if (accion == 2 ) {
    		leerCSV();
    	} else {
    		System.out.println("Debes introducir un numero que sea el 1 o el 2");
    	}
    }  
  }
}
