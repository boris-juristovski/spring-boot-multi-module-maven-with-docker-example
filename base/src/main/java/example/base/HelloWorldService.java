package example.base;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    
    public String helloWorld() {
        return "Hello world!";
    }
}
