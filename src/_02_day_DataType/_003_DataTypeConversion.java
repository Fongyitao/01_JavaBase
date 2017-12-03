package _02_day_DataType;

public class _003_DataTypeConversion {
    public static void main(String[] args) {
		/*
		//数据类型转换之隐式转换
		int x = 3;
		byte b = 4;

		x = x + b;//运算时，系统把byte（占一个字节）的4隐式提升为int（占4个字节）类型的4，然后再进行求和运算
		System.out.println(x); //结果：7
		*/

		/*
		//强制转换
		int x =3;
		byte b =4;

		b = (byte)(x + b);	// 去掉前3个8位，这就叫强制类型转换
							//如果超出了被赋值的数据类型的取值范围得到的结果会与你期望的结果不同
		System.out.println(b);	// 结果：7
		*/

        byte b = 4;		//占一个字节，-128到127
        int x = 126;
        //0000000 0000000 0000000 100000010		130的二进制
        b = (byte)(b + x);//强转的时候会把前3个八位砍掉，剩下的是100000010是个补码形式，运算都是以补码的形式运算
        //100000010	补码
        //100000001	-1求得反码
        //111111110	除符号位外逐位取反得原码，其二进制为-126
        System.out.println(b);//结果：-126

        byte b1 = (byte)300;
		/*
		 * 300的二进制：00000000 00000000 00000001 00101100
		 * 强制转换byte时，会被强制去掉前3个8位，即 00101100
		 * 00101100	：补码，最高位是0，是个正数，原、反、补相同
		 * 00101100	：原码，其二进制数是 44
		 * */
        System.out.println(b1);//结果44

    }
}