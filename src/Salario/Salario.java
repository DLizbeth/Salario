package Salario;

import javax.swing.JOptionPane;

public class Salario {

  public static void calcularHorasDiurnas (){
      String aux1= JOptionPane.showInputDialog("ingrese el numero de horas trabajadas");
      int numHorasTrabajadas=Integer.parseInt(aux1);
     
      String aux= JOptionPane.showInputDialog("Ingrese el precio por hora");
      double precioHoras= Double.parseDouble(aux);
      double salario=numHorasTrabajadas*precioHoras;
     
      JOptionPane.showMessageDialog(null,"susalario es: "+salario);
  }
   public static void calcularHorasNocturnas (){
      String aux1= JOptionPane.showInputDialog("ingrese el numero de horas trabajadas");
      int numHorasTrabajadas=Integer.parseInt(aux1);
     
      String aux= JOptionPane.showInputDialog("Ingrese el precio por hora");
      double precioHoras= Double.parseDouble(aux);
      double salario=numHorasTrabajadas*precioHoras;
   
      JOptionPane.showMessageDialog(null,"susalario es: "+salario);
   }
    public static void main(String[] args) {
     String menu= "Seleccione una de las opciones\n"+
                  "1. Calcular Salario De Horas Diurnas\n"+
                  "2. Calcular SalarioDe Horas Nocturnas\n";
     
      String aux=JOptionPane.showInputDialog(menu);
      int opciones=Integer.parseInt(aux);
      switch (opciones){
          case 1:
                 calcularHorasDiurnas();
                 break;
          case 2:
                 calcularHorasNocturnas();
                 break;
      }       
    }
}
