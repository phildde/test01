package myProject;

import org.apache.wink.client.ClientResponse;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestClient client = new RestClient();
		Resource resource = client.resource("https://api.twitter.com/1.1/search/tweets.json");
		ClientResponse response = resource.queryParam("q", new Object[] {"maven"}).get();
		
		System.out.println(response.getEntity(String.class));
		
		
		
		
	}

}
