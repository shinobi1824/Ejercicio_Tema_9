public class Main {
    public static void main(String[] args){

        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        persona.setEdad(37);
        persona.setNombre("Carlos Hernandez");
        persona.setTelefono(941105432);

        cliente.setEdad(40);
        cliente.setNombre("Alejandro");
        cliente.setTelefono(941105432);
        cliente.setCredito(250000);

        trabajador.setEdad(35);
        trabajador.setNombre("Jesus");
        trabajador.setTelefono(941105432);
        trabajador.setSalario(1000000);

        System.out.println("Esta es una Persona");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());

        System.out.println("Este es un Cliente");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        System.out.println("Este es un Trabajador");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
    }
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int Edad){this.edad = Edad;}
    public void setNombre(String Nombre){this.nombre =Nombre;}
    public void setTelefono(int telefono) {this.telefono = telefono;}

    public int getEdad(){return edad;}
    public String getNombre(){return nombre;}
    public int  getTelefono(){return telefono;}

}

class Cliente extends Persona {
    private float credito;

    public void setCredito(float credito){this.credito = credito;}
    public float getCredito(){return credito;}
}
class Trabajador extends Persona{
    private float salario;

    public void setSalario(float salario){this.salario = salario;}
    public float getSalario(){return salario;}
}