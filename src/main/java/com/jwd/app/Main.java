package com.jwd.app;

import com.jwd.model.Point;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Random;

public class Main{

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	private static final int DEFAULT_ARRAY_SIZE = 5;

	public static void main(String [] args){
	try{
		LOG.trace("Program start");
		int arraySize;
		if(args.length > 0){
			arraySize = Integer.parseInt(args[0]);
		}
		else{
			arraySize = DEFAULT_ARRAY_SIZE;
			LOG.warn("Size Not set. automatically arraySize = " + DEFAULT_ARRAY_SIZE);
		}
		Point[] arr = new Point[arraySize];
		Random random = new Random();

		for(Point point : arr){
			point = new Point(random.nextDouble() * 10 - 5, random.nextDouble() * 10 - 5);
			LOG.info(point.toString());
		} 

	}catch(Exception ex){
		LOG.error("Exception", ex);
		LOG.trace("Program end with fatal error");
		return;
	}
	LOG.trace("Program end successfully");
	}
}