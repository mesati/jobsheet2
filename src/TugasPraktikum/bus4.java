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
public class bus4 {
    private double penumpang;
    private double maxPenumpang;  
    private double penumpangbaru;
    private double counter;
      
public bus4(double maxPenumpang)
{
    this.maxPenumpang = maxPenumpang;
    penumpang = 0;
}
    public  void addpenumpang(double penumpang) 
{
        double temp;
        temp = this.penumpang+penumpang;
        if (temp> maxPenumpang)
        {
            System.out.println("Penumpang melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
            counter++;
        }
    }
    public void getpenumpang(double password) 
    {
        if (password==123)
        {
            System.out.println("\nPassword Benar");
            addpenumpang(15);
        }
        else
        {
            System.out.println("\nPassword Salah!!");
        }
    }
    public double getAverage() {
        return penumpang/counter;
        
    }
public void cetakpenumpang()
{
    System.out.println("Penumpang Bus sekarang adalah"+ penumpang);
    System.out.println("Penumpang maksimum seharusnya adalah"+ maxPenumpang);         
}
}
