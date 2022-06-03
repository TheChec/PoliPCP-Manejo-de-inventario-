
package polipcp;


public class Pantalla extends Producto {
   
    private String GHZ;

    public Pantalla(String Nombre, String Modelo, String Marca,String GHZ, float Precio) {
        this.setNombre(Nombre);
        this.setModelo(Modelo);
        this.setMarca(Marca);
        this.setPrecio(Precio);
        this.GHZ = GHZ;
    }

    public String getGHZ() {
        return GHZ;
    }

    public void setGHZ(String GHZ) {
        this.GHZ = GHZ;
    }
    
    public String toString(){
    
    return "Nombre: "+this.getNombre()+" Modelo: "+getModelo()+" Marca: "+getMarca()
            +" GHZ: "+this.GHZ+" Precio: "+getPrecio();
    
    
    }

   
    
}
