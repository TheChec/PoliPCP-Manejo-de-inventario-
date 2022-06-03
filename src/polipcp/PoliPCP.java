
package polipcp;

import java.util.ArrayList;
import java.util.Scanner;

public class PoliPCP {
    
    private static ArrayList<Inventario> Inventarios = new ArrayList();
    static Scanner Dato = new Scanner(System.in);
    private static int NumeroINV = 0;
    private static String NombreINV = "";
    private static Inventario Inventario1 = new Inventario(NombreINV);
    private static int IND;
    private static int Busqueda = 0;
    
    
    public static void main(String[] args) {
        
        
        int opc = 0;
        while (true){
            
            System.out.println("""
                               
                               1.Agregar productos
                               2.Mostrar inventario
                               3.Eliminar
                               4.Busqueda
                               5.Salir
                               """);
            opc = Dato.nextInt();
            
        switch (opc){
        
            case 1:
                
                System.out.println("""
                                   
                                   1.Ram
                                   2.Bateria
                                   3.Pantalla
                                   4.Discos duros 
                                   """);
                int opcP =Dato.nextInt();
                switch (opcP){
                
                    case 1:
                        
                        System.out.println(""" 
                                           
                                           Introduzca los datos de la RAM a almacenar separadas por "," 
                                           (Nombre,Modelo,Marca,Generacion,Frecuencia)
                                           """);
                        Dato.nextLine();
                        String[] datosR = Dato.nextLine().split(",");
                        
                        System.out.println("");
                        System.out.println("Ingrese el precio");
                        System.out.println("");
                        float datosPR = Dato.nextFloat();
                        
                        RAM Rams = new RAM(datosR[0], datosR[1], datosR[2], datosR[3], datosR[4], datosPR);

                        if (Inventarios.isEmpty()){
                            NumeroINV = 0;
                            System.out.println("");
                            System.out.println("Ingrese el nombre del inventario: ");
                            System.out.println("");
                            Dato.nextLine();
                            NombreINV = Dato.nextLine();

                        }else{
                            for (int i  = 0; i<Inventarios.size(); i++) {
                                
                                System.out.println( i+"--> "+Inventarios.get(i).getNombreINV());
                               
                            }   
                            System.out.println(Inventarios.size()+" Crear un nuevo inventario ");
                            System.out.println("");
                            System.out.println("Seleccione un número de inventario: ");
                            System.out.println("");
                            NumeroINV = Dato.nextInt();

                            if(NumeroINV>=Inventarios.size()){
                                System.out.println("");
                                System.out.println("Ingrese nombre del inventario: ");
                                System.out.println("");
                                Dato.nextLine();
                                NombreINV = Dato.nextLine();

                            }

                        }
                        System.out.println("");
                        AgregarRAM(NumeroINV, NombreINV, Rams); 
                    
                
                        break;
                        
                        
                    case 2: 
                        
                        System.out.println(""" 
                                           
                                           Introduzca los datos de la bateria almacenar separadas por "," 
                                           (Nombre,Modelo,Marca,Material,Capacidad) 
                                           """);
                        Dato.nextLine();
                        String[] datosB = Dato.nextLine().split(",");
                        
                        System.out.println("");
                        System.out.println("Ingrese el precio");
                        System.out.println("");
                        
                        float datosPB = Dato.nextFloat();
                        
                        Bateria Baterias = new Bateria(datosB[0], datosB[1], datosB[2], datosPB, datosB[3], datosB[4]);

                        if (Inventarios.isEmpty()){
                            NumeroINV = 0;
                            System.out.println("");
                            System.out.println("Ingrese el nombre del inventario: ");
                            System.out.println("");
                            Dato.nextLine();
                            NombreINV = Dato.nextLine();

                        }else{
                            for (int i  = 0; i<Inventarios.size(); i++) {
                                
                                System.out.println( i+"--> "+Inventarios.get(i).getNombreINV());

                            }
                            System.out.println(Inventarios.size()+" Crear un nuevo inventario ");
                            System.out.println("");
                            System.out.println("Seleccione un número de inventario: ");
                            System.out.println("");
                            NumeroINV = Dato.nextInt();

                            if(NumeroINV>=Inventarios.size()){
                                System.out.println("");
                                System.out.println("Ingrese nombre del inventario: ");
                                System.out.println("");
                                Dato.nextLine();
                                NombreINV = Dato.nextLine();

                            }

                        }
                        System.out.println("");
                        AgregarBAT(NumeroINV, NombreINV, Baterias);
                        
                        break;
                        
                    case 3: 
                        
                        System.out.println(""" 
                                           
                                           Introduzca los datos de la pantalla almacenar separadas por "," 
                                           (Nombre, Modelo, Marca, GHZ) 
                                           """);
                        Dato.nextLine();
                        String[] datosP = Dato.nextLine().split(",");
                        
                        System.out.println("");
                        System.out.println("Ingrese el precio");
                        System.out.println("");
                        
                        float datosPP = Dato.nextFloat();
                        
                        Pantalla Pantallas = new Pantalla(datosP[0], datosP[1], datosP[2], datosP[3], datosPP);

                        if (Inventarios.isEmpty()){
                            NumeroINV = 0;
                            System.out.println("");
                            System.out.println("Ingrese el nombre del inventario: ");
                            System.out.println("");
                            Dato.nextLine();
                            NombreINV = Dato.nextLine();

                        }else{
                            for (int i  = 0; i<Inventarios.size(); i++) {
                                
                                System.out.println( i+"--> "+Inventarios.get(i).getNombreINV());

                            }
                            System.out.println(Inventarios.size()+" Crear un nuevo inventario ");
                            System.out.println("");
                            System.out.println("Seleccione un número de inventario: ");
                            System.out.println("");
                            NumeroINV = Dato.nextInt();

                            if(NumeroINV>=Inventarios.size()){
                                System.out.println("");
                                System.out.println("Ingrese nombre del inventario: ");
                                System.out.println("");
                                Dato.nextLine();
                                NombreINV = Dato.nextLine();

                            }

                        }
                        System.out.println("");
                        AgregarPANT(NumeroINV, NombreINV, Pantallas);
                        
                       break;
                        
                    case 4: 
                        
                        System.out.println(""" 
                                           
                                           Introduzca los datos del disco duro a almacenar separadas por "," 
                                           (Nombre, Modelo, Marca, Tipo, Capacidad) 
                                           """);
                        Dato.nextLine();
                        String[] datosD = Dato.nextLine().split(",");
                        
                        System.out.println("");
                        System.out.println("Ingrese el precio");
                        System.out.println("");
                        
                        float datosDP = Dato.nextFloat();
                        
                        Disco_duro Disco_duros = new Disco_duro (datosD[0], datosD[1], datosD[2], datosD[3], datosD[4], datosDP);

                        if (Inventarios.isEmpty()){
                            NumeroINV = 0;
                            System.out.println("");
                            System.out.println("Ingrese el nombre del inventario: ");
                            System.out.println("");
                            Dato.nextLine();
                            NombreINV = Dato.nextLine();

                        }else{
                            for (int i  = 0; i<Inventarios.size(); i++) {
                                
                                System.out.println( i+"--> "+Inventarios.get(i).getNombreINV());

                            }
                            System.out.println(Inventarios.size()+" Crear un nuevo inventario ");
                            System.out.println("");
                            System.out.println("Seleccione un número de inventario: ");
                            System.out.println("");
                            NumeroINV = Dato.nextInt();

                            if(NumeroINV>=Inventarios.size()){
                                System.out.println("");
                                System.out.println("Ingrese nombre del inventario: ");
                                System.out.println("");
                                Dato.nextLine();
                                NombreINV = Dato.nextLine();

                            }

                        }
                        System.out.println("");
                        AgregarDD(NumeroINV, NombreINV, Disco_duros);
                        
                    break;
                }
                
                
            break;
              //---------------------Mostrar inventarios------------------------------------------------------  
            case 2:
                System.out.println("""
                                   
                                   1.Ram
                                   2.Baterias
                                   3.Pantalla
                                   4.Discos duros
                                   """);
                opc = Dato.nextInt();
                switch(opc){
                
                    case 1:
                        
                        for (int i = 0; i <Inventarios.size(); i++) {
                            Inventarios.get(i).RAM();
                        }
                            
                        
                        break;
                    
                    case 2: 
                        
                        for (int i = 0; i <Inventarios.size(); i++) {
                            Inventarios.get(i).BAT();
                        }
                        break;
                        
                    case 3:
                        
                        for (int i = 0; i <Inventarios.size(); i++) {
                           Inventarios.get(i).PANT();
                        }
                        
                        break;
                        
                    case 4: 
                        
                        for (int i = 0; i <Inventarios.size(); i++) {
                            Inventarios.get(i).DD();
                        }
                        
                        break;
                
                
                
                
                }
                
                
               break; 
                
            //----------------------------------------------------------------------------------    
            //------------------------Eliminar--------------------------------------------------
            case 3:
                System.out.println("""
                                   
                                   ¿De qué inventario desea eliminar un elemento?
                                   1.Rams
                                   2.Bateria
                                   3.Pantalla
                                   4.Discos duros
                                   """);
                opc = Dato.nextInt();
                switch(opc){
                    
                    case 1:
                        
                        System.out.println("""
                                           
                                           Elija el elemento que desea borrar en el inventario
                                           escribiendo su posición
                                           (El primer elemento siempre sera 0)
                                           """);
                        for (int i = 0; i < Inventarios.size(); i++) {
                            Inventarios.get(i).RAM();
                        }
                        
                        IND = Dato.nextInt();
                        Inventarios.get(0).ERAM(IND);
                        break;
                
                    case 2:
                        
                        System.out.println("""
                                           
                                           Elija el elemento que desea borrar en el inventario
                                           escribiendo su posición
                                           (El primer elemento siempre sera 0)
                                           """);
                        for (int i = 0; i < Inventarios.size(); i++) {
                            Inventarios.get(i).BAT();
                        }
                        
                        IND = Dato.nextInt();
                        Inventarios.get(1).EBAT(IND);
                        break;
                    
                    case 3:
                        
                        System.out.println("""
                                           
                                           Elija el elemento que desea borrar en el inventario
                                           escribiendo su posición
                                           (El primer elemento siempre sera 0)
                                           """);
                        for (int i = 0; i < Inventarios.size(); i++) {
                            Inventarios.get(i).PANT();
                        }
                        
                        IND = Dato.nextInt();
                        Inventarios.get(2).EPANT(IND);
                        break;
                        
                    case 4:
                        
                        System.out.println("""
                                           
                                           Elija el elemento que desea borrar en el inventario
                                           escribiendo su posición
                                           (El primer elemento siempre sera 0)
                                           """);
                        for (int i = 0; i < Inventarios.size(); i++) {
                            Inventarios.get(i).DD();
                        }
                        
                        IND = Dato.nextInt();
                        Inventarios.get(3).EDD(IND);
                        break;    
                    
                    default: 
                        System.out.println("Esa opción no existe");
                        
                        break;
                
                
                
                }
                        
                break;
                
                
                //------------------------------------------------------------------------
                //----------------------------------Busqueda----------------------------------
                
            case 4:
                
                
                System.out.println("""
                                   
                                   ¿En qué inventario desea buscar el objeto?
                                   1.Rams
                                   2.Bateria
                                   3.Pantalla
                                   4.Discos duros
                                   """);
                opc = Dato.nextInt();
                
                switch(opc){
                    
                    case 1:
                        System.out.println("");
                        System.out.println("La primera posición siempre sera 0");
                        System.out.println("Digite la posición del objeto a buscar");
                        Dato.nextLine();
                        Busqueda =Dato.nextInt();
                        Inventarios.get(0).BRAM(Busqueda);
                            
                        break;
                        
                    case 2:
                        System.out.println("");
                        System.out.println("La primera posición siempre sera 0");
                        System.out.println("Digite la posición del objeto a buscar");
                        Dato.nextLine();
                        Busqueda =Dato.nextInt();
                        Inventarios.get(1).BBAT(Busqueda);
                    
                        break;
                    
                    case 3:
                        System.out.println("");
                        System.out.println("La primera posición siempre sera 0");
                        System.out.println("Digite la posición del objeto a buscar");
                        Dato.nextLine();
                        Busqueda =Dato.nextInt();
                        Inventarios.get(2).BPANT(Busqueda);
                        
                        break;
                    
                    case 4:
                        System.out.println("");
                        System.out.println("La primera posición siempre sera 0");
                        System.out.println("Digite la posición del objeto a buscar");
                        Dato.nextLine();
                        Busqueda =Dato.nextInt();
                        Inventarios.get(3).BDD(Busqueda);
                        
                }
                break;
                
            case 5:
                
                 System.out.println("Saliendo...");
                 return;
                 
            default: 
                
                System.out.println("Esa opción no existe");
        
        }
    } 
}
    
    public static void AgregarRAM(int NumeroINV, String NombreINV, RAM Ram){
        
        if (NumeroINV < Inventarios.size()) {
            
            Inventarios.get(NumeroINV).RAM(Ram);
            
        }else{
        
            Inventario Inventario1 = new Inventario(NombreINV);
            Inventario1.RAM(Ram);
            Inventarios.add(Inventario1);
        }
        
        System.out.println("");
        System.out.println("Guardado con exito");
        System.out.println(Inventarios);
    
    }
    
    public static void AgregarBAT(int NumeroINV, String NombreINV, Bateria Bateria){
        
        if (NumeroINV < Inventarios.size()) {
            
            Inventarios.get(NumeroINV).BAT(Bateria);
            
        }else{
        
            Inventario Inventario1 = new Inventario(NombreINV);
            Inventario1.BAT(Bateria);
            Inventarios.add(Inventario1);
        }
            System.out.println("");
            System.out.println("Guardado con exito");
            System.out.println(Inventarios);
    
    }
    
    public static void AgregarPANT(int NumeroINV, String NombreINV, Pantalla Pantalla){
        
        if (NumeroINV < Inventarios.size()) {
            
            Inventarios.get(NumeroINV).PANT(Pantalla);
            
        }else{
        
            Inventario Inventario1 = new Inventario(NombreINV);
            Inventario1.PANT(Pantalla);
            Inventarios.add(Inventario1);
        }
            System.out.println("");
            System.out.println("Guardado con exito");
            System.out.println(Inventarios);
    
    }
    
    public static void AgregarDD(int NumeroINV, String NombreINV, Disco_duro Disco_duro){
        if (NumeroINV < Inventarios.size()) {
            
            Inventarios.get(NumeroINV).DD(Disco_duro);
            
        }else{
        
            Inventario Inventario1 = new Inventario(NombreINV);
            Inventario1.DD(Disco_duro);
            Inventarios.add(Inventario1);
        }
            System.out.println("");
            System.out.println("Guardado con exito");
            System.out.println(Inventarios);
        
    }
}
