package br.com.diego.model;
// Generated Apr 24, 2013 3:07:29 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Comentario generated by hbm2java
 */
@Entity
@Table(name = "COMENTARIO")
public class Comentario implements java.io.Serializable {

    private int cdCliente;
    private String nmCliente;
    private String nmClienteEmail;
    private String nmClienteComentario;

    public Comentario() {
    }

    public Comentario(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public Comentario(int cdCliente, String nmCliente, String nmClienteEmail,
            String nmClienteComentario) {
        this.cdCliente = cdCliente;
        this.nmCliente = nmCliente;
        this.nmClienteEmail = nmClienteEmail;
        this.nmClienteComentario = nmClienteComentario;
    }

    @Id
    @GeneratedValue
    @Column(name = "CD_CLIENTE")
    public int getCdCliente() {
        return this.cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    @Column(name = "NM_CLIENTE")
    public String getNmCliente() {
        return this.nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    @Column(name = "NM_CLIENTE_EMAIL")
    public String getNmClienteEmail() {
        return this.nmClienteEmail;
    }

    public void setNmClienteEmail(String nmClienteEmail) {
        this.nmClienteEmail = nmClienteEmail;
    }

    @Column(name = "NM_CLIENTE_COMENTARIO")
    public String getNmClienteComentario() {
        return this.nmClienteComentario;
    }

    public void setNmClienteComentario(String nmClienteComentario) {
        this.nmClienteComentario = nmClienteComentario;
    }
}
