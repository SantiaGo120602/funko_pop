package model.body_parts;

import java.util.HashMap;
import model.body_gender.BodyGenderAttribute;
import model.body_skin.BodySkinAttribute;

public class BodyPartFactory {
    private static HashMap<BodyType, BodyPart> bodyMap = new HashMap<>();

    static {
        bodyMap.put(BodyType.HEAD, new Head());
        bodyMap.put(BodyType.TORSO, new Torso());
        bodyMap.put(BodyType.PANTS, new Pants());
        bodyMap.put(BodyType.SHOES, new Shoes());
    }

    public static BodyPart getBodyPart(BodyType bodyType, BodyGenderAttribute bodyGenderAttribute, BodySkinAttribute bodySkinAttribute, int id){
        BodyPart bodyPart = bodyMap.get(bodyType);
        bodyPart.setup(bodyGenderAttribute, bodySkinAttribute, id);
        return bodyPart;
    }
}
