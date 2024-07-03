package lu.ts.beskarmod.block;

import lu.ts.beskarmod.BeskarMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BESKAR_BLOCK = registerBlock("beskar_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block RAW_BESKAR_BLOCK = registerBlock("raw_beskar_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BeskarMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(BeskarMod.MODID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BeskarMod.LOGGER.info("And also these block my dear!");
    }
}