package com.example;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "demo")
@EnableConfigurationProperties
@Configuration

public class DemoConfigProps {
	private String greetMsg;
	
    private Map<String, String> props=new HashMap<>();

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> props) {
		this.props = props;
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}
	
	

}
