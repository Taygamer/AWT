package net.awt.awt.exterior.lego;

import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.data.Loyalty;
import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.data.schema.exterior.category.AdaptiveCategory;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.awt.awt.AWT;
import net.awt.awt.animation.LegoAnimation; // Ensure you have this animation class
import net.awt.awt.door.lego.LegoDoorVariant; // Ensure you have this door variant class
import net.minecraft.util.Identifier;

public abstract class LegoExteriorVariant extends ExteriorVariantSchema {
    protected LegoExteriorVariant(String name) {
        super(AdaptiveCategory.REFERENCE, new Identifier(AWT.MOD_ID, "exterior/lego/" + name),
                new Loyalty(Loyalty.Type.OWNER));
    }

    @Override
    public ExteriorAnimation animation(ExteriorBlockEntity be) {
        return new LegoAnimation(be); // Ensure you have this animation class
    }

    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(LegoDoorVariant.REFERENCE); // Ensure you have this door variant class
    }
}