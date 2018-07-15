public class IsRightTriangle {

    private boolean isRightTriangle;

    public boolean isRightTriangle() {
        return isRightTriangle;
    }

    public void setRightTriangle(boolean rightTriangle) {
        isRightTriangle = rightTriangle;
    }

    public boolean isRightTriangle(Triangle triangle) {

        if ((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) == triangle.getC() * triangle.getC()) {
            return true;
        }

        if (((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) != triangle.getC() * triangle.getC()))
            return false;


        return isRightTriangle;
    }
}
