package com.example.demo.data;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);
    private final PersonRepository repository;

    public SampleDataLoader(PersonRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading sample data...");

        Person person = new Person("John",
                "Deere",
                "555-7502",
                "john.deere@example.com",
                new Address("1 main St","San Francisco","California","605704"));
        repository.save(person);

        Address address2 = new Address("456 Oak Awe","Chicago","IL","60601");
        Person person2 = new Person("Jane","Smith","653-4342","jane.smith@example.com",address2);
        repository.save(person2);

        repository.save(new Person("Alice", "Johnson", "222-3333", "alice.johnson@example.com",
                new Address("789 Pine St", "New York", "NY", "10001")));
        repository.save(new Person("Bob", "Williams", "444-5555", "bob.williams@example.com",
                new Address("321 Maple St", "Los Angeles", "CA", "90001")));
        repository.save(new Person("Carol", "Brown", "666-7777", "carol.brown@example.com",
                new Address("654 Elm St", "Seattle", "WA", "98101")));
        repository.save(new Person("David", "Davis", "888-9999", "david.davis@example.com",
                new Address("987 Cedar St", "Austin", "TX", "73301")));
        repository.save(new Person("Eve", "Miller", "111-2222", "eve.miller@example.com",
                new Address("123 Birch St", "Denver", "CO", "80201")));
        repository.save(new Person("Frank", "Wilson", "333-4444", "frank.wilson@example.com",
                new Address("456 Spruce St", "Miami", "FL", "33101")));
        repository.save(new Person("Grace", "Moore", "555-6666", "grace.moore@example.com",
                new Address("789 Fir St", "Boston", "MA", "02101")));
        repository.save(new Person("Hank", "Taylor", "777-8888", "hank.taylor@example.com",
                new Address("321 Palm St", "Portland", "OR", "97201")));
        repository.save(new Person("Ivy", "Anderson", "999-0000", "ivy.anderson@example.com",
                new Address("654 Redwood St", "San Diego", "CA", "92101")));
        repository.save(new Person("Jack", "Thomas", "111-3333", "jack.thomas@example.com",
                new Address("987 Willow St", "Phoenix", "AZ", "85001")));
        repository.save(new Person("Kate", "Jackson", "222-4444", "kate.jackson@example.com",
                new Address("123 Palm St", "Dallas", "TX", "75201")));
        repository.save(new Person("Leo", "White", "333-5555", "leo.white@example.com",
                new Address("456 Elm St", "Columbus", "OH", "43201")));
        repository.save(new Person("Mia", "Harris", "444-6666", "mia.harris@example.com",
                new Address("789 Pine St", "Charlotte", "NC", "28201")));
        repository.save(new Person("Nick", "Martin", "555-7777", "nick.martin@example.com",
                new Address("321 Oak St", "San Antonio", "TX", "78201")));
        repository.save(new Person("Olivia", "Garcia", "666-8888", "olivia.garcia@example.com",
                new Address("654 Cedar St", "Indianapolis", "IN", "46201")));
        repository.save(new Person("Paul", "Martinez", "777-9999", "paul.martinez@example.com",
                new Address("987 Fir St", "Jacksonville", "FL", "32201")));
        repository.save(new Person("Quinn", "Robinson", "888-0000", "quinn.robinson@example.com",
                new Address("123 Spruce St", "Fort Worth", "TX", "76101")));
        repository.save(new Person("Rachel", "Clark", "999-1111", "rachel.clark@example.com",
                new Address("456 Willow St", "Nashville", "TN", "37201")));
    }
}
