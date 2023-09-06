package model;

import model.body_attributes.BodyAttributeEnum;
import model.body_attributes.body_anatomy.BodyAnatomyAttributeFactory;
import model.body_attributes.body_gender.BodyGenderAttributeFactory;
import model.body_attributes.body_skin.BodySkinAttributeFactory;
import model.body_parts.BodyPart;
import model.body_parts.BodyPartFactory;
import model.body_parts.BodyType;
import model.history.HistorySingleton;
import model.history.HistoryEntry;

public class FunkoPopModel {

    private HistorySingleton historySingleton = HistorySingleton.getInstance();
    private BodyAnatomyAttributeFactory bodyAnatomyAttributeFactory = new BodyAnatomyAttributeFactory();
    private BodyGenderAttributeFactory bodyGenderAttributeFactory = new BodyGenderAttributeFactory();
    private BodySkinAttributeFactory bodySkinAttributeFactory = new BodySkinAttributeFactory();
    private BodyAttributeEnum bodyAnatomyAttribute;
    private BodyAttributeEnum bodyGenderAttribute;
    private BodyAttributeEnum bodySkinAttribute;
    private BodyPart head;
    private BodyPart pants;
    private BodyPart shoes;
    private BodyPart torso;

    public BodyAttributeEnum getBodyAnatomyAttribute() {
        return bodyAnatomyAttribute;
    }

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

    public HistorySingleton getHistorySingleton() {
        return historySingleton;
    }

    public FunkoPopModel() {
        
    }

    public void updateBody( BodyAttributeEnum bodyAttributeAnatomy,
    BodyAttributeEnum bodyAttributeGender,
    BodyAttributeEnum bodyAttributeSkin,
    int headNumber,
    int pantsNumber,
    int shoesNumber,
    int torsoNumber
    )
    {
        historySingleton.addEntry(new HistoryEntry(this.bodyAnatomyAttribute, bodyGenderAttribute, bodySkinAttribute, head.getId(), pants.getId(), shoes.getId(), torso.getId()));
        this.head = BodyPartFactory.getBodyPart(BodyType.HEAD,
            bodyAnatomyAttributeFactory.getBodyAttribute(bodyAttributeAnatomy),
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            headNumber
        );

        this.pants = BodyPartFactory.getBodyPart(BodyType.PANTS,
            bodyAnatomyAttributeFactory.getBodyAttribute(bodyAttributeAnatomy),
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            pantsNumber
        );

        this.shoes = BodyPartFactory.getBodyPart(BodyType.SHOES,
            bodyAnatomyAttributeFactory.getBodyAttribute(bodyAttributeAnatomy),
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            shoesNumber
        );

        this.torso = BodyPartFactory.getBodyPart(BodyType.TORSO,
            bodyAnatomyAttributeFactory.getBodyAttribute(bodyAttributeAnatomy),
            bodyGenderAttributeFactory.getBodyAttribute(bodyAttributeGender),
            bodySkinAttributeFactory.getBodyAttribute(bodyAttributeSkin),
            torsoNumber
        );

        this.bodyAnatomyAttribute = bodyAttributeAnatomy;
        this.bodyGenderAttribute = bodyAttributeGender;
        this.bodySkinAttribute = bodyAttributeSkin;
    }

}
