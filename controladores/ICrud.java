/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.controladores;


import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hugo
 */
public interface ICrud<T> {
    
    public boolean crear(T entidad) throws SQLException, Exception;
    public boolean eliminar(T entidad);
    public T extraer(int id);
    public boolean modificar(T entidad);
    public List <T> listar() throws SQLException, Exception;
    
}
