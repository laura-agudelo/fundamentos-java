public class Solve {

    public static void mostrarEjercicios(int categoria) {
        System.out.println("\nSeleccione el ejercicio: ");

        switch (categoria) {
            case 1:
            case 4:
                System.out.println("1. Ejercicio 1");
                System.out.println("2. Ejercicio 2");
                System.out.println("3. Ejercicio 3");
                System.out.println("4. Ejercicio 4");
                System.out.println("5. Ejercicio 5");
                System.out.println("6. Ejercicio 6");
                System.out.println("7. Ejercicio 7");
                System.out.println("8. Ejercicio 8");
                System.out.println("9. Ejercicio 9");
                System.out.println("10. Ejercicio 10");
                break;
            case 2:
            case 3:
                System.out.println("1. Ejercicio 1");
                System.out.println("2. Ejercicio 2");
                System.out.println("3. Ejercicio 3");
                System.out.println("4. Ejercicio 4");
                System.out.println("5. Ejercicio 5");
                break;
        }
        System.out.print("Ingrese el número del ejercicio: ");
    }

    public static void ejecutarCasteo(int ejercicio) {
        switch (ejercicio) {
            case 1:
                int suma = (int) 5.89 + (int) 3.45;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                char caracter = 'A';
                int ascii = (int) caracter;
                System.out.println("El resultado es: " + ascii);
                break;
            case 3:
                double d = 100.04;
                long l = (long)d;
                int i = (int)l;
                System.out.println("El resultado es: " + i);
                break;
            case 4:
                String texto = "123";
                int numero = Integer.parseInt(texto);
                System.out.println("El resultado es: " + numero);
                break;
            case 5:
                int resultado = (int) (char) (byte) -1;
                System.out.println("El resultado es: " + resultado);
                break;
            case 6:
                char caracterDesdeInt = (char) 65;
                System.out.println("El resultado es: " + caracterDesdeInt);
                break;
            case 7:
                long largo = 123456789L;
                int enteroDesdeLargo = (int) largo;
                System.out.println("El resultado es: " + enteroDesdeLargo);
                break;
            case 8:
                float flotante = 5.75f;
                String cadena = Float.toString(flotante);
                System.out.println("El resultado es: " + cadena);
                break;
            case 9:
                int redondeado = (int) Math.round(3.7);
                System.out.println("El resultado es: " + redondeado);
                break;
            case 10:
                byte b = 50;
                short shortValor = (short) b;
                System.out.println("El resultado es: " + shortValor);
                break;
            default:
                System.out.println("Número no válido. Debe ser entre 1 y 10.");
                break;
        }
    }

    public static void ejecutarAsignacion(int ejercicio) {
        int valor = 0;

        switch (ejercicio) {
            case 1:
                valor = 10;
                valor += 5;
                System.out.println("El resultado es: " + valor);
                break;
            case 2:
                valor = 10;
                int y = 10;
                y *= (valor + 5);
                System.out.println("El resultado es: " + y);
                break;
            case 3:
                int a = 15;
                a %= 4;
                System.out.println("El resultado es: " + a);
                break;
            case 4:
                int x = 10;
                int y1 = 5;
                x += y1;
                System.out.println("El resultado es: " + x);
                break;
            case 5:
                int xXor = 5;
                xXor ^= 2;
                System.out.println("El resultado es: " + xXor);
                break;
            default:
                System.out.println("Número no válido. Debe ser entre 1 y 5.");
                break;
        }
    }

    public static void ejecutarIncDec(int ejercicio) {
        switch (ejercicio) {
            case 1:
                int x = 5;
                int y = ++x;
                System.out.println("El resultado es: " + "x: " + x + ", y: " + y);
                break;
            case 2:
                int a = 5;
                System.out.println(a++);
                System.out.println("El resultado es: " + a);
                break;
            case 3:
                int contador = 10;
                contador--;
                System.out.println("El resultado es: " + contador);
                break;
            case 4:
                int i = 5;
                int preInc = ++i;
                int postInc = i++;
                System.out.println("El resultado es: " + "Pre: " + preInc + ", Post: " + postInc);
                break;
            case 5:
                int xPost = 3;
                xPost = xPost++;
                System.out.println("El resultado es: " + xPost);
                break;
            default:
                System.out.println("Número no válido. Debe ser entre 1 y 5.");
                break;
        }
    }

    public static void ejecutarCombinados(int ejercicio) {
        switch (ejercicio) {
            case 1: {
                int i = 5;
                i += ++i + i++ + ++i;
                System.out.println("El resultado es: " + i);
                break;
            }
            case 2: {
                double d = 5.5;
                int intVal = (int) d;
                intVal++;
                System.out.println("El resultado es: " + intVal);
                break;
            }
            case 3: {
                double d = 5.7;
                int i = (int) d;
                i *= 2;
                System.out.println("El resultado es: " + i--);
                break;
            }
            case 4: {
                int num = 10;
                double resultado = (double) num / 2;
                System.out.println("El resultado es: " + resultado);
                break;
            }
            case 5: {
                char c = 'X';
                c += 32;
                System.out.println("El resultado es: " + c);
                break;
            }
            case 6: {
                long l = 12345L;
                short s = (short) l;
                s *= 3;
                System.out.println("El resultado es: " + s);
                break;
            }
            case 7: {
                int x = 10;
                x += (x++) + (++x);
                System.out.println("El resultado es: " + x);
                break;
            }
            case 8: {
                float f = 5.99f;
                byte b = (byte) f;
                --b;
                System.out.println("El resultado es: " + b);
                break;
            }
            case 9: {
                int i = 257;
                byte b = (byte) i;
                System.out.println("El resultado es: " + b);
                break;
            }
            case 10: {
                double d = 10.5;
                int tempInt = (int) d;
                tempInt += 5;
                tempInt++;
                System.out.println("El resultado es: " + tempInt);
                break;
            }
            default:
                System.out.println("Número no válido. Debe ser entre 1 y 10.");
                break;
        }
    }
}
