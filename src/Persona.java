public class Persona {

    private final String nombre,apellidos,DNI;
    private final int edad;
    private final double peso,altura;
    private final Sexo sexo;

    public Persona(String nombre, String apellidos, int edad, Sexo sexo, double peso, double altura, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = Sexo.NO;
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generaDNI();
    }


    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 18.5) {
            return -1;
        } else if (imc > 18.5 && imc < 25) {
            return 0;
        } else if (imc >= 25 && imc < 30) {
            return 1;
        } else {
            return 2;
        }
    }
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    @Override
    public String toString() {
        return "Nombre: " +this.nombre + ", " + this.apellidos +
        "\nEdad: " + this.edad + " Años" +
        "\nSexo: " + this.sexo +
        "\nPeso: " + this.peso + " Kg" +
        "\nAltura: " + this.altura + " Metros" +
        "\nDNI: " + this.DNI;
    }
    private String generaDNI() {
        int numero = (int)(Math.random()*10000000 + 10000000);
        char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);
        return numero+""+letra;
    }
}
