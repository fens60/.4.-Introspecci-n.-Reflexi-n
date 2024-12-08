package ies.losmontecillos.introspeccion_reflexion;
import java.lang.reflect.*;
import java.util.Scanner;

public class Reflexion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre completo de la clase:");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("Nombre de la clase: " + clazz.getName());

            System.out.println("\nConstructores:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println(constructor);
            }

            System.out.println("\nCampos:");
            for (Field field : clazz.getFields()) {
                System.out.println(field);
            }

            System.out.println("\nMétodos:");
            for (Method method : clazz.getMethods()) {
                System.out.println(method);
            }

            System.out.println("\nModificadores de clase:");
            System.out.println(Modifier.toString(clazz.getModifiers()));
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + className);
        }
    }
}
