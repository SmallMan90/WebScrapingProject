package com.karza.webscraping5.verifypan;

import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.TestCase;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;


public class CheckPan extends TestCase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.junit.runner.JUnitCore.main("com.karza.webscraping5.verifypan.CheckPan");
	}
	

	@Test
	public void test() throws FailingHttpStatusCodeException,
	MalformedURLException, IOException {
		
		
		WebClient webClient = new WebClient(BrowserVersion.CHROME);
		

		
		HtmlPage inputPage = webClient.getPage("http://mahavat.gov.in/Tin_Search/Tinsearch.jsp");
		HtmlForm form = inputPage.getForms().get(0);
		
		HtmlSubmitInput button = (HtmlSubmitInput) form.getInputsByName("Submit");
		
		HtmlTextInput UserInput = form.getInputByName("pan");
		
		UserInput.setValueAttribute("AZVPD1468R");
		
		HtmlPage outputPage = button.click();
		 
	    String Result = outputPage.getFirstByXPath("//td[@class='subhead-link'");
	    
	    webClient.close();
	    
	    System.out.println(Result);
	    
	    assertEquals(Result, "Records not found");
	}

}
