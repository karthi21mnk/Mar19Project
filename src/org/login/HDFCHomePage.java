package org.login;


import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class HDFCHomePage {

	private String customerId;
	private int password;

	public void setCustomerId(String input1) {
		if (input1.equals("Ram")) {
			customerId = "Ram username is correct";

		} else if (input1.equals("Babu")) {
			customerId = "Babu username is correct ";

		} else if (input1.equals("Ravi")) {
			customerId = "Ravi username is correct";

		} else {
			customerId = "Invalid username";
		}
	}

	public void setPassword(int pass1) {
		if (pass1 == 123 && customerId.equals("Ram username is correct")) {
			password = 1;

		} else if (pass1 == 321 && customerId.equals("Babu username is correct")) {
			password = 2;

		} else if (pass1 == 222 && customerId.equals("Ravi username is correct")) {
			password = 3;

		} else {
			password = 0;
		}
	}

	public String getCustomerId() throws IOException  {
		if (password==1) {
			Map<String,String> readDataFromDb = readDataFromDb();
			Set<Entry<String,String>> entrySet = readDataFromDb.entrySet();
		for (Entry<String,String> e: entrySet) {
			if(e.getKey().equals("Ram")) {
				System.out.println(e);
			}
		}	
			
			return null;
		}
		else if (password==2) {
			Map<String,String> readDataFromDb = readDataFromDb();
			Set<Entry<String,String>> entrySet = readDataFromDb.entrySet();
			for (Entry<String,String> e:entrySet) {
				if(e.getKey().equals("Babu")) {
					System.out.println(e);
				}
	}
			return null;
			
		}

		else if (password==3) {
		Map<String, String> readDataFromDb = readDataFromDb();
	    Set<Entry<String,String>> entrySet = readDataFromDb.entrySet();
	    for(Entry<String,String> e:entrySet) {
	    	if(e.getKey().equals("Ravi")) {
	    		System.out.println(e);
	    	}
	    }
	    return null;
	}
		else {
			return "Invalid User";
		}
}
	public int getPassword() {
		return 0;
	}
	public Map<String, String>readDataFromDb() throws IOException {
		File f = new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\APIhdfcBanking\\\\DataBase\\\\HDFCDatabase.txt");
		List<String> readLines = FileUtils.readLines(f);
		Map<String, String> m = new LinkedHashMap();
		//System.out.println(m);
		for (int i=0; i<readLines.size(); i++) {
			String string = readLines.get(i);
			String[] split = string.split(",");
			m.put(split[0], split[2]);
			
		}
		return m;
	}
}
