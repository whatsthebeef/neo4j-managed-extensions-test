package com.zode64.server.api.lifecycle;

import org.springframework.data.neo4j.server.SpringPluginInitializer;
import com.zode64.server.api.DefaultName;

public class HelloWorldInitializer extends SpringPluginInitializer{
    public HelloWorldInitializer() {
        super(new String[]{"spring/server-context.xml"},
	      expose( "defaultName", DefaultName.class ));
	      
    }
}
