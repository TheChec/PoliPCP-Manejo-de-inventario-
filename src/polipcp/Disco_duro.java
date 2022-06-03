
package polipcp;

public class Disco_duro extends Producto{
    
    private String Tipo;
    private String Capacidad;

    public Disco_duro(String Nombre, String Modelo, String Marca, String Tipo, String Capacidad, float Precio) {
        this.setNombre(Nombre);
        this.setModelo(Modelo);
        this.setMarca(Marca);
        this.setPrecio(Precio);
        this.Tipo = Tipo;
        this.Capacidad = Capacidad;
    }
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.Capacidad = capacidad;
    }
    public String toString(){
    
    return "Nombre: "+this.getNombre()+" Modelo: "+getModelo()+" Marca: "+getMarca()
            +" Tipo: "+this.Tipo+" Capacidad: "+this.Capacidad+" Precio: "+getPrecio();
    
    } 
}
