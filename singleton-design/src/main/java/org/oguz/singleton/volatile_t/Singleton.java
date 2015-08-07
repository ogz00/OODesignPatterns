package org.oguz.singleton.volatile_t;

public class Singleton {
	private volatile static Singleton Instance;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (Instance == null) {
			synchronized (Singleton.class) {
				if (Instance == null) {
					Instance = new Singleton();
				}
			}
		}

		return Instance;
	}

}
