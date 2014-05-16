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

public class Area {
    private int filas;
    private int columnas;
    private int Area[][];
    public Area(){};

    public Area(int f, int c){
        this.filas=f;
        this.columnas=c;
    };

    public void setCarroArea(int posfilas, int poscolumnas, int carro){
        this.Area[posfilas][poscolumnas]=carro;  
    };

    public void setArea(){
        this.Area = new int[this.filas][this.columnas];
        for(int fil=0; fil<this.filas; fil++){
            for(int col=0; col<this.columnas; col++){
                this.Area[fil][col]=0;
            }
        }
    };

    public int [][] getArea(){
        return this.Area;    
    };
    public int getFilas(){
        return this.filas;
    }
    public int getColumnas(){
        return this.columnas;
    }
}
