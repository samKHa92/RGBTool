package fop.w7color;

public class RgbColor 
{
	private final int red;
	private final int green;
	private final int blue;
	private final int bitDepth;
	
	public RgbColor(int bitDepth, int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.bitDepth = bitDepth;
		if(bitDepth <= 0 || bitDepth > 31)
			ExceptionUtil.unsupportedOperation("Wrong value for bitDepth.");
		if(red > IntMath.powerOfTwo(bitDepth)-1 || red < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for red.");
		if(green > IntMath.powerOfTwo(bitDepth)-1 || green < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for green.");
		if(blue > IntMath.powerOfTwo(bitDepth)-1 || blue < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for blue.");
	}

	public int getRed() 
	{
		return red;
	}

	public int getGreen() 
	{
		return green;
	}

	public int getBlue() 
	{
		return blue;
	}

	public int getBitDepth() 
	{
		return bitDepth;
	}
	
	public RgbColor8Bit toRgbColor8Bit()
	{
		RgbColor8Bit temp = null;
		if(bitDepth > 8 && bitDepth < 32)
		{
			int finalRed = red / IntMath.powerOfTwo(bitDepth-8-1);
			int finalGreen = green / IntMath.powerOfTwo(bitDepth-8-1);
			int finalBlue = blue / IntMath.powerOfTwo(bitDepth-8-1);
			
			if(finalRed % 2 == 1 && finalRed != 511 && red != 0) finalRed++;
			if(finalGreen % 2 == 1 && finalGreen != 511 && green != 0) finalGreen++;
			if(finalBlue % 2 == 1 && finalBlue != 511 && blue != 0) finalBlue++;
			
			finalRed /= 2;
			finalGreen /= 2;
			finalBlue /=2;
			
			temp = new RgbColor8Bit (finalRed, finalGreen, finalBlue);
		}
		
		if(bitDepth < 8 && bitDepth > 0)
		{
			int maxValue = IntMath.powerOfTwo(bitDepth)-1;
			int coef = 255/maxValue;
			int finalRed = red * coef;
			int finalGreen = green * coef;
			int finalBlue = blue * coef;
			if(255%maxValue > 0) 
			{
				finalRed++;
				finalGreen++;
				finalBlue++;
			}
			temp = new RgbColor8Bit(finalRed, finalGreen, finalBlue);
		}
		
		if(bitDepth == 8)
		{
			temp = new RgbColor8Bit(red, green, blue);
		}
		return temp;
	}

}
