package org.whole.crossexamples.lwc13.ui.swt;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

public class SWTUtils {
	public static void runApplication(Runnable runnable) {
		boolean isAppleOSX = System.getProperty("os.name").equals("Mac OS X");
		if (isAppleOSX) {
			try {
				//com.apple.concurrent.Dispatch.getInstance().getBlockingMainQueueExecutor().execute(threadRunner);
				Class<?> comAppleConcurrentDispatch = Class.forName("com.apple.concurrent.Dispatch");
				Method getInstance = comAppleConcurrentDispatch.getMethod("getInstance", (Class<?>[])null);
				Object dispatchInstance = getInstance.invoke(null,(Object[])null);
				Method getBlockingMainQueueExecutor = dispatchInstance.getClass().getMethod("getBlockingMainQueueExecutor", (Class<?>[])null);
				Executor executor = (Executor) getBlockingMainQueueExecutor.invoke(dispatchInstance, (Object[]) null);
				executor.execute(runnable);
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		} else
			runnable.run();
	}
}
