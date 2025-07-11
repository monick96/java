import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1.Crear las variables correspondientes para leer tu nombre, apellido y edad e imprimirlos por consola en una oración.
        String nombre = "Monica";
        String apellido = "Melgarejo";
        int edad = 27;
        //System.out.println("Mi nombre y apellido es " + nombre + " " + apellido + " y tengo " + edad + " años" );

        //2.Realizar un pequeño programa que permita ingresar 3 números e imprimir por consola cuál es el mayor.
        Scanner scanner = new Scanner(System.in) ;
//        System.out.println("Ingrese 3 numeros enteros");
//
//        System.out.println("Ingrese el primer entero");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Ingrese el segundo entero");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Ingrese el tercer entero");
//        int num3 = scanner.nextInt();
//
//        if (num1 >num2 && num1>num3){
//            System.out.println("El mayor entero ingresado es " + num1);
//        } else if (num2 >num1 && num2>num3){
//            System.out.println("El mayor entero ingresado es " + num2);
//        }else {
//            System.out.println("El mayor entero ingresado es " + num3);
//        }

        //3.Realizar un pequeño programa que permita el ingreso de un número e imprimir por consola su paridad.
//        System.out.println("Ingrese un entero");
//        int num = scanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("El entero es par");
//        }else {
//            System.out.println("El entero es inpar");
//        }

        //4.Crear el código correspondiente que permita ingresar 2 cadenas de caracteres e imprima por consola si son iguales o no.
//        System.out.println("Ingrese una palabra");
//        String cadena1 = scanner.next();
//
//        System.out.println("Ingrese otra palabra");
//        String cadena2 = scanner.next();
//
//        if(chain1.equals(chain2)){
//            System.out.println("Las palabras son iguales");
//        }else {
//            System.out.println("las palabras son diferentes");
//        }

        //5.Realizar un pequeño programa que permita el ingreso de números, almacenarlos en una colección hasta ingresar un 0.
//        System.out.println("Ingrese un numero entero, o ingrese 0(cero) para terminar");
//        int num = scanner.nextInt();
//        ArrayList<Integer> nums = new ArrayList<>();
//
//        while (num !=0){
//            nums.add(num);
//
//            System.out.println("Ingrese un numero entero, y cero para terminar");
//            num = scanner.nextInt();
//
//        }
//        System.out.println("Números ingresados:");
//        for (int num : nums) {
//            System.out.println(num);
//        }

        //Invocacion a saludo()
        saludo();

        //Invocacion a paridad()
//        System.out.println("Ingrese un entero");
//        int num = scanner.nextInt();
//        paridad(num);

        //Invocacion a primo()
//        System.out.println("Ingrese un entero mayor a uno");
//        int numP= scanner.nextInt();
//        primo(num);

        //Invocacion a sumaInpr()
        int[] arrayNums = {5, 8, 7, 3, 2, 8, 7, 10, 17, 14};
        sumaInpar(arrayNums);

        //Invocacion a printParSumPrimos()
        printParSumPrimos(arrayNums);

        //invocacion menu calculadora
        //printCalcMenu();

        //invocacion calculadora
        //Calc();


        //Invocacion  gestion boliche
        gestionBoliche();


    }
    //6.Crear una función que imprima un mensaje de bienvenida en la consola.
    public static void saludo(){
        System.out.println("Hello, Welcome to Java!");
    }

    //7.Crear una función que reciba un número entero y devuelva si es par o impar en forma de texto.
    public static void paridad(int num){
        if (num % 2 == 0) {
            System.out.println("El entero es par");
        }else {
            System.out.println("El entero es inpar");
        }
    }
    //8.Crear una función que reciba un número y devuelva si el mismo es primo o no.
    public static void primo(int num){

        if (num <= 1) {
            System.out.println("Los números menores o iguales a 1 no son primos");
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("El numero no es primo"); // Si se encuentra un divisor distinto de 1 y el número, no es primo
                }else{
                    System.out.println("El numero es primo");
                }
            }
        }
    }
    //9.Crear una función que reciba una colección de números y devuelva la suma de los números impares.
    public static void sumaInpar(int[] array){
        int suma= 0;
        for (int i = 0; i<array.length; i++){
            if(array[i] % 2 != 0){
                suma += array[i];
            }
        }
        System.out.println("La suma de los numeros primos es : " + suma);
    }

    //10 Crear una función que reciba una colección de números e imprima los números pares y la suma de los números primos.
    public static void printParSumPrimos(int[] array) {
        int sumaPrimos = 0;

        System.out.println("Números pares:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\nSuma de los números primos:");
        for (int num : array) {
            if (num > 1) {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i != 0) {
                        sumaPrimos += num;
                    }
                }

            }
        }
        System.out.println(sumaPrimos);
    }

    //11.
    public static void printCalcMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("---- Calculadora ----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        System.out.println("---------------------");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
    }

   //12-Crear otra función que ocupe la del punto anterior para poder crear una pequeña calculadora usando switch. Tener en cuenta el caso de la división por 0.
   public static void Calc() {
       Scanner scanner = new Scanner(System.in);
       int opcion;

       do {
           System.out.println("---- Calculadora ----");
           System.out.println("1. Suma");
           System.out.println("2. Resta");
           System.out.println("3. Multiplicación");
           System.out.println("4. División");
           System.out.println("0. Salir");
           System.out.println("---------------------");
           System.out.print("Seleccione una opción: ");
           opcion = scanner.nextInt();

           switch (opcion) {
               case 1:
                   realizarSuma();
                   break;
               case 2:
                   realizarResta();
                   break;
               case 3:
                   realizarMultiplicacion();
                   break;
               case 4:
                   realizarDivision();
                   break;
               case 0:
                   System.out.println("Saliendo del menú...");
                   break;
               default:
                   System.out.println("Opción inválida. Intente nuevamente.");
           }
       } while (opcion != 0);

       scanner.close();
   }
    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Suma --");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Resta --");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Multiplicación --");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- División --");
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            double resultado = (double) dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    //13.Crear el algoritmo necesario para poder gestionar el ingreso a un boliche.
    // El mismo deberá contar con un pequeño menú con las siguientes opciones:
    // ●Ingreso de datos.
    // ●Capacidad disponible.
    // ●Dinero recaudado.
    // ●Salir del sistema.

    public static void gestionBoliche(){
        Scanner scanner = new Scanner(System.in);
        int maxCapacidad = 100; // Capacidad máxima del boliche
        int capacidadActual = 0; // Inicialmente el boliche está vacío
        double recaudacion = 0.0; // Inicialmente no se ha recaudado dinero
        int opcion;

        do {
            System.out.println("---- Menú del Boliche ----");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("4. Salir del sistema");
            System.out.println("--------------------------");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Cuantas personas van a ingresar?");
                    int cantIngresantes = scanner.nextInt();
                    if(capacidadActual + cantIngresantes <= maxCapacidad){
                        capacidadActual += cantIngresantes;
                        double costoPorPersona = 10.0;  //precio entrada por persona
                        double totalRecaudado = cantIngresantes * costoPorPersona;
                        recaudacion += totalRecaudado;
                        System.out.println(cantIngresantes + " personas ingresaron" + " y se recaudo $" + totalRecaudado);
                    }else {
                        System.out.println("No hay suficiente capacidad para ingresar ");
                    }
                    break;

                case 2:
                    int capDisponible = maxCapacidad - capacidadActual;
                    System.out.println("queda lugar para " + capDisponible + " personas." );
                    break;

                case 3:
                    System.out.println("Se recaudo $" + recaudacion);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }while (opcion !=4);

        scanner.close();

    }
}