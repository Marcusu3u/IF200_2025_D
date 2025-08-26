/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author MSI
 */
public class Person {
    
    private String name, lastName, id, phone;
    private int age;

    public Person(String name, String lastName, String id, String phone, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }
    
    public Person(){
        
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString (){
        return "Person\n"
                +"\nname="+getName()
                +"\nlast name="+getLastName()
                +"\nid="+getId()
                +"\nphone="+getPhone()
                +"\nage="+getAge();
    }
    
}
