package webkitwrapper;

import com.sun.webkit.WebPageClient;
import com.sun.webkit.graphics.WCGraphicsContext;
import com.sun.webkit.graphics.WCPageBackBuffer;
import com.sun.webkit.graphics.WCPoint;
import com.sun.webkit.graphics.WCRectangle;

public class WebPageClientImpl<T> implements WebPageClient<T> {

	@Override
	public void addMessageToConsole(String arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WCPageBackBuffer createBackBuffer() {
		// TODO Auto-generated method stub
		return new WCPageBackBuffer() {

			@Override
			protected void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public WCGraphicsContext createGraphics() {
				// TODO Auto-generated method stub
				System.out.println("returning null graphics context");
				return null;
			}

			@Override
			public void disposeGraphics(WCGraphicsContext arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void flush(WCGraphicsContext arg0, int arg1, int arg2, int arg3, int arg4) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean validate(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return true;
			}
			
		};
	}

	@Override
	public void didClearWindowObject(long arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getContainer() {
		// TODO Auto-generated method stub
		System.out.println("returning null container");
		return null;
	}

	@Override
	public WCRectangle getScreenBounds(boolean arg0) {
		// TODO Auto-generated method stub
		return new WCRectangle(100, 100, 100, 100);
	}

	@Override
	public int getScreenDepth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBackBufferSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WCPoint screenToWindow(WCPoint arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public void setCursor(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFocus(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTooltip(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferFocus(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WCPoint windowToScreen(WCPoint arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

}
