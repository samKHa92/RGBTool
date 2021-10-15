package fop.w7color;

public class RgbaColor extends RgbColor
{
	private final int alpha;
	
	public RgbaColor(int bitDepth, int red, int green, int blue, int alpha)
	{
		super(bitDepth, red, green, blue);
		this.alpha = alpha;
		if(alpha > IntMath.powerOfTwo(bitDepth)-1 || alpha < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for alpha channel.");
	}

	public int getAlpha() 
	{
		return alpha;
	}
	
	@Override
	public RgbColor8Bit toRgbColor8Bit()
	{
		if(alpha == IntMath.powerOfTwo(super.getBitDepth())-1)
			return super.toRgbColor8Bit();
		ExceptionUtil.unsupportedOperation("Alpha channel is not maximal");
		return null;
	}

}
