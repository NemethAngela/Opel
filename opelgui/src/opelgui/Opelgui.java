/*
* File: Opelgui.java
* Author: Németh Angéla
* Copyright: 2024, Németh Angéla
* Group: Szoft II-1-E
* Date: 2024-02-05
 */
package opelgui;

/**
 *
 * @author Angéla
 */
public class Opelgui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
}
