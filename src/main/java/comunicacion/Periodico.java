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
public class Periodico extends Escrito{

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }
        
    private String fecha;
    private String primicia;
    private String interpretacion;
    
    

    public int palabrasTotales(int entero) {
        return entero*10*paginas;
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
                    this.getFecha()+"\n"+
                    this.getPrimicia();
        return impresion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
