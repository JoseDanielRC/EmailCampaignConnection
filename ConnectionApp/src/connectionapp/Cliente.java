/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionapp;

/**
 *
 * @author Daniel RC
 */
public class Cliente {
    String nombre;
    String agencia;
    String empresa;
    String correo;
    String estado;
    String vip;

    public Cliente(String nombre, String agencia, String empresa, String correo, String estado, String vip) {
        this.nombre = nombre;
        this.agencia = agencia;
        this.empresa = empresa;
        this.correo = correo;
        this.estado = estado;
        this.vip = vip;
    }

    Cliente() {
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "{" + "nombre:" + nombre + ", agencia:" + agencia + ", empresa:" + empresa + ", correo:" + correo + ", estado:" + estado + ", vip:" + vip + '}'+'\n';
    }
}
