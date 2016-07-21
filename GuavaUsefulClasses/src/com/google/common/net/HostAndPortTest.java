package com.google.common.net;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HostAndPortTest {
	
	/*
	HostAndPort
	HostSpecifier
	InetAddresses
	InternetDomainName
	UrlEscapers
	*/
	
	@Test
	public void test_hostAndPort(){
		String hostWitPort_1 = "[2001:db8::1]";
		String hostWitPort_2 = "127.0.0.1:1999";
		String hostWitPort_3 = "http://127.0.0.1:99";
		
		HostAndPort hp1 = HostAndPort.fromString(hostWitPort_1).withDefaultPort(80);
		assertEquals("2001:db8::1", hp1.getHostText());
		assertEquals(80, hp1.getPort());
		
		
		HostAndPort hp2 = HostAndPort.fromString(hostWitPort_2).withDefaultPort(80);;
		System.out.println(hp2.getHostText());
		assertEquals("127.0.0.1", hp2.getHostText());
		assertEquals(1999, hp2.getPort());
		
		HostAndPort hp3 = HostAndPort.fromString(hostWitPort_3).withDefaultPort(80);;
		assertEquals("127.0.0.1", hp2.getHostText());
		assertEquals(99, hp2.getPort());
		
	}

}
