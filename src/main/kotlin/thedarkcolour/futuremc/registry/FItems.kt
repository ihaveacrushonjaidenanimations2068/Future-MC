@file:Suppress("HasPlatformType")

package thedarkcolour.futuremc.registry

import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.WallOrFloorItem
import net.minecraftforge.registries.IForgeRegistry
import thedarkcolour.futuremc.FutureMC
import thedarkcolour.futuremc.config.Config
import thedarkcolour.futuremc.item.*

object FItems {
    val NETHER_GOLD_ORE = BlockItem(FBlocks.NETHER_GOLD_ORE, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("nether_gold_ore")
    val SOUL_SOIL = BlockItem(FBlocks.SOUL_SOIL, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("soul_soil")
    val BASALT = BlockItem(FBlocks.BASALT, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("basalt")
    val POLISHED_BASALT = BlockItem(FBlocks.POLISHED_BASALT, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("polished_basalt")
    val SOUL_FIRE_TORCH = WallOrFloorItem(FBlocks.SOUL_FIRE_TORCH, FBlocks.SOUL_FIRE_WALL_TORCH, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("soul_fire_torch")
    val SOUL_FIRE_LANTERN = BlockItem(FBlocks.SOUL_FIRE_LANTERN, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("soul_fire_lantern")
    val WARPED_STEM = BlockItem(FBlocks.WARPED_STEM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_stem")
    val STRIPPED_WARPED_STEM = BlockItem(FBlocks.STRIPPED_WARPED_STEM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_warped_stem")
    val WARPED_HYPHAE = BlockItem(FBlocks.WARPED_HYPHAE, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_hyphae")
    val STRIPPED_WARPED_HYPHAE = BlockItem(FBlocks.STRIPPED_WARPED_HYPHAE, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_warped_hyphae")
    val WARPED_NYLIUM = BlockItem(FBlocks.WARPED_NYLIUM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_nylium")
    val WARPED_FUNGUS = BlockItem(FBlocks.WARPED_FUNGUS, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_fungus")
    val WARPED_WART_BLOCK = BlockItem(FBlocks.WARPED_WART_BLOCK, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_wart_block")
    val WARPED_ROOTS = BlockItem(FBlocks.WARPED_ROOTS, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("warped_roots")
    val NETHER_SPROUTS = BlockItem(FBlocks.NETHER_SPROUTS, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("nether_sprouts")
    val CRIMSON_STEM = BlockItem(FBlocks.CRIMSON_STEM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_stem")
    val STRIPPED_CRIMSON_STEM = BlockItem(FBlocks.STRIPPED_CRIMSON_STEM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_crimson_stem")
    val CRIMSON_HYPHAE = BlockItem(FBlocks.CRIMSON_HYPHAE, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_hyphae")
    val STRIPPED_CRIMSON_HYPHAE = BlockItem(FBlocks.STRIPPED_CRIMSON_HYPHAE, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_crimson_hyphae")
    val CRIMSON_NYLIUM = BlockItem(FBlocks.CRIMSON_NYLIUM, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_nylium")
    val CRIMSON_FUNGUS = BlockItem(FBlocks.CRIMSON_FUNGUS, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_fungus")
    val SHROOMLIGHT = BlockItem(FBlocks.SHROOMLIGHT, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("shroomlight")
    val WEEPING_VINES = BlockItem(FBlocks.WEEPING_VINES, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("weeping_vines")
    val TWISTING_VINES = BlockItem(FBlocks.TWISTING_VINES, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("twisting_vines")
    val CRIMSON_ROOTS = BlockItem(FBlocks.CRIMSON_ROOTS, Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("crimson_roots")
    val CRIMSON_PLANKS = BlockItem(FBlocks.CRIMSON_PLANKS, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_planks")
    val WARPED_PLANKS = BlockItem(FBlocks.WARPED_PLANKS, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_planks")
    val CRIMSON_SLAB = BlockItem(FBlocks.CRIMSON_SLAB, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("crimson_slab")
    val WARPED_SLAB = BlockItem(FBlocks.WARPED_SLAB, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("warped_slab")
    val CRIMSON_PRESSURE_PLATE = BlockItem(FBlocks.CRIMSON_PRESSURE_PLATE, Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName("crimson_pressure_plate")
    val WARPED_PRESSURE_PLATE = BlockItem(FBlocks.WARPED_PRESSURE_PLATE, Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName("warped_pressure_plate")
    val ANCIENT_DEBRIS = FireproofBlockItem(FBlocks.ANCIENT_DEBRIS, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ancient_debris")
    val NETHERITE_BLOCK = FireproofBlockItem(FBlocks.NETHERITE_BLOCK, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("netherite_block")

    val NETHERITE_HELMET = FireproofArmorItem(NetheriteArmorMaterial, EquipmentSlotType.HEAD, Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("netherite_helmet")
    val NETHERITE_CHESTPLATE = FireproofArmorItem(NetheriteArmorMaterial, EquipmentSlotType.CHEST, Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("netherite_chestplate")
    val NETHERITE_LEGGINGS = FireproofArmorItem(NetheriteArmorMaterial, EquipmentSlotType.LEGS, Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("netherite_leggings")
    val NETHERITE_BOOTS = FireproofArmorItem(NetheriteArmorMaterial, EquipmentSlotType.FEET, Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("netherite_boots")
    val NETHERITE_INGOT = FireproofItem(Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("netherite_ingot")
    val NETHERITE_SCRAP = FireproofItem(Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("netherite_scrap")
    val NETHERITE_AXE = FireproofAxeItem(NetheriteItemTier, 5.0f, -3.0f, Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("netherite_axe")
    val NETHERITE_HOE = FireproofHoeItem(NetheriteItemTier, 0.0f, Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("netherite_hoe")
    val NETHERITE_PICKAXE = FireproofPickaxeItem(NetheriteItemTier, 1, -2.8f, Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("netherite_pickaxe")
    val NETHERITE_SHOVEL = FireproofShovelItem(NetheriteItemTier, 1.5f, -3.0f, Item.Properties().group(ItemGroup.TOOLS)).setRegistryName("netherite_shovel")
    val NETHERITE_SWORD = FireproofSwordItem(NetheriteItemTier, 3, -2.4f, Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("netherite_sword")

    fun registerItems(items: IForgeRegistry<Item>) {
        if (FutureMC.DEBUG) {
            items.register(NETHER_GOLD_ORE)
            items.register(SOUL_SOIL)
            items.register(BASALT)
            items.register(POLISHED_BASALT)
            items.register(SOUL_FIRE_TORCH)
            items.register(SOUL_FIRE_LANTERN)
            items.register(WARPED_STEM)
            items.register(STRIPPED_WARPED_STEM)
            items.register(WARPED_HYPHAE)
            items.register(STRIPPED_WARPED_HYPHAE)
            items.register(WARPED_NYLIUM)
            items.register(WARPED_FUNGUS)
            items.register(WARPED_WART_BLOCK)
            items.register(WARPED_ROOTS)
            items.register(NETHER_SPROUTS)
            items.register(CRIMSON_STEM)
            items.register(STRIPPED_CRIMSON_STEM)
            items.register(CRIMSON_HYPHAE)
            items.register(STRIPPED_CRIMSON_HYPHAE)
            items.register(CRIMSON_NYLIUM)
            items.register(CRIMSON_FUNGUS)
            items.register(SHROOMLIGHT)
            items.register(WEEPING_VINES)
            items.register(TWISTING_VINES)
            items.register(CRIMSON_ROOTS)
            items.register(CRIMSON_PLANKS)
            items.register(WARPED_PLANKS)
            items.register(CRIMSON_SLAB)
            items.register(WARPED_SLAB)
            items.register(CRIMSON_PRESSURE_PLATE)
            items.register(WARPED_PRESSURE_PLATE)
        }
        items.register(ANCIENT_DEBRIS, Config.ancientDebrisEnabled)
        items.register(NETHERITE_BLOCK, Config.netherite)

        items.register(NETHERITE_HELMET, Config.netherite)
        items.register(NETHERITE_CHESTPLATE, Config.netherite)
        items.register(NETHERITE_LEGGINGS, Config.netherite)
        items.register(NETHERITE_BOOTS, Config.netherite)
        items.register(NETHERITE_INGOT, Config.netherite)
        items.register(NETHERITE_SCRAP, Config.netherite)
        items.register(NETHERITE_AXE, Config.netherite)
        items.register(NETHERITE_HOE, Config.netherite)
        items.register(NETHERITE_PICKAXE, Config.netherite)
        items.register(NETHERITE_SHOVEL, Config.netherite)
        items.register(NETHERITE_SWORD, Config.netherite)
    }
}