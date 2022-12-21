public class PersonaTester {
    public static void main(String[] args) {

        String nombre, apellidos, dni, sexo;
        int edad;
        double peso, altura;
        Persona[] persona = new Persona[6];

        for (int i = 0; i < persona.length; i++) {
            System.out.println("Persona numero "+(i+1)+", tienes DNI?:");
            boolean tieneDNI = Inputs.askBoolean();
            System.out.println("Dime tu nombre:");
            nombre = Inputs.askString();
            System.out.println("Dime tus apellidos:");
            apellidos = Inputs.askString();
            System.out.println("Dime tu edad:");
            edad = Inputs.askInt();
            if (tieneDNI) {
                System.out.println("Dime tu altura:");
                altura = Inputs.askDouble();
                System.out.println("Dime tu sexo:");
                sexo = Inputs.askString();
                System.out.println("Dime tu peso:");
                peso = Inputs.askDouble();
                System.out.println("Dime tu DNI:");
                dni = Inputs.askString();
                persona[i] = new Persona(nombre, apellidos, edad, sexo, peso, altura, dni);
            } else {
                persona[i] = new Persona(nombre, apellidos, edad);
            }
        }
        boolean aa;
        for (Persona value : persona) {
            System.out.println(value);
            switch (value.calcularIMC()){
                case -1:
                    System.out.println("Tienes peso bajo.");
                    break;
                case 0:
                    System.out.println("Tienes peso adecuado.");
                    break;
                case 1:
                    System.out.println("Tienes peso alto.");
                    break;
                case 2:
                    System.out.println("Tienes obesidad.");
                    break;
            }

            aa = value.esMayorDeEdad();
            aa ? System.out.println("es mayor de edad") : System.out.println("es menor de edad");

            System.out.println();
        }


    }
}