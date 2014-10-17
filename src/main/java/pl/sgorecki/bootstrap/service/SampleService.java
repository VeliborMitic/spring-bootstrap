package pl.sgorecki.bootstrap.service;

import org.springframework.stereotype.Component;

/**
 * @author Sebastian Górecki <sebast26@man.poznan.pl>
 */
@Component
public class SampleService {

    public String getHelloMessage() {
        return "Hello World from service!";
    }
}
