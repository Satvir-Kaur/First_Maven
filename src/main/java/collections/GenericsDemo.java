package collections;

public class GenericsDemo <T,P,S>{

    T name;
    P email;
    S id;

    public GenericsDemo(T name, P email, S id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenericsDemo{" +
                "name=" + name +
                ", email=" + email +
                ", id=" + id +
                '}';
    }
}

