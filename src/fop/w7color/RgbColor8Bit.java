package fop.w7color;

public class RgbColor8Bit extends RgbColor
{
	public RgbColor8Bit (int red, int green, int blue)
	{
		super(8, red, green, blue);
	}
	
	@Override
	public RgbColor8Bit toRgbColor8Bit()
	{
		RgbColor8Bit temp = new RgbColor8Bit (super.getRed(), super.getGreen(), super.getBlue());
		return temp;
	}
}
