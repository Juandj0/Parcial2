/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    private ArrayList<Sede> sedes;

   
    
   //Agregar  distintas clases de sedes 
    public void addSedeTecnologica(String nombre, String direccion, String telofono, String AreaConstruida) {
     SedeTecnologica s= new SedeTecnologica(nombre,direccion,telofono,AreaConstruida);
    
     this.sedes.add(s);
    }
    public void addSedeProfesional(String nombre, String direccion, String telofono, String AreaConstruida,int programasCalidad){
     SedeProfesional s= new SedeProfesional(nombre,direccion,telofono,AreaConstruida,programasCalidad);
    
     this.sedes.add(s);
    } 
    public void addSedeEducacionContinuada(String nombre, String direccion, String telofono, String AreaConstruida,String cursoPopular) {
    SedeEducacionContinuada s= new SedeEducacionContinuada(nombre,direccion,telofono,AreaConstruida,cursoPopular);
    this.sedes.add(s);
    
    }
    //Elimina sede por nombre
    public void eliminarSede(String nombre){
    for(int i=0;i<this.sedes.size();i++){
          if(this.sedes.get(i).getNombre().equals(nombre)){
              this.sedes.remove(i);
           break;
          }
    
    }
    
    
    
    }
    public  HashMap<String,String> darInformacion(ArrayList<Sede> sedes){
        HashMap<String,String> x= new HashMap();
        for(int i =0; i<this.sedes.size();i++){
            //Nos retorna el tipo de sede y su respectiva informacion
            x.put(this.sedes.get(i).getClass().toString(), this.sedes.get(i).darInformación());
        
        
        
        }
    return x;
    }
    //Obtener sedes
     public ArrayList<Sede> getSedes() {
        return sedes;
    }
     //modificar sedes
    public void modificarSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }
    
    
    
}
