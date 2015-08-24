package com.karza.webscraping5.verifypan;


public class PanCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a new RedditClient and log us in!
        RedditClient client = new RedditClient("AACPM9386P");
        client.login();

        
        //Let's scrape our messages, information behind a login.
        //https://www.reddit.com/message/messages/ is the URL where messages are located.
        String page = client.get("http://mahavat.gov.in/Tin_Search/Tinsearch.jsp");

        //"div.md" selects all divs with the class name "md", that's where message
        //bodies are stored. You'll find "<div class="md">" before each message.
        //Elements messages = Jsoup.parse(page).select("div.md");

        System.out.println(page);
        
        //For each message in messages, let's print out message and a new line.
        //for(Element message : messages){
          //  System.out.println(message.text() + "\n");
	}

}
