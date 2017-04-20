/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author User
 */
public class Examen {
    
    private String materia;
    private String examentipe;
    private String carrera;
    private Integer pregtotal;
    private Integer pregexa;

   
    Examen(){
        
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getExamentipe() {
        return examentipe;
    }

    public void setExamentipe(String examentipe) {
        this.examentipe = examentipe;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getPregtotal() {
        return pregtotal;
    }

    public void setPregtotal(Integer pregtotal) {
        this.pregtotal = pregtotal;
    }

    public Integer getPregexa() {
        return pregexa;
    }

    public void setPregexa(Integer pregexa) {
        this.pregexa = pregexa;
    }
    @Override
    public String toString(){
      return materia+"\n"+examentipe+"\n"+ carrera +"\n"+pregtotal+"\n"+ pregexa;
    }
}
