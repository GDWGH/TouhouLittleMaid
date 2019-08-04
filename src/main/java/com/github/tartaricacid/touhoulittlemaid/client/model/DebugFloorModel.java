package com.github.tartaricacid.touhoulittlemaid.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * @author TartaricAcid
 * @date 2019/8/4 23:48
 * <p>
 * 绘制皮肤详情界面的地面网格
 **/
public class DebugFloorModel extends ModelBase {
    private final ModelRenderer floor;

    public DebugFloorModel() {
        textureWidth = 1024;
        textureHeight = 1024;
        floor = new ModelRenderer(this);
        floor.setRotationPoint(0.0F, 24.0F, 0.0F);
        floor.cubeList.add(new ModelBox(floor, 0, 0, -65.0F, 0.0F, -80.0F, 130, 0, 145, 0.0F, false));
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        floor.render(scale);
    }
}
