package com.ramazan.designpatterns.behavioral.interpreter.otherexample;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression isMale = new OrExpression(new OrExpression(new TerminalExpression("John"), new TerminalExpression("Robert")),new OrExpression(new TerminalExpression("Mike"), new TerminalExpression("Lion")));
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julia is male? " + isMale.interpret("Julia"));
    }
}


/*
* Interpreter Pattern’deki ağaç yapısı, genellikle ifadelerin ve operatörlerin hiyerarşik bir şekilde düzenlendiği bir yapıdır.
* Bu yapı, genellikle ifadeleri ve operatörleri düzenlemek için kullanılır.

Örneğin, verdiğim basit örnekte, OrExpression sınıfı bir ağaç düğümünü temsil eder ve TerminalExpression sınıfları bu düğümün çocuklarıdır.
*  OrExpression sınıfı, iki ifadenin (expr1 ve expr2) herhangi birinin doğru olup olmadığını kontrol eder.
* Bu ifadeler, TerminalExpression sınıfının örnekleridir ve birer yaprak düğümü olarak düşünülebilir.
* Bu şekilde, OrExpression ve TerminalExpression sınıflarının birleşimi, ifadeleri ve operatörleri düzenleyen bir ağaç yapısını oluşturur.

Bu ağaç yapısı, belirli bir ifadenin yorumlanmasını sağlar. Örneğin, “John” veya “Robert” ifadesinin doğru olup olmadığını kontrol etmek için OrExpression sınıfının interpret metodu kullanılır. Bu metod, expr1 ve expr2 ifadelerinin herhangi birinin doğru olup olmadığını kontrol eder. Eğer herhangi biri doğruysa, bu metod true döndürür. Bu, Interpreter Pattern’deki ağaç yapısının temel bir örneğidir. Bu örneği kendi kodunuza uyarlayabilir ve genişletebilirsiniz.
* */