package model.body_skin;

import java.util.HashMap;

import model.BodyAttributeEnum;
import model.IBodyAttributeFactory;

public class BodySkinAttributeFactory implements IBodyAttributeFactory{
    private static HashMap<BodyAttributeEnum, BodySkinAttribute> skinMap = new HashMap<>();

    static {
        skinMap.put(BodyAttributeEnum.BROWN, new BrownSkin());
        skinMap.put(BodyAttributeEnum.BLACK, new BlackSkin());
        skinMap.put(BodyAttributeEnum.YELLOW, new YellowSkin());
        skinMap.put(BodyAttributeEnum.WHITE, new WhiteSkin());
    }

    @Override
    public BodySkinAttribute getBodyAttribute(BodyAttributeEnum bodyAttributeEnum) {
        return skinMap.get(bodyAttributeEnum);
    }
}
