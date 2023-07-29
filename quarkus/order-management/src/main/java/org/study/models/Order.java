package org.study.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table( name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends PanacheEntity {

    private UUID id;
    private String nameClient;

    private List<Item> items;
}
