package kr.co.fastcampus.eatgo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {

    //private final String name;
    @Id
    @GeneratedValue
    private Long id;
    @Setter
    private Long restaurantId;

    public MenuItem(String name) {
        this.name = name;
    }
    private String name;

    public String getName(){
        return name;
    }
    @Transient
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean destroy;
}