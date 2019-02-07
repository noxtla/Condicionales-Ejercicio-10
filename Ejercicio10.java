package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int dia,mes,anyo;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes"));
		anyo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anyo"));
		
		
		if (dia > 0 && dia < 31) {
			
			if (mes == 2) {
				if (dia == 28 || dia == 29) {
					JOptionPane.showMessageDialog(null, "Fecha correcta");	
				}
				else {
					JOptionPane.showMessageDialog(null, "Mes incorrecto");
				}
				
			}
			
			else if (mes == 1 || mes == 3 || mes == 5||
					mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia < 31) {
					JOptionPane.showMessageDialog(null, "Fecha correcta");	
				}
				else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecto");
				}
			}
			
			else if (mes == 4 || mes == 6 || mes == 9||mes == 10 ) {
				if (dia < 30) {
					JOptionPane.showMessageDialog(null, "Fecha correcta");	
				}
				else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecto");
				}
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Fecha incorrecto");
		} 
			
	}
}
