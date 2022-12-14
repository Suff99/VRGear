package net.vrgear.common.items;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.vrgear.VRGearMod;
import net.vrgear.common.WCItems;

public class ClothingItem extends ArmorItem implements ICustomArmorTexture {

    public ClothingItem(ArmorMaterial armorMaterial, EquipmentSlot EquipmentSlot) {
        super(armorMaterial, EquipmentSlot, WCItems.GENERIC_PROPERTIES);
    }

    @Override
    public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        String textureLocation = Registry.ITEM.getKey(stack.getItem()).getPath();
        return new ResourceLocation(VRGearMod.MOD_ID, "textures/" + textureLocation + ".png");
    }

}