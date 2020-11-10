package kr.co.fastcampus.eatgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @Transient
    private List<MenuItem> menuItmes = new ArrayList<>();

    public Restaurant() {

    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public Long getId(){
        return id;
    }

    public void setId(long id) { this.id =id;    }

    public String getName()
    {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + " in "+ address;
    }

    public List<MenuItem> getMenuItmes(){
        return menuItmes;
    }

    public void addMenuItem(MenuItem menuItme) {
        menuItmes.add(menuItme);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }


}
