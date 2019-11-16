/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import java.awt.*;
public class Grafistext extends Panel{
    Font f;
    String text = "HALO KHARISMA";
    Grafistext(){
    setBackground(Color.GRAY); //Konstanta dalam class Color
    }
    public void paint(Graphics g){
        f = new Font ("Helvetica", Font.BOLD,48);
        //kotak hijau
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 450, 100);
        //warna hitam pinggiran
        g.setColor(Color.BLACK);
        g.drawRect(8, 8, 450, 100);
        g.setColor(Color.pink);
        g.fillOval(9, 9, 450, 100);
        //diberi pinggiran warna merah tebal(3x)
        g.setColor(Color.red);
        g.drawOval(10,10,450, 100);
        g.drawOval(9, 9, 450, 100);
        g.drawOval(8, 8, 450, 100);
        //tuilisan warna hitam dengan font helvetica
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame ("Texting Graphics Panel");
        Grafistext gp = new Grafistext();
        f.add(gp);
        f.setSize(800, 900);
        f.setVisible(true);
    }
}
