package vehiculo;

import java.util.Objects;

public class Vehiculo {
	
	//propiedades
    private String nombreVehiculo;
    private int potenciaMotor;
    private int velocidadMaxima;
          
    //constructor por defecto
    public Vehiculo(){
        this.nombreVehiculo = "";
        this.potenciaMotor = 0;
        this.velocidadMaxima = 0;
    }
    //constructor personalizado #1
    public Vehiculo(String nv) {
    	this.nombreVehiculo = nv;
    }
    //constructor personalizado #2
    public Vehiculo(String nv, int pm, int vm) {
        this.nombreVehiculo = nv;
        this.potenciaMotor = pm;
        this.velocidadMaxima = vm;
    }
    //constructor copia
    public Vehiculo(Vehiculo f){
        this.nombreVehiculo = f.nombreVehiculo;
        this.potenciaMotor = f.potenciaMotor;
        this.velocidadMaxima = f.velocidadMaxima;
    }
    
    
    //get and set
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public int getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombreVehiculo, potenciaMotor, velocidadMaxima);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        return Objects.equals(nombreVehiculo, other.nombreVehiculo) && potenciaMotor == other.potenciaMotor
                && velocidadMaxima == other.velocidadMaxima;
    }
    @Override
    public String toString() {
        return "Vehiculo [nombreVehiculo=" + nombreVehiculo + ", potenciaMotor=" + potenciaMotor + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }
    
    
}