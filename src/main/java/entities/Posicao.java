/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Administrador
 */
@Entity
public class Posicao implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String descricao;
    
    @NotNull
    @Column(nullable=false)
    @OneToOne
    private Armazem armazem;
    
    @NotNull
    @Column(nullable=false)
    private Long tamanho;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the armazem
     */
    public Armazem getArmazem() {
        return armazem;
    }

    /**
     * @param armazem the armazem to set
     */
    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    /**
     * @return the tamanho
     */
    public Long getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }
}
