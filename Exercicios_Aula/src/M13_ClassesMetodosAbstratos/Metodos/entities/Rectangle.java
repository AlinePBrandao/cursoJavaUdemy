package M13_ClassesMetodosAbstratos.Metodos.entities;

import M13_ClassesMetodosAbstratos.Metodos.entities.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    // TODO: sobrescrita do método
    @Override
    public double area() {
        return 0;
    }
}
