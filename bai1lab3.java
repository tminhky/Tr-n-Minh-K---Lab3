package Lab3;

public class bai1lab3 {
	public class hinhvuong{
		private String tenHinh;
		public String gettenHinh(){
			return tenHinh;
		}
		private int canh;
		public hinhvuong(String tenHinh, int canh){
			this.tenHinh=tenHinh;
			this.canh=canh;
		}
		public float tinhChuvi(){
			return (float) (this.canh*4);
		}
		public float tinhDientich(){
			return (float) (this.canh * this.canh);
		}
	}

	public class hinhtron{
	private String tenHinh;
	public String gettenHinh(){
		return tenHinh;
	}
	private double banKinh;
	private double duongKinh;
	public double getduongKinh(){
		return duongKinh;
	}
	public hinhtron(String tenHinh,double banKinh,double duongKinh){
		this.tenHinh =tenHinh;
		this.banKinh =banKinh;
		this.duongKinh =duongKinh;
	}
	public float tinhchuvi(){
		double PI=3.14;
		return (float) (this.banKinh * PI * 2);
	}
	public double tinhdientich(){
		double PI=3.14;
		return this.banKinh * this.banKinh * PI;
	}
}
}
