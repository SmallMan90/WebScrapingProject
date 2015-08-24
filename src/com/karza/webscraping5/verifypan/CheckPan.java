package com.karza.webscraping5.verifypan;

import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class CheckPan {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 Connection.Response loginForm = Jsoup.connect("http://mahavat.gov.in/Tin_Search/Tinsearch.jsp").userAgent("Mozilla")
	                .method(Connection.Method.POST)
	                .execute();
	        Document document = Jsoup.connect("http://mahavat.gov.in/Tin_Search/Tinsearch.jsp").userAgent("Mozilla")
	                .data("cookieexists", "false")
	                .data("pan", "AACPM9386P")
	                .data("Submit", "SEARCH")
	                .cookies(loginForm.cookies())
	                .post();
	    
		 
		 System.out.println(document);
		
	}

}
