package webkitwrapper.theme;

import com.sun.webkit.graphics.Ref;
import com.sun.webkit.graphics.ScrollBarTheme;
import com.sun.webkit.graphics.WCGraphicsContext;
import com.sun.webkit.graphics.WCSize;

public class ScrollBarThemeImpl extends ScrollBarTheme {

	@Override
	protected Ref createWidget(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		// TODO Auto-generated method stub
		System.out.println("ScrollBarTheme.createWidget");
		return new Ref();
	}

	@Override
	protected int getThumbLength(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getThumbPosition(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getTrackLength(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getTrackPosition(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public WCSize getWidgetSize(Ref arg0) {
		// TODO Auto-generated method stub
		return new WCSize(10, 10);
	}

	@Override
	protected int hitTest(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paint(WCGraphicsContext arg0, Ref arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub

	}

}
