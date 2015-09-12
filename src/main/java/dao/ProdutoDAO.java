/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Produto;
import javax.persistence.EntityManager;

/**
 *
 * @author rodrigo
 */
public class ProdutoDAO extends GenericDAO<Long, Produto> {
    public ProdutoDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
