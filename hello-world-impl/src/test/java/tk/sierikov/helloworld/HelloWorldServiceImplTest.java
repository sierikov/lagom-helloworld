package tk.sierikov.helloworld;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceImplTest {

    @Test
    public void helloWorld_shouldReturnTheExpectedResult() throws Exception {
        HelloWorldService helloWorldService = new HelloWorldServiceImpl();

        // Never do this in business logic. Only in tests.
        String result = helloWorldService
                .helloWorld()
                .invoke()
                .toCompletableFuture()
                .get(5, TimeUnit.SECONDS);

        assertEquals("Hello World", result);
    }
}
