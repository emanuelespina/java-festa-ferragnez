package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
  
      String[] invitati = {"Luca Scorrano", "Luca Villa", "Emanuele Spina", "Cristian Limonta", "Matteo Redaelli"};

      Scanner scanner = new Scanner(System.in);      

      boolean puoEntrare = false;

      System.out.println("Inserisci il tuo nome e cognome:");   
      
      String nomeInvitato = scanner.nextLine();      

      // for (int i = 0; i < invitati.length; i++){
        
      //   if (invitati[i].equalsIgnoreCase(nomeInvitato.trim())luca){
      //      puoEntrare = true;
      //      break;
      //   }

      // }

       int i = 0;
       while (!puoEntrare && i < invitati.length) {
        
         if (invitati[i].equalsIgnoreCase(nomeInvitato.trim())){
             puoEntrare = true;
          }

          i++;

        }      
          
         
      if (puoEntrare == true){
        System.out.println("Puoi entrare alla festa " + nomeInvitato);
      } else{
        System.out.println("Non puoi entrare alla festa");
      }        
            
      scanner.close();

    }
}
