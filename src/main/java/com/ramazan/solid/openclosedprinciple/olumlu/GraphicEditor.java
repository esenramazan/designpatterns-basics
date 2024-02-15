package com.ramazan.solid.openclosedprinciple.olumlu;

public class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
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
 *Bu örnekler, bir sınıfın yeni işlevler eklemek için açık ancak mevcut kodu değiştirmek için kapalı olması gerektiğini göstermektedir.
 */
