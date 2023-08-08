import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class ScalingExample {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(50, 50, 100, 100);

        double scaleX = 2.0;
        double scaleY = 2.0;

        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();

        AffineTransform transform = new AffineTransform();

        transform.translate(centerX, centerY);
        transform.scale(scaleX, scaleY);
        transform.translate(-centerX, -centerY);

        rect = (Rectangle2D.Double) transform.createTransformedShape(rect);

        System.out.println("Scaled rectangle: " + rect);
    }
}
