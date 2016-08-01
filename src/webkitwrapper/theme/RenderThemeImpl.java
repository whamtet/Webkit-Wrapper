package webkitwrapper.theme;

import java.nio.ByteBuffer;

import com.sun.webkit.graphics.Ref;
import com.sun.webkit.graphics.RenderTheme;
import com.sun.webkit.graphics.WCGraphicsContext;
import com.sun.webkit.graphics.WCSize;

public class RenderThemeImpl extends RenderTheme {

	@Override
	protected Ref createWidget(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ByteBuffer arg6) {
		// TODO Auto-generated method stub
		System.out.println("RenderTheme.createWidget");
		return new Ref();
	}

	@Override
	public void drawWidget(WCGraphicsContext arg0, Ref arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	protected int getRadioButtonSize() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getSelectionColor(int arg0) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public WCSize getWidgetSize(Ref arg0) {
		// TODO Auto-generated method stub
		return new WCSize(10, 10);
	}

}
