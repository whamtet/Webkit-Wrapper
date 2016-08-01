package webkitwrapper.graphics;

import java.awt.Font;

import com.sun.webkit.graphics.WCFont;

public class WCFontImpl extends WCFont {

	@Override
	public WCFont deriveFont(float arg0) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public float getAscent() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float getDescent() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int[] getGlyphCodes(char[] arg0) {
		// TODO Auto-generated method stub
		return new int[]{10};
	}

	@Override
	public double getGlyphWidth(int arg0) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float getLineGap() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float getLineSpacing() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getOffsetForPosition(String arg0, float arg1) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getPlatformFont() {
		// TODO Auto-generated method stub
		return new Font("Dialog", Font.PLAIN, 12);
	}

	@Override
	public double[] getStringBounds(String arg0, int arg1, int arg2, boolean arg3) {
		// TODO Auto-generated method stub
		System.out.println("WCFontImpl: returning string bounds");
		return new double[] {10, 10, 20, 20};
	}

	@Override
	public double getStringWidth(String arg0) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float getXHeight() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean hasUniformLineMetrics() {
		// TODO Auto-generated method stub
		return false;
	}

}
