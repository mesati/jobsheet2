package TugasPraktikum;
public class UjiBus4 {
     public static void main(String[] args)
    { int password;
    
     bus4 busBesar = new bus4(40);
     busBesar.cetakpenumpang();
     
     busBesar.getpenumpang(123);
     busBesar.cetakpenumpang();
     
     busBesar.addpenumpang (121);
     busBesar.cetakpenumpang();
     
     busBesar.addpenumpang (123);
     busBesar.cetakpenumpang();
     
System.out.println("Rata-rata penumpang :"+busBesar.getAverage());
    }}

