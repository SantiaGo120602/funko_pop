package model.history;

import model.body_attributes.BodyAttributeEnum;

public class HistoryEntry implements IHistoryPrototype{
    private BodyAttributeEnum bodyAnatomyAttribute;
    private BodyAttributeEnum bodyGenderAttribute;
    private BodyAttributeEnum bodySkinAttribute;
    private int headCode;
    private int pantsCode;
    private int shoesCode;
    private int torsoCode;

    public HistoryEntry(BodyAttributeEnum bodyAnatomyAttribute, BodyAttributeEnum bodyGenderAttribute,
        BodyAttributeEnum bodySkinAttribute, int headCode, int pantsCode, int shoesCode, int torsoCode) {
        this.bodyAnatomyAttribute = bodyAnatomyAttribute;
        this.bodyGenderAttribute = bodyGenderAttribute;
        this.bodySkinAttribute = bodySkinAttribute;
        this.headCode = headCode;
        this.pantsCode = pantsCode;
        this.shoesCode = shoesCode;
        this.torsoCode = torsoCode;
    }

    public BodyAttributeEnum getBodyAnatomyAttribute() {
        return bodyAnatomyAttribute;
    }

    public BodyAttributeEnum getBodyGenderAttribute() {
        return bodyGenderAttribute;
    }

    public BodyAttributeEnum getBodySkinAttribute() {
        return bodySkinAttribute;
    }

    public int getHeadCode() {
        return headCode;
    }

    public int getPantsCode() {
        return pantsCode;
    }

    public int getShoesCode() {
        return shoesCode;
    }

    public int getTorsoCode() {
        return torsoCode;
    }

    @Override
    public IHistoryPrototype clone() {
        return new HistoryEntry(this.bodyAnatomyAttribute, this.bodyGenderAttribute, this.bodySkinAttribute,this.headCode, this.pantsCode, this.shoesCode, this.torsoCode);
    }
    
}
