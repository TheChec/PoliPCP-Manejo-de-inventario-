
package polipcp;


public class Bateria extends Producto {
    
    private String Material;
    private String Capacidad;

    public Bateria(String Nombre,String Modelo, String Marca, float Precio, String Material, String Capacidad ) {
        this.setNombre(Nombre);
        this.setModelo(Modelo);
        this.setMarca(Marca);
        this.setPrecio(Precio);
        this.Material = Material;
        this.Capacidad = Capacidad;
    }
    
    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    public String toString(){
    
    return "Nombre: "+this.getNombre()+" Modelo: "+getModelo()+" Marca: "+getMarca()
            +" Material: "+this.Material+" Capacidad: "+this.Capacidad+" Precio: "+getPrecio();
    
    
    }
    
}
