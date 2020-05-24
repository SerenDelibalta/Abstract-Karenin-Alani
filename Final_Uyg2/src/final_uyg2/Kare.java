package final_uyg2;
public class Kare extends Sekill{
	private double kenar1;
	public Kare(double kenar1)
	{
		this.setKenar1(kenar1);
	}
          // Double değer döndürüyoruz
	public double getKenar1() {
		return kenar1;
	}
         //Set metotu ile değer giriyoruz
	public void setKenar1(double kenar1) {
		this.kenar1 = kenar1;
	}
          // Double değer döndürüyoruz
	public double alan()
	{// Bu işlev iki parametreyi kabul eder ve ikinci
            //parametreye yükseltilen ilk parametrenin değerini döndürür.
		return Math.pow(kenar1, 2);
	}

}
