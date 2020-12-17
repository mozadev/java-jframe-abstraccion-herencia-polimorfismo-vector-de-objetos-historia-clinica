package BEAN;
public abstract class HistorialClinico {
    private int iddelHistorial;
    private String medico;
    private String enfermedad;
     private String fecha;
     private double monto;

    public HistorialClinico() {
    }

    public HistorialClinico(int idHistorial, String medico, String enfermedad, String fecha, double monto) {
        this.iddelHistorial = idHistorial;
        this.medico = medico;
        this.enfermedad = enfermedad;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdHistorial() {
        return iddelHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.iddelHistorial = idHistorial;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
   

    // una clase abstracta puede tener metodos abstractos o regulares
    
    public String repDatos(){
        String aux;
        aux = "IdHistorial: "+this.iddelHistorial;
        aux += "  Medico: "+this.medico;
        aux += "  Enfermedad: "+this.enfermedad;
         aux += "  Fecha: "+this.fecha;
          aux += "  Monto: "+this.monto;
          
           
        
        return aux;
    }
    
    //public abstract double calcPrecVenta();
    
}
