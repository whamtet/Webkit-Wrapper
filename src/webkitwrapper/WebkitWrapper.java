package webkitwrapper;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.sun.glass.utils.NativeLibLoader;
import com.sun.webkit.InspectorClient;
import com.sun.webkit.Invoker;
import com.sun.webkit.PolicyClient;
import com.sun.webkit.ThemeClient;
import com.sun.webkit.UIClient;
import com.sun.webkit.WebPage;
import com.sun.webkit.WebPageClient;
import com.sun.webkit.graphics.WCGraphicsManager;

import clojure.main;
import webkitwrapper.graphics.WCGraphicsManagerImpl;
import webkitwrapper.thread.InvokerImpl;

public class WebkitWrapper {

	public static void main(String[] args) throws Exception {
		main.main(args);
		URL u = null;
		u.getFile();
		System.loadLibrary("libjfxwebkit");
		//System.out.println("loaded");
	}
	
	public static Set<Long> getFrames(WebPage p) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Field f = p.getClass().getDeclaredField("frames"); //NoSuchFieldException
		f.setAccessible(true);
		return (Set<Long>) f.get(p); //IllegalAccessException
	}
	
	public static WebPage getPage() throws Exception {
		
		NativeLibLoader.loadLibrary("jfxwebkit");
		InspectorClient inspectorClient = new InspectorClientImpl();
		PolicyClient policyClient = new PolicyClientImpl();
		ThemeClient themeClient = new ThemeClientImpl();
		UIClient uiClient = new UIClientImpl();
		WebPageClient pageClient = new WebPageClientImpl();
		boolean editable = true;
		
		Invoker.setInvoker(new InvokerImpl());
		WCGraphicsManager.setGraphicsManager(new WCGraphicsManagerImpl());
		
		WebPage page = new WebPage(pageClient,
                uiClient,
                policyClient,
                inspectorClient,
                themeClient,
                editable);
		
		
		return page;
		
//		Field f = page.getClass().getDeclaredField("isDisposed"); //NoSuchFieldException
//		f.setAccessible(true);
//		Object o = f.get(page); //IllegalAccessException
//		System.out.println(page.isJavaScriptEnabled());

	}

}
