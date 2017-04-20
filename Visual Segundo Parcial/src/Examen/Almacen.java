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
public class Almacen {
    private String nombre;
    private String matricula;
    private String materia;

    public Almacen(String nom, String matr, String mater){
    nombre=nom;
    matricula=matr;
    materia=mater;
    

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    @Override
    public String toString(){
        return nombre+" /n"+matricula+" /n"+materia;
    }
    }

