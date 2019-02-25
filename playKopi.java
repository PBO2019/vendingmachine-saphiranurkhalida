import java.util.ArrayList;
import java.util.Scanner;

public class playKopi{
	public static void main(String[] args){
		ArrayList<String> kopi   = new ArrayList<>();
		ArrayList<String> Topping   = new ArrayList<>();

		MesinKopi robusta = new MesinKopi();
		robusta.setjenisKopi("Robusta");
        robusta.setjumlahStokKopi(40);
        robusta.setTopping("Gula");
        kopi.add(robusta.getjenisKopi());
        Topping.add(robusta.getTopping());

        MesinKopi arabica = new MesinKopi();
		arabica.setjenisKopi("Arabica");
        arabica.setjumlahStokKopi(40);
        arabica.setTopping("Susu");
        kopi.add(arabica.getjenisKopi());
        Topping.add(arabica.getTopping());

         MesinKopi flores = new MesinKopi();
		flores.setjenisKopi("Flores");
        flores.setjumlahStokKopi(40);
        flores.setTopping("Cream");
        kopi.add(flores.getjenisKopi());
        Topping.add(flores.getTopping());

        System.out.println("      MENU KOPI ");
        System.out.println("");
		for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Masukan kopi yang mau dipilih ");
        String x = s.next();
        System.out.print("Masukan topping yang mau dipilih ");
        String y = s.next();

        System.out.println("Pesanan anda adalah kopi " +x+ " dengan topping " +y);
	}
}