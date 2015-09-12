/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Administrador
 */
@Entity
public class ProdutoPosicao  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Column(nullable=false)
    @OneToOne
    private Produto produto;
    
    @NotNull
    @Column(nullable=false)
    @OneToOne
    private Posicao posicao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaida;
    
    
}
