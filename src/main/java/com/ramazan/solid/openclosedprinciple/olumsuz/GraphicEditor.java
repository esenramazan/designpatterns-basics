package com.ramazan.solid.openclosedprinciple.olumsuz;

public class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type==1)
            drawRectangle(s);
        else if (s.m_type==2)
            drawCircle(s);
    }
    public void drawRectangle(Shape r) {
        System.out.println("Drawing a rectangle");
    }
    public void drawCircle(Shape r) {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        editor.drawShape(rectangle);
        editor.drawShape(circle);
    }
}

/*
 *GraphicEditor sınıfı, OCP’yi ihlal eder çünkü her yeni şekil türü eklendiğinde,
 * drawShape metodu değiştirilmelidir.
 */
