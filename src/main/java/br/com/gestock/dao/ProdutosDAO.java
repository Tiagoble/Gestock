package br.com.gestock.dao;

import br.com.gestock.model.Produtos;
import br.com.gestock.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class ProdutosDAO {
    
    public void adicionarProduto(Produtos produto){
        EntityManager manager = JPAUtil.getEntityManager();
        try{
            manager.getTransaction().begin();
            manager.persist(produto);
            manager.getTransaction().commit();
        }catch(Exception e){
            manager.getTransaction().rollback();
            System.out.println("Erro ao adicionar produto. "+e.getMessage());
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
}
