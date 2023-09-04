package model.body_gender;

import java.util.HashMap;

import model.BodyAttributeEnum;
import model.IBodyAttributeFactory;

public class BodyGenderAttributeFactory implements IBodyAttributeFactory{
    private static HashMap<BodyAttributeEnum, BodyGenderAttribute> genderMap = new HashMap<>();

    static {
        genderMap.put(BodyAttributeEnum.MALE, new Male());
        genderMap.put(BodyAttributeEnum.FEMALE, new Female());
    }

    @Override
    public BodyGenderAttribute getBodyAttribute(BodyAttributeEnum bodyAttributeEnum) {
        return genderMap.get(bodyAttributeEnum);
    }
}
