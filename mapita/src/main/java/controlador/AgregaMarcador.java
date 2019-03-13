/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import com.mycompany.modelo.Marcador;
import com.mycompany.modelo.MarcadorDAO;
import javax.faces.bean.ManagedBean;
import com.mycompany.modelo.Usuario;
    
/**
 *
 * @author lizbethac
 */
@ManagedBean
public class AgregaMarcador {
    private int idmarcador;
    private Usuario usuario;
    private String descripcion;
    private Double longitud;
    private Double latitud;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }
    
    public void setIdMarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getLongitud() {
        return longitud;
    }   
    
    public Double getLatitud(){
        return latitud;
    }
    
    public void agregaMarcador(){
        Marcador m = new Marcador();
        m.setUsuario(usuario);
        m.setDescripcion(descripcion);
        m.setLongitud(longitud);
        m.setLatitud(latitud);
        MarcadorDAO mdao = new MarcadorDAO();
        mdao.save(m);
    }
}
