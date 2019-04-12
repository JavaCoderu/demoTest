package ru.ignatev.demoTest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ignatev.demoTest.domain.Person;

@RestController
public class PersonController {

    @GetMapping("/person")
    public Person get(){
        Person person = new Person();

        return person
                .setFirstName("Иван")
                .setLastName("Иванов")
                .setEmail("trtr@erds.ru");
    }
}
