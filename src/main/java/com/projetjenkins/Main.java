package com.projetjenkins;


public class Main {

    public static void main(String[] args) {
        // Message modifié pour déclencher le build automatique #2 dans Jenkins
        System.out.println("Hello Jenkins – Build automatique réussi !");

        System.out.println("Démonstration pour le test automatique");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Preuve que le build Maven a fonctionné
        System.out.println("=== BUILD SUCCESS (Jenkins a compilé et exécuté ce code) ===");
    }
}