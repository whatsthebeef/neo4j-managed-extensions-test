package com.zode64.server.api;

import org.springframework.stereotype.Component;

@Component
public class DefaultName {

    public String getName(){
	return "World";
    }
}