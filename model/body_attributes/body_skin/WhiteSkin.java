package model.body_attributes.body_skin;

public class WhiteSkin extends BodySkinAttribute{
    private String skinColor = "white";

    @Override
    public String getAttribute() {
        return this.skinColor;
    }
}
