package br.com.graphql.poc.queries;

import br.com.graphql.poc.entity.Customer;
import br.com.graphql.poc.repository.CustomerRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMutation implements GraphQLMutationResolver {

    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
