package com.example.demo.tacos.web.api;

//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.Id;
//import lombok.NoArgsConstructor;
//import lombok.AccessLevel;

//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
//@Entity
//public class Ingredient {
//	@Id
//	private final String id;
//	private final String name;
//	@Enumerated(EnumType.STRING)
//	private final Type type;
//
//	public static enum Type {
//		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
//	}
//}
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force=true)
@Entity
@Getter
@Setter
public class Ingredient {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}