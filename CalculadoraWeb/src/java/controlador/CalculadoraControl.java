package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import servicio.CalculadoraService;

@Named(value = "calculaControl")
@SessionScoped
public class CalculadoraControl implements Serializable {

    private int nro1, nro2;
    private String resultado = "";
    private char operador;
    
    public  void calcular(){
        resultado=CalculadoraService.respuesta(nro1, nro2, operador);
    }

    
    public  void limpiar(){
        setNro1(10);
        setNro2(10);
        resultado="";
        
    }

    public CalculadoraControl() {
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

}
