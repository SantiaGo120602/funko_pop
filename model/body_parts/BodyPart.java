package model.body_parts;

import model.body_attributes.body_anatomy.BodyAnatomyAttribute;
import model.body_attributes.body_gender.BodyGenderAttribute;
import model.body_attributes.body_skin.BodySkinAttribute;
import model.utils.ImageUtils;

public abstract class BodyPart {
    public static String validImageFolder = ImageUtils.getImageFolder("resources/images");
    private BodyAnatomyAttribute bodyAnatomyAttribute;
    private BodyGenderAttribute bodyGenderAttribute;
    private BodySkinAttribute bodySkinAttribute; 
    private int id;
    private String imagePath;

    public BodyAnatomyAttribute getBodyAnatomyAttribute() {
        return bodyAnatomyAttribute;
    }

    public void setBodyAnatomyAttribute(BodyAnatomyAttribute bodyAnatomyAttribute) {
        this.bodyAnatomyAttribute = bodyAnatomyAttribute;
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

    public void setup(BodyAnatomyAttribute bodyAnatomyAttribute,BodyGenderAttribute bodyGenderAttribute, BodySkinAttribute bodySkinAttribute, int id){
        this.bodyAnatomyAttribute = bodyAnatomyAttribute;
        this.bodyGenderAttribute = bodyGenderAttribute;
        this.bodySkinAttribute = bodySkinAttribute;
        this.id = id;
        this.imagePath = validImageFolder + "/" + bodyAnatomyAttribute.getAttribute() + "/" + bodyGenderAttribute.getAttribute() + "_" + bodySkinAttribute.getAttribute()
        + "_" + getPart() + "_" + String.format("%02d", id) + ".png";
    }

    public abstract String getPart();
}
