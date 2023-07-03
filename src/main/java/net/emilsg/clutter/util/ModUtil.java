package net.emilsg.clutter.util;

import net.emilsg.clutter.item.ModItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.util.Identifier;

public class ModUtil {
    public static final Identifier CUSTOM_ELYTRA_PREDICATE = new Identifier("clutter", "custom_elytra");


    public static void registerModUtil() {
        registerFlammableBlocks();
        registerStrippableBlocks();
        registerCompostableItems();
    }

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlockTags.FLAMMABLE, 5, 20);
    }

    public static void registerStrippableBlocks() {

    }

    public static void registerCompostableItems() {
        CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

        registry.add(ModItems.HOPS_SEEDS, 0.3f);
        registry.add(ModItems.COTTON_SEEDS, 0.3f);
        registry.add(ModItems.HOPS, 0.3f);
        registry.add(ModItems.COTTON, 0.3f);
    }
}
