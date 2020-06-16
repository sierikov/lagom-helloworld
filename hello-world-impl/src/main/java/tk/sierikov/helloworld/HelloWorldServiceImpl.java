package tk.sierikov.helloworld;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public ServiceCall<NotUsed, String> helloWorld(){
        return notUsed -> completedFuture("Hello World");
    }
}
