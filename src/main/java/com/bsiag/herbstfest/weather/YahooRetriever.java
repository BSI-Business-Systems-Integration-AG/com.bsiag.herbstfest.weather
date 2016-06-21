package com.bsiag.herbstfest.weather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

	private static Logger log = Logger.getLogger(YahooRetriever.class);

	public InputStream retrieve(String woeid) throws Exception {
		log.info("Retrieving Weather Data");
		String url = "https://query.yahooapis.com/v1/public/yql?q=select+%2A+from+weather.forecast+where+woeid%3D" + woeid + "&format=xml";
		URLConnection conn = new URL(url).openConnection();
		return conn.getInputStream();
	}
}