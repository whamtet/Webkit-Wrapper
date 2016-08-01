package webkitwrapper.graphics;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import com.sun.webkit.graphics.WCFont;
import com.sun.webkit.graphics.WCFontCustomPlatformData;
import com.sun.webkit.graphics.WCGraphicsContext;
import com.sun.webkit.graphics.WCGraphicsManager;
import com.sun.webkit.graphics.WCImage;
import com.sun.webkit.graphics.WCImageDecoder;
import com.sun.webkit.graphics.WCImageFrame;
import com.sun.webkit.graphics.WCMediaPlayer;
import com.sun.webkit.graphics.WCPageBackBuffer;
import com.sun.webkit.graphics.WCPath;
import com.sun.webkit.graphics.WCRectangle;
import com.sun.webkit.graphics.WCRenderQueue;
import com.sun.webkit.graphics.WCTransform;

public class WCGraphicsManagerImpl extends WCGraphicsManager {

	@Override
	protected WCRenderQueue createBufferedContextRQ(WCImage arg0) {
		// TODO Auto-generated method stub
		WCRectangle r = new WCRectangle();
		return new WCRenderQueueImpl(r, true);
	}

	@Override
	protected WCFontCustomPlatformData createFontCustomPlatformData(InputStream arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("returning null platformdata");
		return null;
	}

	@Override
	protected WCImageFrame createFrame(int arg0, int arg1, ByteBuffer arg2) {
		// TODO Auto-generated method stub
		System.out.println("returning null imageframe");
		return null;
	}

	@Override
	public WCGraphicsContext createGraphicsContext(Object arg0) {
		// TODO Auto-generated method stub
		System.out.println("returning null graphicscontext");
		return null;
	}

	@Override
	protected WCMediaPlayer createMediaPlayer() {
		// TODO Auto-generated method stub
		System.out.println("returning null mediaplayer");
		return null;
	}

	@Override
	public WCPageBackBuffer createPageBackBuffer() {
		// TODO Auto-generated method stub
		System.out.println("returning null pagebackbuffer");
		return null;
	}

	@Override
	protected WCImage createRTImage(int arg0, int arg1) {
		// TODO Auto-generated method stub
		System.out.println("returning null WCImage");
		return null;
	}

	@Override
	public WCRenderQueue createRenderQueue(WCRectangle arg0, boolean arg1) {
		// TODO Auto-generated method stub
		System.out.println("returning null render queue");
		return null;
	}

	@Override
	protected WCTransform createTransform(double arg0, double arg1, double arg2, double arg3, double arg4,
			double arg5) {
		// TODO Auto-generated method stub
		System.out.println("returning null transform");
		return null;
	}

	@Override
	protected WCImage createWCImage(int arg0, int arg1) {
		// TODO Auto-generated method stub
		System.out.println("returning null WCImage");
		return null;
	}

	@Override
	protected WCPath createWCPath() {
		// TODO Auto-generated method stub
		System.out.println("returning null WCPath");
		return null;
	}

	@Override
	protected WCPath createWCPath(WCPath arg0) {
		// TODO Auto-generated method stub
		System.out.println("returning null WCPath arg0");
		return null;
	}

	//@Override
	public float getDevicePixelScale() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public WCImage getIconImage(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("returning null IconImage");
		return null;
	}

	@Override
	protected WCImageDecoder getImageDecoder() {
		// TODO Auto-generated method stub
		System.out.println("returning null ImageDecoder");
		return null;
	}

	@Override
	protected WCFont getWCFont(String arg0, boolean arg1, boolean arg2, float arg3) {
		// TODO Auto-generated method stub
		System.out.println("returning dud WCFont");
		return new WCFontImpl();
	}

	@Override
	public Object toPlatformImage(WCImage arg0) {
		// TODO Auto-generated method stub
		System.out.println("returning null platformImage");
		return null;
	}

}
