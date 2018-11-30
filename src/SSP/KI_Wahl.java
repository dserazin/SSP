package SSP;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CC-Student
 */
public class KI_Wahl 
{ 
    private String kiz;
    
     public String ZufallsWahl()
       {
       Random zufall = new Random();
       int rechnung = (int)(Math.random() * 3);
       
        switch (rechnung) 
        {
            case 1:
                kiz = "Stein";
                break;
            case 2:
                kiz = "Schere";
                break;
            default:
                kiz = "Papier";
                break;
        }                                                
       return kiz;
       
      }
     
}
