/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

/**
 *
 * @author SAM
 */
public class Alfabeto extends Pictograma { 
    
    private String [] letras;
    private String interpretacion;
    

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    @Override
    public String toString(){
        String impresion = "";
        for (int i = 0; i<letras.length ;i++){
            if(i<letras.length-1){
                impresion = impresion + letras[i]+", ";
            }
            else{
                impresion = impresion + letras[i];
            }
        }
        return impresion;
    }
    
    public int cantidadLetras(){
        return letras.length;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
    
    
    
}
