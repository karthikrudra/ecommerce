package com.feuji.ecommerce.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DynamicPort {
	@Value("${environment}")
	private String environment;
	

		
		public  String getUrl(String url) {
			
			System.err.println(environment);
			if(environment.equals("Pro")) {
				return url.replace("localhost", "34.122.139.85");
			}
			else {
				return url;
			}
			
		}

}
