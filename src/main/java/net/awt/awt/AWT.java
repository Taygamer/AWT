package net.awt.awt;

import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItemGroups;
import net.awt.awt.item.ModItems;
import net.awt.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWT implements ModInitializer {
    public static final String MOD_ID = "awt";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();
    }

    public static Identifier id(String path) {
        return new Identifier("awt", path);
    }
}