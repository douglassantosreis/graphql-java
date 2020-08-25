package br.com.graphql.poc.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
public class Customer {
    @Id
    private String id;
    private String name;
    private String age;
}
