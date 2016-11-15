public class Main {
        public static void main(String[] args) {
            double[][] a={ {5,2,3,4},
                        {5,6,7,8},
                        {6,10,11,12},
                        {14,14,15,17}};
            Matrix m=new Matrix(a);
            System.out.println(m.toStr());
            System.out.println(m.det());
        }
    }
