public class Topping{
	private String jenisTopping;
	private int jumlahStokTopping;

	public Topping{
		System.out.println("");
	}

	public void setjenisTopping(String jenisTop){
		this.jenisTopping=jenisTop;
	}
	public void setjumlahStokTopping(int jumStokT){
		this.jumlahStokTopping=jumStokT;
	}
	public String getjenisTopping(){
		return jenisTopping;
	}
	public int getjumlahStokTopping(){
		return jumlahStokTopping;
	}
}