package kr.co.fastcampus.eatgo.domain;

import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String address;
    private List<MenuItem> menuItmes = new ArrayList<>();

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Long getId(){
        return id;
    }

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
