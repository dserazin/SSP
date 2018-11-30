package SSP;


import javax.swing.JOptionPane;

/**
 *
 * @author CC-Student
 */
public class Schere_Stein_Papier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String spielerName = JOptionPane.showInputDialog("Gib deinen Namen ein");
        KI_Wahl kiwahl = new KI_Wahl();
        DataWrite newdata = new DataWrite();
        String ergebnis = "KI WINNS";
        newdata.DateiErstellen(spielerName);
        
        System.out.println("Wilkommen " +spielerName+ " zu deinem Spiel\n\rWieviel Runden möchtest du Spielen?");
        int rundenzahl = Integer.parseInt(JOptionPane.showInputDialog("Gib Die Rundenanzahl ein"));
        System.out.println("Es werden " +rundenzahl+ " Runden gespielt\r\n");
   
        int zählerSpieler = 0;
        int zählerKI = 0;
        int sieger = 0 ;
        int anz = 0;
        String text = "" ;
        
       
        
        for (int i = 0; i < rundenzahl; i++) {
           
            String entscheidung = JOptionPane.showInputDialog("Wähle: Schere, Stein oder Papier");
            
            String ki_zahl = kiwahl.ZufallsWahl();
            System.out.println("\r\n" +ki_zahl+ " gegen " +entscheidung);
            text = text+ "\r\n" +ki_zahl+ " gegen " +entscheidung+
            anz++;
            if (entscheidung.equals(ki_zahl)) {
                System.out.println(entscheidung+ "Unentschieden ");
                text = text+entscheidung+ "\r\nUnentschieden ";
                sieger = 3;
            } else if (entscheidung.equals("Schere") && ki_zahl.equals("Papier")) {
                sieger = 1;
            } else if (entscheidung.equals("Stein") && ki_zahl.equals("Papier")) {
                sieger = 2;
            } else if (entscheidung.equals("Papier") && ki_zahl.equals("Schere")) {
                sieger = 2;
            } else if (entscheidung.equals("Papier") && ki_zahl.equals("Stein")) {
                sieger = 1;
            } else if (entscheidung.equals("Schere") && ki_zahl.equals("Stein")) {
                sieger = 2;
            } else if (entscheidung.equals("Stein") && ki_zahl.equals("Schere")) {
                sieger = 1;
            }

            if (sieger == 1) {
                // zuzählen für statistik
                zählerSpieler++;
                System.out.println(spielerName + " Du hast gepunktet ");
                text = text+spielerName+ "\r\nDu hast gepunktet ";
            } else if (sieger == 3)
                    {
                        System.out.println("Keiner Punktet in dieser Runde ");
                        text = text+ "\r\nKeiner Punktet in dieser Runde ";
                    }
              else
            {
                // zuzählen für statistik
                zählerKI++;
                System.out.println("KI punktet ");
                text = text+ " \r\nKI punktet ";
                
            }

        }

        //Statistik Auswertung
        /* If(user_stat > ki_stat) ausgabe user gewonnen */ 
        JOptionPane.showMessageDialog(null, "Es wurden " +anz+ " runden gespielt");
        if (zählerKI > zählerSpieler)
           
        {
        JOptionPane.showMessageDialog(null," KI WINNS");
        }
        else 
        {
        JOptionPane.showMessageDialog(null, spielerName + " WINNS");
        }
        String auswertung = (text+ "\r\n" );
        newdata.DateiSchreiben(auswertung);
    }

}
