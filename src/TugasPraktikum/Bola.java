/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author WINDOWS 10
 */
import java.lang.Math;
public class Bola {
    private double jarijari;
    public Bola(double jarijari){
        this.jarijari=jarijari;}
    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }
      public void showDiameter(){
          System.out.println("Diameter bola :"+2*jarijari);
      }
       public void showLuasPermukaan(){
          System.out.println("Luas Permukaan bola :"+(4/3*Math.PI*Math.pow(jarijari,3)));          
      }
        public void showVolume(){
          System.out.println("Volume bola"+4*Math.PI*Math.pow(jarijari, 2));
      }
    }

