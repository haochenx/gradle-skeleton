package com.example;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @Inject
    private GreetingStore greetingStore;

    @GET
    public List<String> getGreeting() {
        return Collections.singletonList(greetingStore.getGeneralGreeting());
    }

}
