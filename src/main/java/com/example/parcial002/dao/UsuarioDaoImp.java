package com.example.parcial002.dao;
import com.example.parcial002.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Usuario>getUsuarios() {
       String query = "FROM Usuario";
       return entityManager.createQuery(query).getResultList();
    }
}
