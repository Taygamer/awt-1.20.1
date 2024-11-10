package net.awt.awt.block;

import net.awt.awt.AWT;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block artrium_ore = registerBlock("artrium_ore",
           new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.STONE)));
    public static final Block time_grower = registerBlock("time_grower",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block artrium_block = registerBlock("artrium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block deepslate_artrium_block = registerBlock("deepslate_artrium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.DEEPSLATE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier( AWT.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AWT.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));

    }

    public static void registerModBlocks () {
        AWT.LOGGER.info("Registering ModBlocks for" + AWT.MOD_ID);


//Dino was here
// Tay was here also
    }
}
