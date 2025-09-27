package M13_ClassesMetodosAbstratos.Metodos.entities;

import M13_ClassesMetodosAbstratos.Metodos.entities.enums.Color;

public abstract class Shape {
// NOTE: a classe precisa ser abstrata caso tenha um metodo abstrato, ela não pode ser instanciada
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // NOTE: Metodo Abstrato
    public abstract double area();
}
