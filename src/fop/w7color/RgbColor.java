package fop.w7color;

public class RgbColor 
{
	private final int red;
	private final int green;
	private final int blue;
	private final int bitDepth;
	
	public RgbColor(int bitDepth, int red, int green, int blue)
	{
		/*if(red >= 0 && red < IntMath.powerOfTwo(bitDepth)-1)
			this.red = red;
		else
		{*/
		//	ExceptionUtil.unsupportedOperation("Red is out of range");
			this.red = red;
		//}
		
		
		/*if(green >= 0 && green < IntMath.powerOfTwo(bitDepth)-1)
			this.green = green;
		else
		{
			ExceptionUtil.unsupportedOperation("Green is out of range");*/
			this.green = green;
		//}
		
		/*if(blue >= 0 && blue < IntMath.powerOfTwo(bitDepth)-1)
			this.blue = blue;
		else
		{*/
		//	ExceptionUtil.unsupportedOperation("Blue is out of range");
			this.blue = blue;
		//}
		
		this.bitDepth = bitDepth;
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
	/*
	public RgbColor8Bit toRgbColor8Bit()
	{
		RgbColor8Bit temp = null;
		return temp;
	}
	*/
}
