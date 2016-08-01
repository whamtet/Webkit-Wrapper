package webkitwrapper;

import com.sun.webkit.UIClient;
import com.sun.webkit.WebPage;
import com.sun.webkit.graphics.WCImage;
import com.sun.webkit.graphics.WCRectangle;

public class UIClientImpl implements UIClient {

	@Override
	public void alert(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] chooseFile(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return new String[]{};
	}

	@Override
	public void closePage() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean confirm(String arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void confirmStartDrag() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebPage createPage(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
		// TODO Auto-generated method stub
		System.out.println("Returning null page");
		return null;
	}

	@Override
	public WCRectangle getViewBounds() {
		// TODO Auto-generated method stub
		return new WCRectangle(100, 100, 100, 100);
	}

	@Override
	public boolean isDragConfirmed() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public String prompt(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setStatusbarText(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setViewBounds(WCRectangle arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showView() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startDrag(WCImage arg0, int arg1, int arg2, int arg3, int arg4, String[] arg5, Object[] arg6) {
		// TODO Auto-generated method stub

	}

}
