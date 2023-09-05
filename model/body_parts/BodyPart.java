package model.body_parts;

import model.ImageUtils;
import model.body_gender.BodyGenderAttribute;
import model.body_skin.BodySkinAttribute;

public abstract class BodyPart {
    public static String validImageFolder = ImageUtils.getImageFolder("resources/images");
    private BodyGenderAttribute bodyGenderAttribute;
    private BodySkinAttribute bodySkinAttribute; 
    private int id;
    private String imagePath;
    public void setId(int id) {
        this.id = id;
    }



    public BodyGenderAttribute getBodyGenderAttribute() {
        return bodyGenderAttribute;
    }

    public BodySkinAttribute getBodySkinAttribute() {
        return bodySkinAttribute;
    }

    public int getId() {
        return id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setup(BodyGenderAttribute bodyGenderAttribute, BodySkinAttribute bodySkinAttribute, int id){
        this.bodyGenderAttribute = bodyGenderAttribute;
        this.bodySkinAttribute = bodySkinAttribute;
        this.id = id;
        this.imagePath = validImageFolder + "/funko/" + bodyGenderAttribute.getAttribute() + "_" + bodySkinAttribute.getAttribute()
        + "_" + getPart() + "_" + String.format("%02d", id) + ".png";
    }

    public abstract String getPart();
}
