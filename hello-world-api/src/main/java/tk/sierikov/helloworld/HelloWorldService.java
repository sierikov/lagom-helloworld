package tk.sierikov.helloworld;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.*;

public interface HelloWorldService extends Service {
    ServiceCall<NotUsed, String> helloWorld();

    @Override
    default Descriptor descriptor(){
        return named("hello-world-service").withCalls(
                namedCall("hello-world", this::helloWorld)
        ).withAutoAcl(true);
    }
}