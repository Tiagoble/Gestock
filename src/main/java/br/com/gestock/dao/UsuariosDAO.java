package br.com.gestock.dao;

import br.com.gestock.model.Usuarios;
import br.com.gestock.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class UsuariosDAO {
    
    public void cadastrar(Usuarios usuario){
        EntityManager manager = JPAUtil.getEntityManager();
        try{
            manager.getTransaction().begin();
            manager.persist(usuario);
            manager.getTransaction().commit();
        }catch(Exception ex){
            manager.getTransaction().rollback();
            System.out.println("Erro ao cadastrar. "+ex.getMessage());
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public Usuarios validarLogin(String username, String password){
        EntityManager manager = JPAUtil.getEntityManager();
        String jpql = "SELECT u FROM Usuarios u WHERE u.username = :username AND u.password_hash = :password";
        try{
            TypedQuery<Usuarios> query = manager.createQuery(jpql, Usuarios.class);
            
            query.setParameter("username", username);
            query.setParameter("password", password);
            
            return query.getSingleResult();
        }catch(NoResultException ex){
            return null;
        }catch(Exception e){
            System.out.println("Erro ao validar login. "+e.getMessage());
            return null;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
}
