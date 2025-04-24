package com.ferragnez.party;
public class CheckGuest {
    public static void main(String[] args) throws Exception {
      //crare l'array con tutti gli invitati 
      //far inserire il nome dell'utente       
      //fare un ciclo for per far scorrere tutti gli invitati 
      //inserire nel ciclo for un if per capire se uno degli elementi dell'array è uguale a quello inseirito 
      
      String[] invitati = {"Luca Scorrano", "Luca Villa", "Emanuele Spina", "Cristian Limonta", "Matteo Redaelli"};

      String nomeInvitato = "ciccio";

      boolean puoEntrare = false;

      System.out.println("Inserisci il tuo nome e cognome:");        

      for (int i = 0; i < invitati.length; i++){
        
        if (invitati[i] == nomeInvitato){
           puoEntrare = true;
        }

      }

      int i = 0;
      while (i < invitati.length) {
        
        if (invitati[i] == nomeInvitato){
            puoEntrare = true;
         }

       }      
          
         
      if (puoEntrare == true){
        System.out.println("Puoi entrare alla festa");
      } else{
        System.out.println("Non puoi entrare alla festa");
      }      
      
    }
}
