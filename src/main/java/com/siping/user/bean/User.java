package com.siping.user.bean;

import java.util.List;

import com.siping.Identify.bean.Identify;

public class User {
private int id;
private String name;
private int age;
private Identify identify;

List<Identify> identifys;

public Identify getIdentify() {
    return identify;
}
public void setIdentify(Identify identify) {
    this.identify = identify;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public List<Identify> getIdentifys() {
    return identifys;
}
public void setIdentifys(List<Identify> identifys) {
    this.identifys = identifys;
}
@Override
public String toString() {
    return "User [id=" + id + ", name=" + name + ", age=" + age + ", identifys=" + identifys + "]";
}

}
