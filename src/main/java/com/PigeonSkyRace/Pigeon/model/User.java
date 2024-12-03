package com.PigeonSkyRace.Pigeon.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users") // Avoid reserved keyword
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Null
    private String latitude;

    @Null
    private String longitude;

    private String password;
    private String email;

    private String role;
}
