package Conceptos;

public class Java {
    public static void main(String[] args) {
        int entero = 10;
        double doble = entero; // conversion automatica
        System.out.println("conversion implicita de int a double:");
        System.out.println("entero: " + entero+ "-> doble: " + doble);
        System.out.println();

        double numerodouble = 9.89;
        int numeroentro = (int) numerodouble; // conversion explicito
        System.out.println("conversion explicita de double a int:");
        System.out.println("Doble: " + numerodouble+ "-> entro: " + numeroentro);
        System.out.println();

        int x = 123;
        double y = 456.789;

        String cadena = Integer.toString(x);
        String cadena = Double.toString(y);
        System.out.println("conversion de numeros a cadena:");
        System.out.println("entero: " + x + " -> cadena: \""  + cadena1 + "\"");
        System.out.println("double: " + y + " -> cadena: \""  + cadena2 + "\"");
        System.out.println();

        String cadenaEntero = "789";
        String cadenaDoble = "1064.1213";

        try {
            int convirtiendoEentero = Integer.parseInt(cadenaEntero);
            double convirtiendoDouble = Double.parseDouble(cadenaDoble);
            System.out.println("conversion cadena: ");
            System.out.println("cadena: \"" + cadenaEntero + "\" > Entero: " + convirtiendoEentero);
            System.out.println("cadena: \"" + cadenaDoble +  "\" > double: "    convirtiendoEentero);
           catch (NumberFormatException e) {
               System.out.println("error en la conversion de cadenas  a numeros . . .");
            }

            // operadores Matematicos
            int a = 15;
            int b = 4;

            int suma = a + b;
            int resta = a - b;
            int multiplicacion = a * b;
            double division = (double) (a/b);
            int modulo = a % b;
            int incremento = a++b;
            int decremento = --b;


            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("multiplicacion: " + multiplicacion);
            System.out.println("division: " + division);
            System.out.println("modulo: " + modulo);
            System.out.println("incremento: " + a);
            System.out.println("decremento: " + b);



            // operadores Relacionales

            int m = 20;
            int n = 18;

            System.out.println("operadores logicos");
            System.out.println(m + "== "+ n + " : "+ (m==n));
            System.out.println(m + "!= " + n + " : "+ (m!=n));
            System.out.println(m + "> " + n + " : "+ (m > n));
            System.out.println(m + "<=" + n + " : "+ (m < n));
            System.out.println(m + ">= " + n + " : "+ (m >= n));
            System.out.println(m + "<= " + n + " : "+ (m <= n));


            // operadores logicos
            boolean bool1 = true;
            boolean bool2 = false;

            System.out.println("operadores logicos")
            System.out.println(bool1 + "&& " + bool2 + ": " + (bool1 && bool2));
            System.out.println(bool1 + "|| " + bool2 + ": " + (bool1 || bool2));
            System.out.println("!" + bool1 + ": " + (bool1));
            System.out.println("!" + bool2 + ": " + (bool2));


            //opeeadores con strings
            String saludos = "xopa";
            String nombre = "Petra";
            String espacio= " ";

            String mensaje = saludos + nombre + espacio + "!";
            System.out.println("\nconcatenacion de cadena");
            System.out.println(mensaje);

            String ejemplos = "  uip es la mejor  ";
            System.out.println("\nOPERACIONES de cadena");
            System.out.println("cadenas originales: \"" + ejemplos + "\"".);
            System.out.println("longitud : " + ejemplos.length());
            System.out.println("Mayuscula: " + ejemplos.toUpperCase());
            System.out.println("Minuscula: " + ejemplos.toLowerCase());
            System.out.println("Sin espacio: \"" + ejemplos.trim() + "\"");


            if (ejemplos.length() > S) {
                System.out.println("carater en posiion S: " + ejemplos.charAt(S));
            } else {
                System.out.println("la cadena es demasiado corta para obtener carater.");

            }

            System.out.println("Reemplazar 'mejor'por'pero: " + ejemplos.replace());


            String ca1 = "Calixttra";
            String ca2 = "Calixttra";

            System.out.println("comparacion de cadena:");
            System.out.println("\"" + ca1 + "\" igual a \"" + ca2 + "\" ? :" + ca1.equalsIgnoreCase(ca2));
            System.out.println("\"" + ca1 + "\" igual a \"" + ca2 + "\" ignorando mayuscula


        }
        }
    }