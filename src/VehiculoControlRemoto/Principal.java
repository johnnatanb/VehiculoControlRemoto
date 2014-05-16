/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VehiculoControlRemoto;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author johnnatan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner entrada =new Scanner(System.in);
        String exp = "^([0-9]+,[N|S|O|E];)*([0-9]+,[N|S|O|E])$";
        String validaNum = "^[1-9][0-9]*$";
        boolean salir=false;
        String filas=null, columnas=null,comando, direccion;
        int desplazamiento;
        Control c;
        Pattern pat;
        Matcher mat;
        
        StringTokenizer st;
        System.out.println(
                "****************************************************************"
            + "\n*                  Bienvenido al simulador de                  *"
            + "\n*                   Vehiculo a control remoto                  *"
            + "\n****************************************************************"
                );
        System.out.println("\nConfigure la superficie de desplazamiento: ");
        
        while(filas==null){            
            System.out.print("Ingrese cantidad de filas: ");
            filas=entrada.nextLine();        
            pat = Pattern.compile(validaNum);
            mat = pat.matcher(filas);            
            if (mat.matches()==false) {
                filas=null;
                System.out.println("  El numero de filas debe ser mayor a 0");
            }            
        }
        while(columnas==null){
            System.out.print("Ingrese cantidad de columnas: ");
            columnas=entrada.nextLine();        
            pat = Pattern.compile(validaNum);
            mat = pat.matcher(columnas);            
            if (mat.matches()==false) {
                columnas=null;
                System.out.println("  El numero de columnas debe ser mayor a 0");
            }
        }
        System.out.println("  La superficie es de "+filas+" filas y "+columnas+" columnas.");
        c = new Control(Integer.parseInt(filas), Integer.parseInt(columnas));
        while(salir==false){
            System.out.print("Ingrese comando: ");
            comando=entrada.nextLine();
            if(comando.toLowerCase().equals("salir")){
                salir=true;
            }            
            else{        
                pat = Pattern.compile(exp);
                mat = pat.matcher(comando);            
                if (mat.matches()) {
                    st = new StringTokenizer(comando, ",;");
                    while(st.hasMoreTokens()){
                    desplazamiento=Integer.parseInt(st.nextToken());
                    direccion=st.nextToken();
                    c.mover(desplazamiento, direccion);
                    }
                }
                else
                    System.out.println("  Error en formato de comando");
            }
        }
    }
}
