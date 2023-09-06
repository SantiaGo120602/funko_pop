import javax.swing.SwingUtilities;

import controller.FunkoPopController;
import model.FunkoPopModel;
import model.body_attributes.BodyAttributeEnum;
import view.FunkoPopFrame;
import view.FunkoPopView;

public class Main {
    public static void main(String[] args) {
        FunkoPopModel model = new FunkoPopModel();
        FunkoPopView view = new FunkoPopView();
        FunkoPopController controller = new FunkoPopController(model, view);
        controller.updateModel(BodyAttributeEnum.MALE, BodyAttributeEnum.WHITE, 1, 1, 1, 1);
        SwingUtilities.invokeLater(() -> {
            FunkoPopFrame frame = controller.getView().getFunkoPopFrame();
            frame.setVisible(true);
        });
    }
    
}
        