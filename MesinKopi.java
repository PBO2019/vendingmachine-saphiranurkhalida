public class MesinKopi{
	private String jenisKopi;
	private String Topping;
	private int jumlahStokKopi;

	public MesinKopi(){
		System.out.println("");
	}

	public void setjenisKopi(String jenisKop){
		this.jenisKopi=jenisKop;
	}
	public String getjenisKopi(){
		return jenisKopi;
	}

	public void setTopping(String Topping){
		this.Topping=Topping;
	}
	public String getTopping(){
		return Topping;
	}

	public void setjumlahStokKopi(int jumStokK){
		this.jumlahStokKopi=jumStokK;
	}
	public int getjumlahStokKopi(){
		return jumlahStokKopi;
	}
}