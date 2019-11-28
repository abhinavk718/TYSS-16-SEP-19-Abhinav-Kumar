package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

@Import(PetConfigurationClass.class)
@Configuration
public class HelloConfigurationClass
{
	//@Scope("prototype")
	@Bean(name="hello")
	public Hello getHello()
	{
		Hello hello=new Hello();
		hello.setMsg("I Love Python");
		return hello;
	}
}//end of HelloConfigurationClass
