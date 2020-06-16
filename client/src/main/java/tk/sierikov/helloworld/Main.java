package tk.sierikov.helloworld;

import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        try (LagomClientFactory clientFactory = LagomClientFactory.create("client", LagomClientFactory.class.getClassLoader())) {
            HelloWorldService helloWorldService = clientFactory.createClient(HelloWorldService.class, new URI("http://localhost:9000"));

            // Need to wait for Future in the example. Use thenApply() method in production where you can.
            String result = helloWorldService.helloWorld().invoke().toCompletableFuture().get();

            System.out.println(result);

        } catch (URISyntaxException e) {
            System.out.println(" Exception in URI: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(" Interrupted: " + e.getMessage());
        } catch (ExecutionException e) {
            System.out.println(" Runtime Error: " + e.getMessage());
        }
    }
}