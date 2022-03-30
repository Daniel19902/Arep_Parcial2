package edu.escuelaing.arem;

public class Sqrt {


    private Double numero;
    private String operar;
    private Double resultado;


    public Sqrt(Double numero, String operar){

        this.numero = numero;
        this.operar = operar;
    }


    public void operar(){
        if(operar.equals("SQRT")){
            resultado = Math.sqrt(numero);
        }else {
            System.out.println("sin");
            resultado = Math.sin(numero);
        }

    }



}
