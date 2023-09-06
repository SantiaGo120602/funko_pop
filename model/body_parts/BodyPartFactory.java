package model.body_parts;

import java.util.HashMap;

import model.body_attributes.body_anatomy.BodyAnatomyAttribute;
import model.body_attributes.body_gender.BodyGenderAttribute;
import model.body_attributes.body_skin.BodySkinAttribute;

public class BodyPartFactory {
    private static HashMap<BodyType, BodyPart> bodyMap = new HashMap<>();

    static {
        bodyMap.put(BodyType.HEAD, new Head());
        bodyMap.put(BodyType.TORSO, new Torso());
        bodyMap.put(BodyType.PANTS, new Pants());
        bodyMap.put(BodyType.SHOES, new Shoes());
    }

    public static BodyPart getBodyPart(BodyType bodyType, BodyAnatomyAttribute bodyAnatomyAttribute, BodyGenderAttribute bodyGenderAttribute, BodySkinAttribute bodySkinAttribute, int id){
        BodyPart bodyPart = bodyMap.get(bodyType);
        bodyPart.setup(bodyAnatomyAttribute, bodyGenderAttribute, bodySkinAttribute, id);
        return bodyPart;
    }
}
