/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author WINDOWS 10
 */
public class mesa {
    public static void main(String[] args) {
        MesatiAndriyani biodata = new MesatiAndriyani();
        biodata.setNamaAyah("Anwar Sanusi");
        biodata.setNamaIbu("Widiyastuti");
        biodata.setNamaSendiri("Mesati Andriyani");
        biodata.setUmur(16);
        biodata.setNamaSaudara("Fahira Wardatul Zahra");
        biodata.setAddress("Lesanpuro");
        biodata.setHobi("Baca Webtoon");
        biodata.setCitacita("Bussines Woman");
        
        System.out.println("      ----BIODATA----");
        System.out.println("Nama Ayah    : " + biodata.getNamaAyah());
        System.out.println("Nama Ibu     : " + biodata.getNamaIbu());
        System.out.println("Nama Sendiri : " + biodata.getNamaSendiri());
        System.out.println("Umur         : " + biodata.getUmur());
        System.out.println("Nama Saudara : " + biodata.getNamaSaudara());       
        System.out.println("Address      : " + biodata.getAddress());
        System.out.println("Hobi         : " + biodata.getHobi());
        System.out.println("Cita-cita    : " + biodata.getCitacita());            
    }
}

