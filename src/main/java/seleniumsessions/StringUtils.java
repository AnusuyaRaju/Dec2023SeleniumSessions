package seleniumsessions;

public class StringUtils {
	
	private StringUtils() {}

	public static String getRandomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencat.com";
		//return "automation"+UUID.randomUUID()+"opencat.com";
		
		//Explain cleaup strategy..? if we have 1000 emails then u hit below query to DB it will delt all unnecessary emails wherever automation coming it will delt
		//automation1712310544580@opencat.com
		//automation1712310591696@opencat.com
		//automation17123105965496@opencat.com
		//automation1712310596544658@opencat.com
		
		//Delete from user where email like "%automation%";
		
	}

}
