/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.controlador;

import java.util.List;
import unam.fciencias.modelo.Usuario;
import unam.fciencias.modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lizbethac
 */
@ManagedBean
public class LeeUsuario {
    private int idusuario;  
    private List<Usuario> resultado;
    
    public int getIdUsuario(){
        return idusuario;
    }
    
    public List<Usuario> getResultado(){
        return resultado;
    }
        
     public String leeUsuario(){                    
        UsuarioDAO ud = new UsuarioDAO();                
        resultado = ud.buscaPorId(idusuario);
        return "resultado?faces-redirect=true";
     } 
}
