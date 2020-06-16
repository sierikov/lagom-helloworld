package tk.sierikov.helloworld;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class HelloWorldServiceModule extends AbstractModule implements ServiceGuiceSupport {

    @Override
    protected void configure(){
        bindService(HelloWorldService.class, HelloWorldServiceImpl.class);
    }
}
