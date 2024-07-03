package lu.ts.beskarmod.item;

import lu.ts.beskarmod.BeskarMod;
import lu.ts.beskarmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BESKAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BeskarMod.MODID, "beskar_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.beskarmod.beskar_group"))
                    .icon(() -> new ItemStack(ModItems.BESKAR_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BESKAR_INGOT);
                        entries.add(ModItems.RAW_BESKAR);
                        entries.add(ModBlocks.BESKAR_BLOCK);
                        entries.add(ModBlocks.RAW_BESKAR_BLOCK);
                    }).build());


    public static void registerModItemGroups() {
        BeskarMod.LOGGER.info("Take these items groups my dear!");
    }
}
