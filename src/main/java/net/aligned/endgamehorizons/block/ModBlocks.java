package net.aligned.endgamehorizons.block;

import net.aligned.endgamehorizons.EndgameHorizons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    private static Block RegisterBlock(String name, Block block, ItemGroup tab) {
        RegisterBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(EndgameHorizons.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(EndgameHorizons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void RegisterModBlocks() {
        EndgameHorizons.LOGGER.debug("Registering ModBlocks!");
    }
}
