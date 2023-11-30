package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitatiFerragnez = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", " Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Dimmi il tuo nome e cognome: ");
        String tuoNomeCognome = scan.nextLine();

        boolean nomeNellaLista = false;
        /*for (int i = 0; i < invitatiFerragnez.length && !nomeNellaLista ; i++) {
            if (tuoNomeCognome.equals(invitatiFerragnez[i])) {
                nomeNellaLista = true;
            }
        }
        if(!nomeNellaLista){
            System.out.println("Non sei in lista, Vattene.");
        }
        else{
            System.out.println("Sei in lista, prego entri!");
        }

         */
        int i = 0;
        while(i<invitatiFerragnez.length && !nomeNellaLista) {
        if (tuoNomeCognome.equals(invitatiFerragnez[i])){
            nomeNellaLista = true;
            }
        i++;
        }

        if (!nomeNellaLista) {
            System.out.println("Non sei in lista, Vattene.");
        } else {
            System.out.println("Sei in lista, prego entri!");
        }

        scan.close();
    }
}


