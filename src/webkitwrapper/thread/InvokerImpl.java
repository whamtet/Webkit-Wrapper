package webkitwrapper.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.webkit.Invoker;

public class InvokerImpl extends Invoker {
	
	final ExecutorService exService = Executors.newSingleThreadExecutor();

	@Override
	public void invokeOnEventThread(Runnable arg0) {
		// TODO Auto-generated method stub
		System.out.println("invoking");
		//(new Thread(arg0)).start();
		exService.submit(arg0);
		//arg0.run();
	}

	@Override
	protected boolean isEventThread() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void postOnEventThread(Runnable arg0) {
		// TODO Auto-generated method stub
		throw new RuntimeException("posting disabled");
		//(new Thread(arg0)).start();
		//exService.submit(arg0);
		//arg0.run();
	}

}
