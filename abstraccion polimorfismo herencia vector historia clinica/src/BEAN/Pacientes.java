package BEAN;
public class Pacientes extends HistorialClinico{
    private int idPaciente;
     private String apellido;
      private String nombre;
     private String DNI;

    public Pacientes(int idPac, String apell, String nomb, String dni, int idHistorial, String medico, String enfermedad, String fecha, double monto) {
        super(idHistorial, medico, enfermedad, fecha, monto);
        this.idPaciente = idPac;
        this.apellido = apell;
        this.nombre = nomb;
        this.DNI = dni;
    }

    public int getIdPac() {
        return idPaciente;
    }

    public void setIdPac(int idPac) {
        this.idPaciente = idPac;
    }

    public String getApell() {
        return apellido;
    }

    public void setApell(String apell) {
        this.apellido = apell;
    }

    public String getNomb() {
        return nombre;
    }

    public void setNomb(String nomb) {
        this.nombre = nomb;
    }

    public String getDni() {
        return DNI;
    }

    public void setDni(String dni) {
        this.DNI = dni;
    }

  
    /*
    
    El polimorfismo significa "muchas formas", y ocurre cuando 
    tenemos muchas clases que están relacionadas entre sí por herencia.

Como especificamos en el capítulo anterior; La herencia nos permite
    heredar atributos y métodos de otra clase. Esto nos permite realizar 
    una sola acción de diferentes maneras.

Por ejemplo, piense en una superclase llamada
    que tenga un método llamado . Subclases de Animales
    podrían ser Cerdos, Gatos, Perros, Aves - Y también 
    tienen su propia implementación de un sonido animal 
    (los oinks de cerdo, y los maullidos de gato, etc.)
    :AnimalanimalSound()*/
    
    public String repDatos(){//  sobreescritura de metodo por herencia 
        String auxiliar;
        auxiliar = super.repDatos();
        auxiliar += "\nIdPaciente: "+this.idPaciente;
        auxiliar += "\nApellido: "+this.apellido;
        auxiliar += "\nNombre: "+this.nombre;
        auxiliar += "\nDNI: "+this.DNI;
        
        
        return auxiliar;
    }
    
 
}
