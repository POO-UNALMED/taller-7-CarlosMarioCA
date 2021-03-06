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
public class Fabula extends Escrito {
    
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales(int entero) {
        return entero*1*paginas;
    }

    public String interpretacion() {
        return interpretacion;
    }

    
    @Override
    public String toString() {
        String impresion;
        impresion = this.getOrigen()+"\n"+
                    this.getTitulo()+"\n"+
                    this.getAutor()+"\n"+
                    this.getPaginas()+"\n"+
                    this.getEnsenanza();
        return impresion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
