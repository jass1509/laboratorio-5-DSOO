package javaapplication45;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String documento;
    private ArrayList<String> ListaDocumento;
    private ArrayList<String> ListaCodigo;

    public Paciente(String codigo, String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        setCodigo(codigo);
        setDocumento(documento);
    }

    public String getCodigo() { 
        return codigo; }
    public String getNombre() { 
        return nombre; }
    public int getEdad() { 
        return edad; }
    public String getDocumento() { 
        return documento; }
    
    public void setEdad(int edad){
        if (!Validador.edadValida(edad)) {
            this.edad=edad;
        }
        else{
            System.out.println("Edad no valida");
        }
    }
    public void setDocumento(String documento){
        if (!Validador.NoRepetir(documento, ListaDocumento)) {
            this.documento=documento;
            ListaDocumento.add(documento);
        }
        else{
            System.out.println("Documento repetido");
        }
    }
    public void setCodigo(String codigo){
        if (!Validador.NoRepetir(codigo, ListaCodigo)) {
            this.codigo=codigo;
            ListaCodigo.add(codigo);    
        }
        else{
            System.out.println("Codigo repetido");
        }
    }

}
