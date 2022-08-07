package ejercicio_9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cliente cliente = new Cliente();
        
        Trabajador trabajador = new Trabajador();
        
        cliente.setEdad(36);
        
        cliente.setNombre("Rafael");
        
        cliente.setTelefono(99536247);
        
        cliente.setCredito(536.558);
        
        trabajador.setSalario(1005.55);
        
        System.out.println("La edad del cliente es " + cliente.getEdad() + " anos" + ", "  + "su nombre es " +
        cliente.getNombre() + ", " + "su numero telefonico es " + cliente.getTelefono() + ", " + " tiene un credito por " 
        + cliente.getCredito() + " y su salario es " + trabajador.getSalario());
	}

}

class Persona {
	
	private int edad;
	
	private String nombre;
	
	private int telefono;
	
	
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setTelefono(int telefono) {
		
		this.telefono = telefono;
		
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public int getTelefono() {
		
		return telefono;
		
	}
	
}

class Cliente extends Persona {
	
	private double credito;
	
	public void setCredito(double credito) {
		
		this.credito = credito;
		
	}
	
	public double getCredito() {
		
		return credito;
		
	}
	
}

final class Trabajador extends Persona {
	
	private double salario;
	
	public void setSalario(double salario) {
		
		this.salario = salario;
		
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	
}