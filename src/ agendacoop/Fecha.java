/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacoop;

/**
 *
 * @author matad
 */
public class Fecha {
    private int dia;
    private String mes;
    private int anio;

    private fecha(){}
    
    public fecha(int dia, String mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
        
}
