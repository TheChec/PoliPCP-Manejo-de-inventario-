
package polipcp;


public class RAM extends Producto{
  
    private String Generacion;
    private String Frecuencia;

    public RAM(String Nombre,String Modelo, String Marca, String Generacion, String Frecuencia, float Precio){
        this.setNombre(Nombre);
        this.setModelo(Modelo);
        this.setMarca(Marca);
        this.setPrecio(Precio);
        this.Generacion = Generacion;
        this.Frecuencia = Frecuencia;
    }


    public String getGeneracion() {
        return Generacion;
    }

    public void setGeneracion(String Generacion) {
        this.Generacion = Generacion;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
    public String toString(){
    
    return "Nombre: "+this.getNombre()+" Modelo: "+getModelo()+" Marca: "+getMarca()
            +" Generación: "+this.Generacion+" Frecuencia: "+this.Frecuencia+" Precio: "+getPrecio();
    
    
    }
    
}
