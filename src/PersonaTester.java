public class PersonaTester {
    public static void main(String[] args) {

        String nombre, apellidos, dni;
        int edad;
        double peso, altura;
        Sexo sexo;
        Persona[] persona = new Persona[1];

        for (int i = 0; i < persona.length; i++) {
            System.out.println("Persona numero " + (i + 1) + ", tienes DNI?:");
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
                sexo = Inputs.askSexo();
                System.out.println("Dime tu peso:");
                peso = Inputs.askDouble();
                System.out.println("Dime tu DNI:");
                dni = Inputs.askString();
                persona[i] = new Persona(nombre, apellidos, edad, sexo, peso, altura, dni);
            } else {
                persona[i] = new Persona(nombre, apellidos, edad);
            }
        }

        for (Persona value : persona) {
            System.out.println(value);
            switch (value.calcularIMC()) {
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

            if (value.esMayorDeEdad()) {
                System.out.println("es mayor de edad");
            } else {
                System.out.println("es menor de edad");
            }

            System.out.println();
        }


    }
}