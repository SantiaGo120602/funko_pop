package model.body_skin;

public class BrownSkin extends BodySkinAttribute{
    private String skinColor = "brown";
    
    @Override
    public String getAttribute() {
        return this.skinColor;
    }
}
