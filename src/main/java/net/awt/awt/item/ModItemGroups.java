package net.awt.awt.item;

import net.awt.awt.AWT;
import net.awt.awt.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup ARTRIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(AWT.MOD_ID, "artrium"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.artrium"))
					.icon(() -> new ItemStack(ModItems.ARTRIUM)).entries((displayContext, entries) -> {
						entries.add(ModItems.ARTRIUM);
						entries.add(ModBlocks.ARTRIUM_ORE);
						entries.add(ModBlocks.ARTRIUM_BLOCK);
						entries.add(ModBlocks.DEEPSLATE_ARTRIUM_ORE);
						entries.add(ModBlocks.TIME_GROWER);
						entries.add(ModBlocks.Unlocker);

					}).build());

	public static final ItemGroup DALEKANIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(AWT.MOD_ID, "skaro"),
			FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.planet_skaro"))
					.icon(() -> new ItemStack(ModItems.DALEKANIUM)).entries((displayContext, entries) -> {
						entries.add(ModItems.DALEKANIUM);
						entries.add(ModItems.DALEKANIUM_SCRAP);
						entries.add(ModItems.METALERT_DUST);
						entries.add(ModItems.CHROMITE);
						entries.add(ModBlocks.DALEKANIUM_BLOCK);
						entries.add(ModBlocks.DALEKANIUM_ORE);
						entries.add(ModBlocks.KALETITE);
						entries.add(ModBlocks.KALETITE_BRICKS);
						entries.add(ModBlocks.CRACKED_KALETITE);
						entries.add(ModBlocks.COBBLED_KALETITE);
						entries.add(ModBlocks.WASTED_BUTTON);
						entries.add(ModBlocks.WASTED_PLANK_SLAB);
						entries.add(ModBlocks.WASTED_PLANKS);
						entries.add(ModBlocks.WASTED_PLANK_STAIRS);
						entries.add(ModBlocks.WASTED_BUSH_PLANT);
						entries.add(ModBlocks.WASTED_LOG);
						entries.add(ModBlocks.WASTED_PRESSURE_PLATE);
						entries.add(ModBlocks.WASTED_TRAP_DOOR);
						entries.add(ModBlocks.WASTED_DIRT);
						entries.add(ModBlocks.WASTED_DOOR);

					}).build());

	public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(AWT.MOD_ID, "mondas"),
			FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.planet_mondas"))
					.icon(() -> new ItemStack(ModItems.STEEL)).entries((displayContext, entries) -> {
						entries.add(ModItems.STEEL);
					}).build());

	public static final ItemGroup ROUNDEL_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(AWT.MOD_ID, "roundel"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.roundel"))
					.icon(() -> new ItemStack(ModBlocks.WHITE_CONCRETE_ROUNDEL)).entries((displayContext, entries) -> {
						entries.add(ModBlocks.WHITE_CONCRETE_ROUNDEL);

					}).build());


	public static void registerItemGroups() {
		AWT.LOGGER.info("Registering Item Groups for" + AWT.MOD_ID);
	}
}
