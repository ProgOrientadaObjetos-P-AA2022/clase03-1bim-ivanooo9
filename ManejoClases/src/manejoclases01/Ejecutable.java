/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


import manejoclases.Hospital;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        HOspital h2 = new Hospital();

        // Se asigna valores particulares al objeto
        hospital.nombre = "San Pablo";
        hospital.numeroCamas = 400;
        hospital.presupuesto = 5603400.43;

        h2..nombre = "San Pablo";
        h2.anumeroCamas = 400;
        h2.presupuesto = 5603400.43;

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
