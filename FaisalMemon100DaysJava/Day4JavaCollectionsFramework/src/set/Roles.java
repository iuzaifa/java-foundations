package set;

import java.util.Objects;

public class Roles {

    String name;


    public Roles(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(name, roles.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                '}';
    }
}
