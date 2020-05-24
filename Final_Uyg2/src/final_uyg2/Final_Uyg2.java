/* Soyut sınıflar soyut metotlar kullanarak bir karenin alanını hesaplayan
içerisinde  "Kare" ve  "Sekil1" adında iki class bulunan program
*/
package final_uyg2;
public class Final_Uyg2 {
    public static void main(String[] args) {
        Sekill sekil=new Kare(3); //nesne oluşturma
		System.out.println("Karenin alanı : "+sekil.alan()); //ekrana yazdırma
    }
    
}
