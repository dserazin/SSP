package SSP;





import java.io.*;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC-Student
 */
public class DataWrite
        
{

    String name = null;
    String schreiben = null;

   
        public void DateiErstellen(String spielerName)
        {
            name = spielerName;
            
            try 
            {
                 File neuedatei = new File("C:\\Users\\dserazin\\Desktop\\"+name+"_SSP.txt");
                 
                boolean dateistatus = neuedatei.createNewFile();
                
                if (dateistatus) 
                {
                    System.out.println("Datei wurde erstellt");    
                } else 
                {
                    System.out.println("Die Datei wurde schon erstellt");
                }
            } catch (IOException ausnahmeInfo) 
            {
                System.out.println("Fehler beim erstellen der Datei");
                ausnahmeInfo.printStackTrace(System.out);
            }
        }
        
        public void DateiSchreiben(String auswertung)
        {
            schreiben = auswertung;
        
            try (FileWriter dateischreiben = new FileWriter("C:\\Users\\dserazin\\Desktop\\"+name+"_SSP.txt"))
            {
                dateischreiben.write("LogDatei Spielverlauf\r\n" +auswertung);
            } 
            catch (Exception ausnahmeInfo) 
            {
                ausnahmeInfo.printStackTrace();
            }
               
        
        }

    
    }

   

    
 
    
        
        
        
        
  
