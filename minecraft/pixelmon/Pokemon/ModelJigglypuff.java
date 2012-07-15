// Date: 5/11/2012 11:23:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelJigglypuff extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer EarR;
    ModelRenderer Body;
    ModelRenderer FatWide;
    ModelRenderer FatTall;
    ModelRenderer FatButt;
    ModelRenderer ArmR;
    ModelRenderer ArmL;
    ModelRenderer FootL;
    ModelRenderer FootR;
    ModelRenderer EarR2;
  
  public ModelJigglypuff()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 1, 24);
      Shape1.addBox(0F, -1.5F, -2F, 0, 2, 2);
      Shape1.setRotationPoint(-0.1F, 18.5F, -1.3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, -0.3490659F, 0F, 0.122173F);
      EarR = new ModelRenderer(this, 25, 4);
      EarR.addBox(-2F, -2F, -0.5F, 2, 2, 1);
      EarR.setRotationPoint(-2F, 18.9F, 0F);
      EarR.setTextureSize(64, 32);
      EarR.mirror = true;
      setRotation(EarR, 0F, 0.6981317F, 0.5759587F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
      Body.setRotationPoint(0F, 20F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      FatWide = new ModelRenderer(this, 0, 11);
      FatWide.addBox(-3F, -2F, -2F, 6, 4, 4);
      FatWide.setRotationPoint(0F, 20F, 0F);
      FatWide.setTextureSize(64, 32);
      FatWide.mirror = true;
      setRotation(FatWide, 0F, 0F, 0F);
      FatTall = new ModelRenderer(this, 21, 9);
      FatTall.addBox(-2F, -3F, -2F, 4, 6, 4);
      FatTall.setRotationPoint(0F, 20F, 0F);
      FatTall.setTextureSize(64, 32);
      FatTall.mirror = true;
      setRotation(FatTall, 0F, 0F, 0F);
      FatButt = new ModelRenderer(this, 32, 0);
      FatButt.addBox(-2F, -2F, -2F, 4, 4, 4);
      FatButt.setRotationPoint(0F, 20F, 1F);
      FatButt.setTextureSize(64, 32);
      FatButt.mirror = true;
      setRotation(FatButt, 0F, 0F, 0F);
      ArmR = new ModelRenderer(this, 0, 20);
      ArmR.addBox(-2F, -0.5F, -0.5F, 2, 1, 1);
      ArmR.setRotationPoint(-2F, 20.5F, -1.5F);
      ArmR.setTextureSize(64, 32);
      ArmR.mirror = true;
      setRotation(ArmR, 0F, -0.9599311F, -0.5235988F);
      ArmL = new ModelRenderer(this, 0, 20);
      ArmL.addBox(-2F, -0.5F, -0.5F, 2, 1, 1);
      ArmL.setRotationPoint(2F, 20.5F, -1.5F);
      ArmL.setTextureSize(64, 32);
      ArmL.mirror = true;
      setRotation(ArmL, 0F, -2.181662F, -0.5235988F);
      FootL = new ModelRenderer(this, 21, 0);
      FootL.addBox(-2F, -0.5F, -1.5F, 3, 1, 2);
      FootL.setRotationPoint(1F, 23F, -0.5F);
      FootL.setTextureSize(64, 32);
      FootL.mirror = true;
      setRotation(FootL, 0F, -2.094395F, -0.2617994F);
      FootR = new ModelRenderer(this, 21, 0);
      FootR.addBox(-2F, -0.5F, -0.5F, 3, 1, 2);
      FootR.setRotationPoint(-1F, 23F, -0.5F);
      FootR.setTextureSize(64, 32);
      FootR.mirror = true;
      setRotation(FootR, 0F, -0.9599311F, -0.2617994F);
      EarR2 = new ModelRenderer(this, 25, 4);
      EarR2.addBox(0F, -2F, -0.5F, 2, 2, 1);
      EarR2.setRotationPoint(2F, 18.9F, 0F);
      EarR2.setTextureSize(64, 32);
      EarR2.mirror = true;
      setRotation(EarR2, 0F, -0.6981317F, -0.5759587F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    EarR.render(f5);
    Body.render(f5);
    FatWide.render(f5);
    FatTall.render(f5);
    FatButt.render(f5);
    ArmR.render(f5);
    ArmL.render(f5);
    FootL.render(f5);
    FootR.render(f5);
    EarR.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
