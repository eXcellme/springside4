package org.springside.examples.quickstart.functional;

import org.eclipse.jetty.server.Server;

public class Main {
	public static void main(String[] args) throws Exception {
		Server s = new Server(8090);
		s.start();
		
	}
}
