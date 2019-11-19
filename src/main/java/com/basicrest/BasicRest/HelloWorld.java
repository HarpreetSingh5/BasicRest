package com.basicrest.BasicRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired   //this allows us to use dependency injection. It looks for all required components and does it as necessary
    @Qualifier("regularwrite") //since theres multiple dependencies that implement the WriteText function this allows us to specify which one we use
    TextWriter text;

//    public HelloWorld(TextWriter text){
//        //text = new FancyWriter();  This would involve instantiating a FancyWriter class within the helloworld one but @Autowired allows us to just inject our dependency and go around this.
//        this.text = text;
//    }
    @RequestMapping("/shiv") // every time we go to the url .../shiv its gonna run the index()
    public String index(){
        return "Hello World you skanky wanky";
    }

    @RequestMapping("/hello") // every time we go to the url .../shiv its gonna run the index()
    public String hello(){
        return text.writeText("henlo");
    }
}
