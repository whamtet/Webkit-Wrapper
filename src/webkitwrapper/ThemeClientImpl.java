package webkitwrapper;

import com.sun.webkit.ThemeClient;
import com.sun.webkit.graphics.RenderTheme;
import com.sun.webkit.graphics.ScrollBarTheme;

import webkitwrapper.theme.*;

public class ThemeClientImpl extends ThemeClient {

	@Override
	protected RenderTheme createRenderTheme() {
		// TODO Auto-generated method stub
		return new RenderThemeImpl(); 
	}

	@Override
	protected ScrollBarTheme createScrollBarTheme() {
		// TODO Auto-generated method stub
		return new ScrollBarThemeImpl();
	}

}
