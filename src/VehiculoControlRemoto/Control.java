package VehiculoControlRemoto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author johnnatan
 */
public class Control {
    private int filas, columnas, limN, limS=0, limE, limO=0,posFila=0,  posColumna=0;
    private Area superficie;
    
    public Control(int f, int c){
        this.filas=f;
        this.columnas=c;
        superficie=new Area(this.filas, this.columnas); //Se crea el area
        superficie.setArea(); //Se llena el area con 0
        superficie.setCarroArea(0, 0, 1);//Se ubica el carro
        this.limN=this.filas-1; 
        this.limE=this.columnas-1;         
    };
    
    private void moverN(int desplazamiento){
        int limite=this.posFila+desplazamiento;
        if(limite>this.limN){
            limite=this.limN;
            System.out.print("  Se ha detenido el avance por salir de los límites");
        }  
        for(int c=this.posFila; c<limite; c++){
            superficie.setCarroArea(c, this.posColumna, 0);//Mueve el carro de la posicion actual a 
            superficie.setCarroArea(c+1, this.posColumna, 1);//la posicion siguiente hasta llegar a su destino.
            /*System.out.println("posX: "+this.posColumna+"c: "+c+"getArea["+c+"]["+this.posColumna+"]"+superficie.getArea()[c][this.posColumna]
            +"getArea["+(c+1)+"]["+this.posColumna+"]"+superficie.getArea()[(c+1)][this.posColumna]);*/
            }
            this.posFila=limite;
    }
    
    private void moverS(int desplazamiento){
        int limite=this.posFila-desplazamiento;
        if(limite<this.limS){
            limite=this.limS;
            System.out.print("  Se ha detenido el avance por salir de los límites");
        }
        for(int c=this.posFila; c>limite; c--){
            superficie.setCarroArea(c, this.posColumna, 0);//Mueve el carro de la posicion actual a 
            superficie.setCarroArea(c-1, this.posColumna, 1);//la posicion siguiente hasta llegar a su destino.
        }
        this.posFila=limite;
        
    }
    
    private void moverE(int desplazamiento){
        int limite=this.posColumna+desplazamiento;
        if(limite>this.limE){
            limite=this.limE;
            System.out.print("  Se ha detenido el avance por salir de los límites");
        }
        for(int c=this.posColumna; c<limite; c++){
            superficie.setCarroArea(this.posFila, c, 0);//Mueve el carro de la posicion actual a 
            superficie.setCarroArea(this.posFila, c+1, 1);//la posicion siguiente hasta llegar a su destino.
        }
        this.posColumna=limite;
        
    }
    
    private void moverO(int desplazamiento){
        int limite=this.posColumna-desplazamiento;
        if(limite<this.limO){
            limite=this.limO;
            System.out.print("  Se ha detenido el avance por salir de los límites");
        }
        for(int c=this.posColumna; c>limite; c--){
            superficie.setCarroArea(this.posFila, c, 0);//Mueve el carro de la posicion actual a 
            superficie.setCarroArea(this.posFila, c-1, 1);//la posicion siguiente hasta llegar a su destino.
        }
        this.posColumna=limite;        
    }
    public void mover(int desplazamiento, String direccion){
        System.out.println("Comando: "+desplazamiento+","+direccion);
        switch (direccion){
            case "N":
                moverN(desplazamiento);
                break;
            case "S":
                moverS(desplazamiento);
                break;
            case "E":
                moverE(desplazamiento);
                break;
            case "O":
                moverO(desplazamiento);
                break;
        }
        System.out.println("  Posición: ("+this.posFila+","+this.posColumna+")");
    }    
}
