package org.oguz.singleton;


public class ThreadSafeLazyInstantiation {
	private static final String DEFAULT_NAME =ThreadSafeLazyInstantiation.class.getCanonicalName();
	private String className =DEFAULT_NAME;

	private static ThreadSafeLazyInstantiation instance = null;

	private ThreadSafeLazyInstantiation() {
	}

	public synchronized static ThreadSafeLazyInstantiation getInstance() {
		/*
		 * The instance gets created only when it is called for first time.
		 * Lazy-loading
		 */
		if (instance == null) {
			instance = new ThreadSafeLazyInstantiation();
		}

		return instance;

	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
