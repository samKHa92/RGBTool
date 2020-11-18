package fop.w7color;

public class RgbaColor extends RgbColor
{
	private final int alpha;
	
	public RgbaColor(int bitDepth, int red, int green, int blue, int alpha)
	{
		super(bitDepth, red, green, blue);
		this.alpha = alpha;
	}

	public int getAlpha() 
	{
		return alpha;
	}
	
	public RgbColor8Bit toRgbColor8Bit()
	{
		RgbColor8Bit temp = null;
		return temp;
	}

}
