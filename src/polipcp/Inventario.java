
package polipcp;

import java.util.ArrayList;

public class Inventario {
    private String NombreINV;
    private ArrayList<RAM> Rams = new ArrayList();
    private ArrayList<Bateria> Baterias = new ArrayList();
    private ArrayList<Pantalla> Pantallas = new ArrayList();
    private ArrayList<Disco_duro> Discos_duros =new ArrayList(); 

    public Inventario(String NombreINV) {
        this.NombreINV = NombreINV;
    }

    public void BDD (int Busqueda){      
        System.out.println(Discos_duros.get(Busqueda));       
    }
    
    public void EDD(int IND){
        Discos_duros.remove(IND);
    }
    
    public void DD(){
        for (int i = 0; i < Discos_duros.size(); i++) {
          System.out.println(Discos_duros.get(i));  
        }
    }
    public void DD(Disco_duro Disco_duro1){
        Discos_duros.add(Disco_duro1);
    
    }
    
    public void BPANT (int Busqueda){  
        System.out.println(Pantallas.get(Busqueda));
    }
    
    public void EPANT(int IND){
        Pantallas.remove(IND);
    }
    
    public void PANT(){
        for (int i = 0; i < Pantallas.size(); i++) {
            System.out.println(Pantallas.get(i));
        }
    }
    
    public void PANT(Pantalla Pantalla1){
        Pantallas.add(Pantalla1);
    }
    
    public void BBAT (int Busqueda){
        System.out.println(Baterias.get(Busqueda)); 
    }
    
    public void EBAT(int IND){
        Baterias.remove(IND);
    }
    
    public void BAT(){
        for (int i = 0; i < Baterias.size(); i++) {
                System.out.println(Baterias.get(i));
            }
    }
    
    public void BAT (Bateria Bateria1){
        Baterias.add(Bateria1);
    }
    
    public void BRAM (int Busqueda){
        System.out.println(Rams.get(Busqueda));
    }
    
    public void ERAM(int IND){
        Rams.remove(IND);
    }
    
    public void RAM(RAM Ram){  
        Rams.add(Ram);
    }
    
    public void RAM(){
        for (int i = 0; i < Rams.size(); i++) {
            System.out.println(Rams.get(i));
        }
    }

    public String getNombreINV() {
        return NombreINV;
    }

    public void setNombreINV(String NombreINV) {
        this.NombreINV = NombreINV;
    }
            
    public String toString(){
        
    return "Nombre del inventario: "+this.NombreINV;
    }
}
