package com.example.jpabasicsjuly;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Student {
    @Id
    int rollNo;
    String name;
    int age;
}
