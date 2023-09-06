package model;

import model.body_attributes.BodyAttributeEnum;
import model.body_attributes.body_gender.BodyGenderAttributeFactory;
import model.body_attributes.body_skin.BodySkinAttributeFactory;
import model.body_parts.BodyPart;
import model.body_parts.BodyPartFactory;
import model.body_parts.BodyType;

public class FunkoPopModel {

    private BodyGenderAttributeFactory bodyGenderAttributeFactory = new BodyGenderAttributeFactory();
    private BodySkinAttributeFactory bodySkinAttributeFactory = new BodySkinAttributeFactory();
    private BodyAttributeEnum bodyGenderAttribute;
    private BodyAttributeEnum bodySkinAttribute;
    private BodyPart head;
    private BodyPart pants;
    private BodyPart shoes;
    private BodyPart torso;

    public BodyAttributeEnum getBodyGenderAttribute() {
        return bodyGenderAttribute;
    }

    public BodyAttributeEnum getBodySkinAttribute() {
        return bodySkinAttribute;
    }

    public BodyPart getPants() {
        return pants;
    }

    public BodyPart getShoes() {
        return shoes;
    }

    public BodyPart getTorso() {
        return torso;
    }

    public BodyPart getHead() {
        return head;
    }

    public FunkoPopModel() {
        
    }

    public void updateBody(BodyAttributeEnum bodyAttributeGender,
    BodyAttributeEnum bodyAttributeSkin,
    int headNumber,
    int pantsNumber,
    int shoesNumber,
    int torsoNumber
    )
    {
        this.head = BodyPartFactory.getBodyPart(BodyType.HEAD,
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            headNumber
        );

        this.pants = BodyPartFactory.getBodyPart(BodyType.PANTS,
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            pantsNumber
        );

        this.shoes = BodyPartFactory.getBodyPart(BodyType.SHOES,
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            shoesNumber
        );

        this.torso = BodyPartFactory.getBodyPart(BodyType.TORSO,
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            torsoNumber
        );

        this.bodyGenderAttribute = bodyAttributeGender;
        this.bodySkinAttribute = bodyAttributeSkin;
    }

}
