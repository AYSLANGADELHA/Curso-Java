package entities;

public class Retangulo {


    public double Width;
    public double Height;
    public double Area;
    public double Perimeter;
    public double Diagonal;



    public double Area(){
        Area = Width * Height;
        return Area;

    }

    public double Perimeter(){
        Perimeter = 2 * (Width + Height);
        return Perimeter;
    }

    public double Diagonal(){
        Diagonal = Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
        return Diagonal;
    }

    /*
    public String toString(){
        return Area
                + String.format("%.2f", Width)
                + String.format("%.2f", Height)
                + String.format("%.2f", Perimeter())
                + String.format("%.2f", Diagonal());
    }
    */
}
