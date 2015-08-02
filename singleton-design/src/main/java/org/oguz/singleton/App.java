package org.oguz.singleton;

public class App {

	public static void main(String[] args) {
		
		ThreadSafeLazyInstantiation lazy = ThreadSafeLazyInstantiation.getInstance();
		ThreadSafeLazyInstantiation lazy2 = ThreadSafeLazyInstantiation.getInstance();
		System.out.println("ThreadSafeLazyInstantiation= "+lazy);
		System.out.println("ThreadSafeLazyInstantiation2= "+lazy2);
		
	}

}
