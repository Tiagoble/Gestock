package br.com.gestock.dao;

import br.com.gestock.model.Produtos;
import br.com.gestock.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

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
    
    public List<Produtos> getProdutos(){
        EntityManager manager = JPAUtil.getEntityManager();
        String jpql = "SELECT p FROM Produtos p";
        try{
            Query query = manager.createQuery(jpql, Produtos.class);
            return query.getResultList();
        }catch(Exception e){
            System.out.println("Erro ao buscar produtos. "+e.getMessage());
            return null;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
}
