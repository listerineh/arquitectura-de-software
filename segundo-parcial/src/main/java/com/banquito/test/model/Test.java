package com.banquito.test.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "tests")
public class Test {
    @Id
    private String id;

    private String name;
    private List<TestArray> scores;

    @Version
    private Long version;
}
