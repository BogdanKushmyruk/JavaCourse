package com.bkushmyruk.polymorphysm;


import java.util.Objects;

public class C {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return number == c.number &&
                Objects.equals(name, c.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
