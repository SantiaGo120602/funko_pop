package model.body_attributes.body_anatomy;

import java.util.HashMap;

import model.body_attributes.BodyAttributeEnum;
import model.body_attributes.IBodyAttributeFactory;

public class BodyAnatomyAttributeFactory implements IBodyAttributeFactory{
    private static HashMap<BodyAttributeEnum, BodyAnatomyAttribute> genderMap = new HashMap<>();

    static {
        genderMap.put(BodyAttributeEnum.FUNKO, new FunkoAnatomy());
        genderMap.put(BodyAttributeEnum.LEGO, new LegoAnatomy());
    }

    @Override
    public BodyAnatomyAttribute getBodyAttribute(BodyAttributeEnum bodyAttributeEnum) {
        return genderMap.get(bodyAttributeEnum);
    }
}
