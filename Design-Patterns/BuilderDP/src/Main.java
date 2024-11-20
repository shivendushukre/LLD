import com.builderexample.URL;
import com.builderexample.URLBuilder;

/**
 * Creational Design Patterns
 * helps in creating complex objects
 * helps with immutable classes
 * less need of exposing setters
 * Example: com.builderexample.URL builder
 * https:// | myWebsite | :8080 | /companies | ?companyName=xyz
 * Protocol | Hostname | Port   | Path Param | QueryParam
 * Essential | Essential | Optional | Optional | Optional
 * */

/**
 * Pros:
 * 1. Good way to handle complexity.
 * 2. Easy to implement.
 * 3. Can be refactored into.
 * Cons:
 * 1. Class instance returned is immutable
 * 2. Uses inner static class
 * 3. Sometimes number of lines of code can be huge
 * 4. Have to think of end to end chain
 * */


public class Main {
    public static void main(String[] args) {

        URL url = new URL();

        url.setProtocol("https://");
        url.setHostname("mywebsite");
        url.setPort(":8080");
        url.setPathParam("/homepage");
        url.setQueryParam("random");

        System.out.print(url.getProtocol());
        System.out.print(url.getHostname());
        System.out.print(url.getPort());
        System.out.print(url.getPathParam());
        System.out.println();

        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostname("mywebsite").port(":8080");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
    }
}