/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import com.mycompany.modelo.Marcador;
import com.mycompany.modelo.MarcadorDAO;
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
public class LeeMarcador {
    private int idmarcador;  
    private List<Marcador> resultado;
    
    public int getIdMarcador(){
        return idmarcador;
    }
    
    public List<Marcador> getResultado(){
        return resultado;
    }
        
     public String leeMarcador(){                    
        MarcadorDAO ud = new MarcadorDAO();                
        resultado = ud.buscaPorId(idmarcador);
        return "resultado?faces-redirect=true";
     } 
}
