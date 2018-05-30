package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resource.Base;

public class RunBrowser extends Base {

	
	@Test
	
	public void navigation() throws IOException
	{
		driver=initializeBrowser();
		driver.get("https://www.google.com");
	}
}
