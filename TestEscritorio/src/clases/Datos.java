/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Datos {
    Usuario misUsuarios[] = new Usuario[50];
    private int conUsu = 0;
    
    public Datos(){
       Usuario miUsuario = new Usuario("12345","Carlos","Molina","12345", 1);
       misUsuarios[conUsu] = miUsuario;
       conUsu++;
    }   
            
            
    public boolean validarUsuario(String usuario, String clave){
        boolean aux = false;
        for (int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(clave)){
              return true;
            }
                return false;
        }
        return false;
    } 
        
}
    
    

