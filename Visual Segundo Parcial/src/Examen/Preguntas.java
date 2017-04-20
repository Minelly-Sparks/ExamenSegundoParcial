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
public class Preguntas {
    private String pregunta;
    private String respuesta;
    private String opt1;
    private String opt2;
    private String opt3;
    
    public Preguntas(String preg,String resp,String o1,String o2,String o3){
    pregunta=preg;
    respuesta=resp;
    opt1=o1;
    opt2=o2;
    opt3=o3;
}

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    @Override
    public String toString(){
        return pregunta+"\n"+respuesta+"\n"+opt1+"\n"+opt2+"\n"+opt3;
    }
}
