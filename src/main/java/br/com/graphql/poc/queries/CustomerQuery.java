package br.com.graphql.poc.queries;

import br.com.graphql.poc.entity.Customer;
import br.com.graphql.poc.repository.CustomerRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerQuery implements GraphQLQueryResolver {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(String id) {

        return customerRepository.findById(id).get();
    }

}
