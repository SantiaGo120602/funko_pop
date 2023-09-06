package model.body_attributes.body_skin;

public class BlackSkin extends BodySkinAttribute{
    private String skinColor = "black";
    
    @Override
    public String getAttribute() {
        return this.skinColor;
    }
}
