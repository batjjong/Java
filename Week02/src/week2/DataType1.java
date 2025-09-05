package week2;

public class DataType1 {
	public static void main(String[] args) {
		//기본데이터 타입
		//직접 값을 주는 초기값 => 리터럴
		byte Bdata=65;  			//byte	 = 1byte
		char Cdata=65;  			//char	 = 2byte
		short Sdata=65; 			//short	 = 2byte
		int Idata= 65;  			//int 	 = 4byte
		long Ldata=65;  			//long	 = 8byte
		
		float Fdata=65.12f;  		//float = 4byte
		double Ddata=65.12f; 		//double = 8byte
		
		boolean booldata = true; 	//boolen = 1byte
		
		System.out.println("Bdata = "+ Bdata);
		System.out.println("Cdata = "+ Cdata);
		System.out.println("Sdata = "+ Sdata);
		System.out.println("Idata = "+ Idata);
		System.out.println("Ldata = "+ Ldata);
		
		System.out.println("Fdata = "+ Fdata);
		System.out.println("Ddata = "+ Ddata);
		
		System.out.println("booldata = "+ booldata);
	}
}
