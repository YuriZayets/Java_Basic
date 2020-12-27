package Classes.Simplest_classes.TaskSeven;

import static java.lang.Math.*;

public class Triangle {
    double a;
    double b;
    double c;
    float angleAB;
    float angleBC;
    float angleAC;
    double S;
    double P;
    double[] meridianCrossing;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        initByThreeSides();
    }

    public Triangle(double a, double b, float angleAB) {
        this.a = a;
        this.b = b;
        this.angleAB = angleAB;
        initByTwoSides();
    }

    public Triangle(double c, float angleAC, float angleBC) {
        this.c = c;
        this.angleAC = angleAC;
        this.angleBC = angleBC;
        initByOneSide();
    }

    private void initByThreeSides() {
        angleBC = (float) toDegrees(acos((b * b + c * c - a * a) / (2 * b * c)));
        angleAC = (float) toDegrees(acos((a * a + c * c - b * b) / (2 * a * c)));
        angleAB = 180 - angleAC - angleBC;
        initPerimeter();
        initArea();
        initMeridianCrossing();
    }

    private void initByTwoSides() {
        c = sqrt(a * a + b * b - 2 * a * b * cos(toRadians(angleAB)));
        angleBC = (float) toDegrees(acos((b * b + c * c - a * a) / (2 * b * c)));
        angleAC = 180 - angleAB - angleBC;
        initPerimeter();
        initArea();
        initMeridianCrossing();
    }


    private void initByOneSide() {
        angleAB = 180 - angleAC - angleBC;
        a = c * ((sin(toRadians(angleBC)) / (sin(toRadians(angleAB)))));
        b = c * ((sin(toRadians(angleAC)) / (sin(toRadians(angleAB)))));
        initPerimeter();
        initArea();
        initMeridianCrossing();
    }

    private void initPerimeter() {
        P = a + b + c;
    }

    private void initArea() {
        S = sqrt(P/2.0 * (P/2.0 - a) * (P/2.0 - b) * (P/2.0 - c));
    }

    private void initMeridianCrossing() {
        meridianCrossing = new double[2];
        meridianCrossing[0] = (sqrt((2 * b * b + 2 * c * c - a * a) / 4)) * 1 / 3; //расстояние от вершины a до пересечения медиан
        meridianCrossing[1] = (sqrt((2 * a * a + 2 * c * c - b * b) / 4)) * 1 / 3; //расстояние от вершины b до пересечения медиан
    }

    @Override
    public String toString() {
        return "Построен треугольник со сторонами a = " + a + ", b = " + b + ", c = " + c + "\n" +
                "Углы треугольника между сторонами a и b = " + angleAB + ", b и с = " + angleBC + ", a и c = " + angleAC + "\n" +
                "Периметр треугольника " + P + "\n" +
                "Площадь треугольника " + S + "\n" +
                "Пересечение медиан находится на расстоянии " + meridianCrossing[0] + " от центра стороны a " + "\n" +
                "И на расстоянии " + meridianCrossing[1] + " от центра стороны b.";
    }
}
