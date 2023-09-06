package model.body_attributes.body_skin;

public class YellowSkin extends BodySkinAttribute{
    private String skinColor = "yellow";

    @Override
    public String getAttribute() {
        return this.skinColor;
    }
}
