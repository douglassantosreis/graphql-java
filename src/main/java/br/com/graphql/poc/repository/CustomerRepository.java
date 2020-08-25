package br.com.graphql.poc.repository;

import br.com.graphql.poc.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
