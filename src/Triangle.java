class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleSideException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!checkSides()) {
            throw new IllegalTriangleSideException("Invalid triangle sides.");
        }
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("The sum of any two sides must be greater than the third.");
        }
        return true;
    }


    public String toString() {
        return "Triangle with sides " + side1 + ", " + side2 + ", " + side3;
    }
}
