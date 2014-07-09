package core.json;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class Json_parser {

	public static void main(String[] args) throws IOException {
		

		URL url_01 = new URL("http://www.geoplugin.net/json.gp?ip=88.191.179.56");
	    URL url_02 = new URL("http://www.geoplugin.net/json.gp?ip=61.135.248.220");
		URL url_03 = new URL("http://www.geoplugin.net/json.gp?ip=92.40.254.196");
		URL url_04 = new URL("http://www.geoplugin.net/json.gp?ip=23.29.223.255");
		URL url_05 = new URL("http://www.geoplugin.net/json.gp?ip=213.87.141.36");
		
		final String element_01 = "geoplugin_countryName";
		final String element_02 = "geoplugin_currencyConverter";
		
        String item_01_name = "Soccer Ball";
		Double item_01_usd_price = 35.00;
		String item_02_name = "Heart Rate Monitor";
		Double item_02_usd_price = 119.00;
		String item_03_name = "Galaxy Tab 4";
		Double item_03_usd_price = 146.99;
		String item_04_name = "GoPro Camera";
		Double item_04_usd_price = 399.00;
		String item_05_name = "Apple iPhone";
		Double item_05_usd_price = 657.98;
		
		Double item_01_eur_price;
		Double item_02_eur_price; 
		Double item_03_eur_price; 
		Double item_04_eur_price; 
		Double item_05_eur_price; 
		
		InputStream is_01 = url_01.openStream();
		JsonParser parser_01 = Json.createParser(is_01);
		InputStream is_02 = url_02.openStream();
		JsonParser parser_02 = Json.createParser(is_02);
		InputStream is_03 = url_03.openStream();
		JsonParser parser_03 = Json.createParser(is_03);
		InputStream is_04 = url_04.openStream();
		JsonParser parser_04 = Json.createParser(is_04);
		InputStream is_05 = url_05.openStream();
		JsonParser parser_05 = Json.createParser(is_05);

		while (parser_01.hasNext()) {

			Event e = parser_01.next();

		if (e == Event.KEY_NAME) {

			switch (parser_01.getString()) {

			case element_01:
				parser_01.next();
				String country_01_name = parser_01.getString();  
				System.out.println("Country: " + country_01_name);
			break;

			case element_02:
				parser_01.next();
				String rate_01 = parser_01.getString();  // Rate
				Double temp = Double.valueOf(rate_01);
				Double rate01 = temp.doubleValue();
        		item_01_eur_price = (double)Math.round(item_01_usd_price * rate01 * 100) / 100;
        		item_02_eur_price = (double)Math.round(item_02_usd_price * rate01 * 100) / 100;
        		item_03_eur_price = (double)Math.round(item_03_usd_price * rate01 * 100) / 100;
        		item_04_eur_price = (double)Math.round(item_04_usd_price * rate01 * 100) / 100;
        		item_05_eur_price = (double)Math.round(item_05_usd_price * rate01 * 100) / 100;
				System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Local Price: " + item_01_eur_price);
				System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Local Price: " + item_02_eur_price);
				System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Local Price: " + item_03_eur_price);
				System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Local Price: " + item_04_eur_price);
				System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Local Price: " + item_05_eur_price);
			break;
			}

		}
		
		while (parser_02.hasNext()) {

			Event f = parser_02.next();

		if (f == Event.KEY_NAME) {

			switch (parser_02.getString()) {

			case element_01:
				parser_02.next();
				String country_01_name = parser_02.getString();  
				System.out.println("Country: " + country_01_name);
			break;

			case element_02:
				parser_02.next();
				String rate_01 = parser_02.getString();  // Rate
				Double temp = Double.valueOf(rate_01);
				Double rate01 = temp.doubleValue();
	       		item_01_eur_price = (double)Math.round(item_01_usd_price * rate01 * 100) / 100;
        		item_02_eur_price = (double)Math.round(item_02_usd_price * rate01 * 100) / 100;
        		item_03_eur_price = (double)Math.round(item_03_usd_price * rate01 * 100) / 100;
        		item_04_eur_price = (double)Math.round(item_04_usd_price * rate01 * 100) / 100;
        		item_05_eur_price = (double)Math.round(item_05_usd_price * rate01 * 100) / 100;
				System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Local Price: " + item_01_eur_price);
				System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Local Price: " + item_02_eur_price);
				System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Local Price: " + item_03_eur_price);
				System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Local Price: " + item_04_eur_price);
				System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Local Price: " + item_05_eur_price + "\r");
			break;
			}

		}
		while (parser_03.hasNext()) {

			Event g = parser_03.next();

		if (g == Event.KEY_NAME) {

			switch (parser_03.getString()) {

			case element_01:
				parser_03.next();
				String country_01_name = parser_03.getString();  
				System.out.println("Country: " + country_01_name);
			break;

			case element_02:
				parser_03.next();
				String rate_01 = parser_03.getString();  // Rate
				Double temp = Double.valueOf(rate_01);
				Double rate01 = temp.doubleValue();
	       		item_01_eur_price = (double)Math.round(item_01_usd_price * rate01 * 100) / 100;
        		item_02_eur_price = (double)Math.round(item_02_usd_price * rate01 * 100) / 100;
        		item_03_eur_price = (double)Math.round(item_03_usd_price * rate01 * 100) / 100;
        		item_04_eur_price = (double)Math.round(item_04_usd_price * rate01 * 100) / 100;
        		item_05_eur_price = (double)Math.round(item_05_usd_price * rate01 * 100) / 100;
				System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Local Price: " + item_01_eur_price);
				System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Local Price: " + item_02_eur_price);
				System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Local Price: " + item_03_eur_price);
				System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Local Price: " + item_04_eur_price);
				System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Local Price: " + item_05_eur_price + "\r");
			break;
			}

		}
		while (parser_04.hasNext()) {

			Event h = parser_04.next();

		if (h == Event.KEY_NAME) {

			switch (parser_04.getString()) {

			case element_01:
				parser_04.next();
				String country_01_name = parser_04.getString();  
				System.out.println("Country: " + country_01_name);
			break;

			case element_02:
				parser_04.next();
				String rate_01 = parser_04.getString();  // Rate
				Double temp = Double.valueOf(rate_01);
				Double rate01 = temp.doubleValue();
	       		item_01_eur_price = (double)Math.round(item_01_usd_price * rate01 * 100) / 100;
        		item_02_eur_price = (double)Math.round(item_02_usd_price * rate01 * 100) / 100;
        		item_03_eur_price = (double)Math.round(item_03_usd_price * rate01 * 100) / 100;
        		item_04_eur_price = (double)Math.round(item_04_usd_price * rate01 * 100) / 100;
        		item_05_eur_price = (double)Math.round(item_05_usd_price * rate01 * 100) / 100;
				System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Local Price: " + item_01_eur_price);
				System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Local Price: " + item_02_eur_price);
				System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Local Price: " + item_03_eur_price);
				System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Local Price: " + item_04_eur_price);
				System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Local Price: " + item_05_eur_price + "\r");
			break;
			}

		}
		while (parser_05.hasNext()) {

			Event i = parser_05.next();

		if (i == Event.KEY_NAME) {

			switch (parser_05.getString()) {

			case element_01:
				parser_05.next();
				String country_01_name = parser_05.getString();  
				System.out.println("Country: " + country_01_name);
			break;

			case element_02:
				parser_05.next();
				String rate_01 = parser_05.getString();  // Rate
				Double temp = Double.valueOf(rate_01);
				Double rate01 = temp.doubleValue();
	       		item_01_eur_price = (double)Math.round(item_01_usd_price * rate01 * 100) / 100;
        		item_02_eur_price = (double)Math.round(item_02_usd_price * rate01 * 100) / 100;
        		item_03_eur_price = (double)Math.round(item_03_usd_price * rate01 * 100) / 100;
        		item_04_eur_price = (double)Math.round(item_04_usd_price * rate01 * 100) / 100;
        		item_05_eur_price = (double)Math.round(item_05_usd_price * rate01 * 100) / 100;
				System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Local Price: " + item_01_eur_price);
				System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Local Price: " + item_02_eur_price);
				System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Local Price: " + item_03_eur_price);
				System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Local Price: " + item_04_eur_price);
				System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Local Price: " + item_05_eur_price + "\r");
			break;
			}

		}
		}
		}
		}
		}
	}
	}
}