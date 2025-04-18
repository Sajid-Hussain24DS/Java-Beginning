package Comparable_Interface;

public class Car implements Comparable<Car> {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Car o){
        if (this.getId()>o.getId()){
            return 1;
        }else if (this.getId()<o.getId()){
            return -1;
        }else
            return 0;
    }
}