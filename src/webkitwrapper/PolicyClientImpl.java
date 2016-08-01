package webkitwrapper;

import java.net.URL;

import com.sun.webkit.PolicyClient;

public class PolicyClientImpl implements PolicyClient {

	@Override
	public boolean permitAcceptResourceAction(long arg0, URL arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitClosePageAction(long arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitEnableScriptsAction(long arg0, URL arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitNavigateAction(long arg0, URL arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitNewPageAction(long arg0, URL arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitRedirectAction(long arg0, URL arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitResubmitDataAction(long arg0, URL arg1, String arg2) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permitSubmitDataAction(long arg0, URL arg1, String arg2) {
		// TODO Auto-generated method stub
		return true;
	}

}
