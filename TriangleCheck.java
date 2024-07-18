public class TriangleCheck {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 60;
        int angle3 = 60;

        
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
         {
            System.out.println("The angles form a triangle.");
        } 
        else 
        {
            System.out.println("The angles do not form a triangle.");
        }
    }
}
