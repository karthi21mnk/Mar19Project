package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Execution {
	public static void main(String[] args) throws IOException {
		
		HDFCHomePage h = new HDFCHomePage();
		h.setCustomerId("Babu");
		h.setPassword(321);
	    
		HDFCHomePage h1 = new HDFCHomePage();
		h1.setCustomerId("Ram");
		h1.setPassword(123);
	
		HDFCHomePage h2 = new HDFCHomePage();
		h2.setCustomerId("Ravi");
		h2.setPassword(222);
		
		HDFCHomePage h3 = new HDFCHomePage();
		h3.setCustomerId("Ashok");
		h3.setPassword(555);
		
		List<String> li = new ArrayList();
		li.add("java");
		li.add("selenium");
		li.add("python");
		li.add("framework");
		
		List<HDFCHomePage> ul = new ArrayList();
		ul.add(h);
		ul.add(h1);
		ul.add(h2);
		ul.add(h3);
		
		Set<HDFCHomePage> si = new LinkedHashSet();
		si.add(h);
		si.add(h1);
		si.add(h2);
		si.add(h3);
		
		Map<Integer,HDFCHomePage> m = new LinkedHashMap();
		m.put(10, h);
		m.put(20, h1);
		m.put(30, h2);
		m.put(40, h3);
		
		System.out.println("==========Pre defined List Iteration=======");
		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println(string);
		}
		
		System.out.println("=========User defined List Iteration========");
		for(int i=0; i<ul.size();i++) {
			HDFCHomePage hdfcHomePage = ul.get(i);
			System.out.println(hdfcHomePage.getCustomerId());
			
		System.out.println("=======User defined Set Iteration======");
		for(HDFCHomePage s:si) {
			System.out.println(s.getCustomerId());
		}
		
		System.out.println("=======User defined Map Iteration=======");
		Set<Entry<Integer,HDFCHomePage>> entrySet = m.entrySet();
		for(Entry<Integer,HDFCHomePage> e:entrySet) {
			System.out.println(e.getValue().getCustomerId());
		}
		}
		
}
}