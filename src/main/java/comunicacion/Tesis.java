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
public class Tesis extends Escrito{
    
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales(int entero) {
        return entero*5*paginas;
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
                    this.getIdea()+"\n"+
                    this.getArgumentos().length+"\n"+
                    this.getConclusion()+"\n"+
                    this.getReferencias();
        return impresion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    

}
