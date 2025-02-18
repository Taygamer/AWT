package net.awt.awt.exterior.block;

import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.core.tardis.animation.PulsatingAnimation;
import loqor.ait.data.Loyalty;
import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.data.schema.exterior.category.AdaptiveCategory;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.awt.awt.AWT;
import net.awt.awt.door.block.TardisBlockDoorVariant;
import net.minecraft.util.Identifier;

public abstract class TardisBlockExteriorVariant extends ExteriorVariantSchema {
    protected TardisBlockExteriorVariant(String name) {
        super(AdaptiveCategory.REFERENCE, new Identifier(AWT.MOD_ID, "exterior/block/" + name),
                new Loyalty(Loyalty.Type.OWNER));
    }

    @Override
    public ExteriorAnimation animation(ExteriorBlockEntity exteriorBlockEntity) {
        return new PulsatingAnimation(exteriorBlockEntity);
    }

    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(TardisBlockDoorVariant.REFERENCE);
    }
}
