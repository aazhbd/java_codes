import java.io.*;
import java.math.*;

public class Powers{
	BigInteger mPower(BigInteger x, BigInteger y)
	{
		BigInteger m, p, z, two;

		m = y;
		p = BigInteger.ONE;
		z = x;
		two = new BigInteger("2");

		while(m.compareTo(BigInteger.ZERO) > 0)
		{
			while( ( (m.mod(two)).compareTo(BigInteger.ZERO) ) == 0)
			{
				m = m.divide(two);

				z = z.multiply(z);
			}

			m = m.subtract(BigInteger.ONE);

			p = p.multiply(z);
		}

		return p;
	}

	public static void main(String args[])
	{
		BigInteger i, lim, r, two;
		Powers p = new Powers();
		
		i = new BigInteger("2");
		lim = new BigInteger("201");
		r = new BigInteger("2");
		two = new BigInteger("7");
		
		try{
			RandomAccessFile f = new RandomAccessFile("C:\\in.txt", "rw");
			
			while( i.compareTo(lim) != 0 )
			{
				r = p.mPower(two, i);
				
				System.out.println("" + r);

				f.seek(f.length());
				f.writeBytes(i.toString()+ " " + r.toString() + "\r\n");

				i = i.add(BigInteger.ONE);
			}
		}
		catch(IOException ioe)
		{
			System.out.println("Can't write file " + ioe);
		}
	}
}
