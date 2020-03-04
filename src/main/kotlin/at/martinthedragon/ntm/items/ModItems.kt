package at.martinthedragon.ntm.items

import at.martinthedragon.ntm.blocks.ModBlocks
import at.martinthedragon.ntm.blocks.advancedblocks.CustomizedBlock
import at.martinthedragon.ntm.items.advanceditems.CustomizedItem
import at.martinthedragon.ntm.items.advanceditems.CustomizedItem.CustomizedProperties
import at.martinthedragon.ntm.lib.MODID
import at.martinthedragon.ntm.main.CreativeTabs
import at.martinthedragon.ntm.main.NTM
import net.minecraft.item.Item
import net.minecraft.item.Rarity
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.RegistryEvent.Register
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod.EventBusSubscriber
import net.minecraftforge.registries.ForgeRegistries

typealias NTMItem = CustomizedItem
typealias NTMProp = CustomizedProperties

// Use this class if you want to access items.
// Write item variables only!
// The order of items in the inventory depends on the order of the variables here.
@Suppress("unused")
@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
object ModItems {
    private val itemCache = emptySet<CustomizedItem>().toMutableSet()
    val items = emptySet<String>().toMutableSet()
    
    private val parts = CreativeTabs.PARTS_TAB

    // TODO add recipes for ingots after low enriched schrabidium ingot

    // NTM Resources and Parts
    // Ingots
    val URANIUM_INGOT = NTMItem("uranium_ingot", NTMProp(radiation = 1, group = parts))                                                 .also { itemCache += it }
    val U233_INGOT = NTMItem("u233_ingot", NTMProp(radiation = 1, group = parts))                                                       .also { itemCache += it }
    val U235_INGOT = NTMItem("u235_ingot", NTMProp(radiation = 1, group = parts))                                                       .also { itemCache += it }
    val U238_INGOT = NTMItem("u238_ingot", NTMProp(radiation = 1, group = parts))                                                       .also { itemCache += it }
    val THORIUM_INGOT = NTMItem("thorium_ingot", NTMProp(radiation = 1, group = parts))                                                 .also { itemCache += it } // TODO do lore thing with polaroid like in original mod
    val PLUTONIUM_INGOT = NTMItem("plutonium_ingot", NTMProp(radiation = 1, group = parts))                                             .also { itemCache += it }
    val PU238_INGOT = NTMItem("pu238_ingot", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val PU239_INGOT = NTMItem("pu239_ingot", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val PU240_INGOT = NTMItem("pu240_ingot", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val NEPTUNIUM_INGOT = NTMItem("neptunium_ingot", NTMProp(radiation = 1, group = parts))                                             .also { itemCache += it }
    val TITANIUM_INGOT = NTMItem("titanium_ingot", NTMProp(group = parts))                                                              .also { itemCache += it }
    val INDUSTRIAL_COPPER_INGOT = NTMItem("industrial_copper_ingot", NTMProp(group = parts))                                            .also { itemCache += it }
    val MINECRAFT_COPPER_INGOT = NTMItem("minecraft_copper_ingot", NTMProp(group = parts))                                              .also { itemCache += it }
    val ADVANCED_ALLOY_INGOT = NTMItem("advanced_alloy_ingot", NTMProp(group = parts))                                                  .also { itemCache += it }
    val TUNGSTEN_INGOT = NTMItem("tungsten_ingot", NTMProp(group = parts))                                                              .also { itemCache += it }
    val ALUMINIUM_INGOT = NTMItem("aluminium_ingot", NTMProp(group = parts))                                                            .also { itemCache += it }
    val STEEL_INGOT = NTMItem("steel_ingot", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val LEAD_INGOT = NTMItem("lead_ingot", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val BERYLLIUM_INGOT = NTMItem("beryllium_ingot", NTMProp(group = parts))                                                            .also { itemCache += it }
    val HIGH_SPEED_STEEL_INGOT = NTMItem("high_speed_steel_ingot", NTMProp(group = parts))                                              .also { itemCache += it }
    val POLYMER_INGOT = NTMItem("polymer_ingot", NTMProp(group = parts))                                                                .also { itemCache += it }
    val SCHRABIDIUM_INGOT = NTMItem("schrabidium_ingot", NTMProp(radiation = 1, group = parts, rarity = Rarity.RARE))                   .also { itemCache += it }
    val MAGNETIZED_TUNGSTEN_INGOT = NTMItem("magnetized_tungsten_ingot", NTMProp(group = parts))                                        .also { itemCache += it }
    val COMBINE_STEEL_INGOT = NTMItem("combine_steel_ingot", NTMProp(group = parts))                                                    .also { itemCache += it }
    val SOLINIUM_INGOT = NTMItem("solinium_ingot", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val URANIUM_FUEL_INGOT = NTMItem("uranium_fuel_ingot", NTMProp(radiation = 1, group = parts))                                       .also { itemCache += it }
    val THORIUM_FUEL_INGOT = NTMItem("thorium_fuel_ingot", NTMProp(radiation = 1, group = parts))                                       .also { itemCache += it }
    val PLUTONIUM_FUEL_INGOT = NTMItem("plutonium_fuel_ingot", NTMProp(radiation = 1, group = parts))                                   .also { itemCache += it }
    val MOX_FUEL_INGOT = NTMItem("mox_fuel_ingot", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val SCHRABIDIUM_FUEL_INGOT = NTMItem("schrabidium_fuel_ingot", NTMProp(radiation = 1, group = parts))                               .also { itemCache += it }
    val HIGH_ENRICHED_SCHRABIDIUM_FUEL_INGOT = NTMItem("high_enriched_schrabidium_fuel_ingot", NTMProp(radiation = 1, group = parts))   .also { itemCache += it }
    val LOW_ENRICHED_SCHRABIDIUM_FUEL_INGOT = NTMItem("low_enriched_schrabidium_fuel_ingot", NTMProp(radiation = 1, group = parts))     .also { itemCache += it }
    val AUSTRALIUM_INGOT = NTMItem("australium_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val WEIDANIUM_INGOT = NTMItem("weidanium_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                  .also { itemCache += it }
    val REIIUM_INGOT = NTMItem("reiium_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                        .also { itemCache += it }
    val UNOBTAINIUM_INGOT = NTMItem("unobtainium_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                              .also { itemCache += it }
    val DAFFERGON_INGOT = NTMItem("daffergon_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                  .also { itemCache += it }
    val VERTICIUM_INGOT = NTMItem("verticium_ingot", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                  .also { itemCache += it }
    val LANTHANUM_INGOT = NTMItem("lanthanum_ingot", NTMProp(group = parts))                                                            .also { itemCache += it }
    val ACTINIUM_INGOT = NTMItem("actinium_ingot", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val DESH_INGOT = NTMItem("desh_ingot", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val STARMETAL_INGOT = NTMItem("starmetal_ingot", NTMProp(group = parts))                                                            .also { itemCache += it }
    val SATURNITE_INGOT = NTMItem("saturnite_ingot", NTMProp(group = parts, rarity = Rarity.RARE))                                      .also { itemCache += it }
    val EUPHEMIUM_INGOT = NTMItem("euphemium_ingot", NTMProp(group = parts, rarity = Rarity.EPIC))                                      .also { itemCache += it }
    val DINEUTRONIUM_INGOT = NTMItem("dineutronium_ingot", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Cubes
    val LITHIUM_CUBE = NTMItem("lithium_cube", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val SOLID_FUEL_CUBE = NTMItem("solid_fuel_cube", NTMProp(group = parts))                                                            .also { itemCache += it }
    val SOLID_ROCKET_FUEL_CUBE = NTMItem("solid_rocket_fuel_cube", NTMProp(group = parts))                                              .also { itemCache += it }
    // Fuels
    val COKE = NTMItem("coke", NTMProp(group = parts, burnTime = 160))                                                                  .also { itemCache += it }
    val LIGNITE = NTMItem("lignite", NTMProp(group = parts, burnTime = 60))                                                             .also { itemCache += it }
    val LIGNITE_BRIQUETTE = NTMItem("lignite_briquette", NTMProp(group = parts, burnTime = 80))                                         .also { itemCache += it }
    // Powders
    val SULFUR = NTMItem("sulfur", NTMProp(group = parts))                                                                              .also { itemCache += it }
    val NITER = NTMItem("niter", NTMProp(group = parts))                                                                                .also { itemCache += it }
    val FLUORITE = NTMItem("fluorite", NTMProp(group = parts))                                                                          .also { itemCache += it }
    val COAL_POWDER = NTMItem("coal_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val IRON_POWDER = NTMItem("iron_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val GOLD_POWDER = NTMItem("gold_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val LAPIS_LAZULI_POWDER = NTMItem("lapis_lazuli_powder", NTMProp(group = parts))                                                    .also { itemCache += it }
    val QUARTZ_POWDER = NTMItem("quartz_powder", NTMProp(group = parts))                                                                .also { itemCache += it }
    val DIAMOND_POWDER = NTMItem("diamond_powder", NTMProp(group = parts))                                                              .also { itemCache += it }
    val EMERALD_POWDER = NTMItem("emerald_powder", NTMProp(group = parts))                                                              .also { itemCache += it }
    val URANIUM_POWDER = NTMItem("uranium_powder", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val PLUTONIUM_POWDER = NTMItem("plutonium_powder", NTMProp(radiation = 1, group = parts))                                           .also { itemCache += it }
    val NEPTUNIUM_POWDER = NTMItem("neptunium_powder", NTMProp(radiation = 1, group = parts, rarity = Rarity.EPIC))                     .also { itemCache += it }
    val TITANIUM_POWDER = NTMItem("titanium_powder", NTMProp(group = parts))                                                            .also { itemCache += it }
    val COPPER_POWDER = NTMItem("copper_powder", NTMProp(group = parts))                                                                .also { itemCache += it }
    val RED_COPPER_POWDER = NTMItem("red_copper_powder", NTMProp(group = parts))                                                        .also { itemCache += it }
    val ADVANCED_ALLOY_POWDER = NTMItem("advanced_alloy_powder", NTMProp(group = parts))                                                .also { itemCache += it }
    val TUNGSTEN_POWDER = NTMItem("tungsten_powder", NTMProp(group = parts))                                                            .also { itemCache += it }
    val ALUMINIUM_POWDER = NTMItem("aluminium_powder", NTMProp(group = parts))                                                          .also { itemCache += it }
    val STEEL_POWDER = NTMItem("steel_powder", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val LEAD_POWDER = NTMItem("lead_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val BERYLLIUM_POWDER = NTMItem("beryllium_powder", NTMProp(group = parts))                                                          .also { itemCache += it }
    val HIGH_SPEED_STEEL_POWDER = NTMItem("high_speed_steel_powder", NTMProp(group = parts))                                            .also { itemCache += it }
    val POLYMER_POWDER = NTMItem("polymer_powder", NTMProp(group = parts))                                                              .also { itemCache += it }
    val SCHRABIDIUM_POWDER = NTMItem("schrabidium_powder", NTMProp(group = parts, rarity = Rarity.RARE))                                .also { itemCache += it }
    val MAGNETIZED_TUNGSTEN_POWDER = NTMItem("magnetized_tungsten_powder", NTMProp(group = parts))                                      .also { itemCache += it }
    val COMBINE_STEEL_POWDER = NTMItem("combine_steel_powder", NTMProp(group = parts))                                                  .also { itemCache += it }
    val LITHIUM_POWDER = NTMItem("lithium_powder", NTMProp(group = parts))                                                              .also { itemCache += it }
    val LANTHANUM_POWDER = NTMItem("lanthanum_powder", NTMProp(group = parts))                                                          .also { itemCache += it }
    val ACTINIUM_POWDER = NTMItem("actinium_powder", NTMProp(radiation = 1, group = parts))                                             .also { itemCache += it }
    val AUSTRALIUM_POWDER = NTMItem("australium_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                              .also { itemCache += it }
    val WEIDANIUM_POWDER = NTMItem("weidanium_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val REIIUM_POWDER = NTMItem("reiium_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                      .also { itemCache += it }
    val UNOBTAINIUM_POWDER = NTMItem("unobtainium_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                            .also { itemCache += it }
    val DAFFERGON_POWDER = NTMItem("daffergon_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val VERTICIUM_POWDER = NTMItem("verticium_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val EUPHEMIUM_POWDER = NTMItem("euphemium_powder", NTMProp(group = parts, rarity = Rarity.EPIC))                                    .also { itemCache += it }
    val DINEUTRONIUM_POWDER = NTMItem("dineutronium_powder", NTMProp(group = parts))                                                    .also { itemCache += it }
    val NEODYMIUM_POWDER = NTMItem("neodymium_powder", NTMProp(group = parts, rarity = Rarity.EPIC))                                    .also { itemCache += it }
    val COBALT_POWDER = NTMItem("cobalt_powder", NTMProp(group = parts, rarity = Rarity.EPIC))                                          .also { itemCache += it }
    val NIOBIUM_POWDER = NTMItem("niobium_powder", NTMProp(group = parts, rarity = Rarity.EPIC))                                        .also { itemCache += it }
    val CERIUM_POWDER = NTMItem("cerium_powder", NTMProp(group = parts, rarity = Rarity.EPIC))                                          .also { itemCache += it }
    val DESH_POWDER = NTMItem("desh_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val DESH_BLEND = NTMItem("desh_blend", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val NITANIUM_BLEND = NTMItem("nitanium_blend", NTMProp(group = parts))                                                              .also { itemCache += it }
    val SPARK_BLEND = NTMItem("spark_blend", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val LIGNITE_POWDER = NTMItem("lignite_powder", NTMProp(group = parts))                                                              .also { itemCache += it }
    val METEORITE_POWDER = NTMItem("meteorite_powder", NTMProp(group = parts))                                                          .also { itemCache += it }
    val DESATURATED_REDSTONE = NTMItem("desaturated_redstone", NTMProp(group = parts))                                                  .also { itemCache += it }
    val DUST = NTMItem("dust", NTMProp(group = parts))                                                                                  .also { itemCache += it } // TODO do the thing where the lore changes according to the polaroid
    val YELLOWCAKE = NTMItem("yellowcake", NTMProp(radiation = 1, group = parts))                                                       .also { itemCache += it }
    val ENCHANTMENT_POWDER = NTMItem("enchantment_powder", NTMProp(group = parts))                                                      .also { itemCache += it }
    val CLOUD_RESIDUE = NTMItem("cloud_residue", NTMProp(group = parts))                                                                .also { itemCache += it }
    val FLAME_POWDER = NTMItem("flame_powder", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val CRYO_POWDER = NTMItem("cryo_powder", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val POISON_POWDER = NTMItem("poison_powder", NTMProp(group = parts))                                                                .also { itemCache += it }
    val THERMITE = NTMItem("thermite", NTMProp(group = parts))                                                                          .also { itemCache += it }
    val ENERGY_POWDER = NTMItem("energy_powder", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                      .also { itemCache += it }
    // Tiny Powders
    val TINY_LITHIUM_POWDER = NTMItem("tiny_lithium_powder", NTMProp(group = parts))                                                    .also { itemCache += it }
    val TINY_NEODYMIUM_POWDER = NTMItem("tiny_neodymium_powder", NTMProp(group = parts))                                                .also { itemCache += it }
    val TINY_COBALT_POWDER = NTMItem("tiny_cobalt_powder", NTMProp(group = parts))                                                      .also { itemCache += it }
    val TINY_NIOBIUM_POWDER = NTMItem("tiny_niobium_powder", NTMProp(group = parts))                                                    .also { itemCache += it }
    val TINY_CERIUM_POWDER = NTMItem("tiny_cerium_powder", NTMProp(group = parts))                                                      .also { itemCache += it }
    val TINY_LANTHANUM_POWDER = NTMItem("tiny_lanthanum_powder", NTMProp(group = parts))                                                .also { itemCache += it }
    val TINY_ACTINIUM_POWDER = NTMItem("tiny_actinium_powder", NTMProp(radiation = 1, group = parts))                                   .also { itemCache += it }
    val TINY_METEORITE_POWDER = NTMItem("tiny_meteorite_powder", NTMProp(group = parts))                                                .also { itemCache += it }
    // Fragments
    val NEODYMIUM_FRAGMENT = NTMItem("neodymium_fragment", NTMProp(group = parts))                                                      .also { itemCache += it }
    val COBALT_FRAGMENT = NTMItem("cobalt_fragment", NTMProp(group = parts))                                                            .also { itemCache += it }
    val NIOBIUM_FRAGMENT = NTMItem("niobium_fragment", NTMProp(group = parts))                                                          .also { itemCache += it }
    val CERIUM_FRAGMENT = NTMItem("cerium_fragment", NTMProp(group = parts))                                                            .also { itemCache += it }
    val LANTHANUM_FRAGMENT = NTMItem("lanthanum_fragment", NTMProp(group = parts))                                                      .also { itemCache += it }
    val ACTINIUM_FRAGMENT = NTMItem("actinium_fragment", NTMProp(radiation = 1, group = parts))                                         .also { itemCache += it }
    val METEORITE_FRAGMENT = NTMItem("meteorite_fragment", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Propellants
    val BALLISTITE_PROPELLANT = NTMItem("ballistite_propellant", NTMProp(group = parts))                                                .also { itemCache += it }
    val CORDITE_PROPELLANT = NTMItem("cordite_propellant", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Biomass
    val BIOMASS = NTMItem("biomass", NTMProp(group = parts))                                                                            .also { itemCache += it }
    val COMPRESSED_BIOMASS = NTMItem("compressed_biomass", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Nuggets
    val URANIUM_NUGGET = NTMItem("uranium_nugget", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val U233_NUGGET = NTMItem("u233_nugget", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val U235_NUGGET = NTMItem("u235_nugget", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val U238_NUGGET = NTMItem("u238_nugget", NTMProp(radiation = 1, group = parts))                                                     .also { itemCache += it }
    val THORIUM_NUGGET = NTMItem("thorium_nugget", NTMProp(radiation = 1, group = parts))                                               .also { itemCache += it }
    val PLUTONIUM_NUGGET = NTMItem("plutonium_nugget", NTMProp(radiation = 1, group = parts))                                           .also { itemCache += it }
    val PU238_NUGGET = NTMItem("pu238_nugget", NTMProp(radiation = 1, group = parts))                                                   .also { itemCache += it }
    val PU239_NUGGET = NTMItem("pu239_nugget", NTMProp(radiation = 1, group = parts))                                                   .also { itemCache += it }
    val PU240_NUGGET = NTMItem("pu240_nugget", NTMProp(radiation = 1, group = parts))                                                   .also { itemCache += it }
    val NEPTUNIUM_NUGGET = NTMItem("neptunium_nugget", NTMProp(radiation = 1, group = parts))                                           .also { itemCache += it }
    val LEAD_NUGGET = NTMItem("lead_nugget", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val BERYLLIUM_NUGGET = NTMItem("beryllium_nugget", NTMProp(group = parts))                                                          .also { itemCache += it }
    val SCHRABIDIUM_NUGGET = NTMItem("schrabidium_nugget", NTMProp(radiation = 1, group = parts, rarity = Rarity.RARE))                 .also { itemCache += it }
    val SOLINIUM_NUGGET = NTMItem("solinium_nugget", NTMProp(radiation = 1, group = parts))                                             .also { itemCache += it }
    val URANIUM_FUEL_NUGGET = NTMItem("uranium_fuel_nugget", NTMProp(radiation = 1, group = parts))                                     .also { itemCache += it }
    val THORIUM_FUEL_NUGGET = NTMItem("thorium_fuel_nugget", NTMProp(radiation = 1, group = parts))                                     .also { itemCache += it }
    val PLUTONIUM_FUEL_NUGGET = NTMItem("plutonium_fuel_nugget", NTMProp(radiation = 1, group = parts))                                 .also { itemCache += it }
    val MOX_FUEL_NUGGET = NTMItem("mox_fuel_nugget", NTMProp(radiation = 1, group = parts))                                             .also { itemCache += it }
    val SCHRABIDIUM_FUEL_NUGGET = NTMItem("schrabidium_fuel_nugget", NTMProp(radiation = 1, group = parts))                             .also { itemCache += it }
    val HIGH_ENRICHED_SCHRABIDIUM_FUEL_NUGGET = NTMItem("high_enriched_schrabidium_fuel_nugget", NTMProp(radiation = 1, group = parts)) .also { itemCache += it }
    val LOW_ENRICHED_SCHRABIDIUM_FUEL_NUGGET = NTMItem("low_enriched_schrabidium_fuel_nugget", NTMProp(radiation = 1, group = parts))   .also { itemCache += it }
    val AUSTRALIUM_NUGGET = NTMItem("australium_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                              .also { itemCache += it }
    val WEIDANIUM_NUGGET = NTMItem("weidanium_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val REIIUM_NUGGET = NTMItem("reiium_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                      .also { itemCache += it }
    val UNOBTAINIUM_NUGGET = NTMItem("unobtainium_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                            .also { itemCache += it }
    val DAFFERGON_NUGGET = NTMItem("daffergon_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val VERTICIUM_NUGGET = NTMItem("verticium_nugget", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                .also { itemCache += it }
    val DESH_NUGGET = NTMItem("desh_nugget", NTMProp(group = parts)).also { itemCache += it }
    val EUPHEMIUM_NUGGET = NTMItem("euphemium_nugget", NTMProp(group = parts, rarity = Rarity.EPIC))                                    .also { itemCache += it }
    val DINEUTRONIUM_NUGGET = NTMItem("dineutronium_nugget", NTMProp(group = parts))                                                    .also { itemCache += it }
    // Plates
    val IRON_PLATE = NTMItem("iron_plate", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val GOLD_PLATE = NTMItem("gold_plate", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val TITANIUM_PLATE = NTMItem("titanium_plate", NTMProp(group = parts))                                                              .also { itemCache += it }
    val ALUMINIUM_PLATE = NTMItem("aluminium_plate", NTMProp(group = parts))                                                            .also { itemCache += it }
    val STEEL_PLATE = NTMItem("steel_plate", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val LEAD_PLATE = NTMItem("lead_plate", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val COPPER_PLATE = NTMItem("copper_plate", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val ADVANCED_ALLOY_PLATE = NTMItem("advanced_alloy_plate", NTMProp(group = parts))                                                  .also { itemCache += it }
    val NEUTRON_REFLECTOR = NTMItem("neutron_reflector", NTMProp(group = parts))                                                        .also { itemCache += it }
    val SCHRABIDIUM_PLATE = NTMItem("schrabidium_plate", NTMProp(radiation = 1, group = parts, rarity = Rarity.RARE))                   .also { itemCache += it }
    val COMBINE_STEEL_PLATE = NTMItem("combine_steel_plate", NTMProp(group = parts))                                                    .also { itemCache += it }
    val MIXED_PLATE = NTMItem("mixed_plate", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val SATURNITE_PLATE = NTMItem("saturnite_plate", NTMProp(group = parts, rarity = Rarity.RARE))                                      .also { itemCache += it }
    val PAA_ALLOY_PLATE = NTMItem("paa_alloy_plate", NTMProp(group = parts, rarity = Rarity.UNCOMMON))                                  .also { itemCache += it }
    val INSULATOR = NTMItem("insulator", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val KEVLAR_CERAMIC_COMPOUND = NTMItem("kevlar_ceramic_compound", NTMProp(group = parts))                                            .also { itemCache += it }
    val ANGRY_METAL = NTMItem("angry_metal", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val DESH_COMPOUND_PLATE = NTMItem("desh_compound_plate", NTMProp(group = parts))                                                    .also { itemCache += it }
    val EUPHEMIUM_COMPOUND_PLATE = NTMItem("euphemium_compound_plate", NTMProp(group = parts, rarity = Rarity.EPIC))                    .also { itemCache += it }
    val DINEUTRONIUM_COMPOUND_PLATE = NTMItem("dineutronium_compound_plate", NTMProp(group = parts))                                    .also { itemCache += it }
    val COPPER_PANEL = NTMItem("copper_panel", NTMProp(group = parts))                                                                  .also { itemCache += it }
    // Bolts
    val HIGH_SPEED_STEEL_BOLT = NTMItem("high_speed_steel_bolt", NTMProp(group = parts))                                                .also { itemCache += it }
    val TUNGSTEN_BOLT = NTMItem("tungsten_bolt", NTMProp(group = parts))                                                                .also { itemCache += it }
    val REINFORCED_TURBINE_SHAFT = NTMItem("reinforced_turbine_shaft", NTMProp(group = parts))                                          .also { itemCache += it }
    // Cloths
    val HAZMAT_CLOTH = NTMItem("hazmat_cloth", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val ADVANCED_HAZMAT_CLOTH = NTMItem("advanced_hazmat_cloth", NTMProp(group = parts))                                                .also { itemCache += it }
    val LEAD_REINFORCED_HAZMAT_CLOTH = NTMItem("lead_reinforced_hazmat_cloth", NTMProp(group = parts))                                  .also { itemCache += it }
    val FIRE_PROXIMITY_CLOTH = NTMItem("fire_proximity_cloth", NTMProp(group = parts))                                                  .also { itemCache += it }
    val ACTIVATED_CARBON_FILTER = NTMItem("activated_carbon_filter", NTMProp(group = parts))                                            .also { itemCache += it }
    // Wires
    val ALUMINIUM_WIRE = NTMItem("aluminium_wire", NTMProp(group = parts))                                                              .also { itemCache += it }
    val COPPER_WIRE = NTMItem("copper_wire", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val TUNGSTEN_WIRE = NTMItem("tungsten_wire", NTMProp(group = parts))                                                                .also { itemCache += it }
    val RED_COPPER_WIRE = NTMItem("red_copper_wire", NTMProp(group = parts))                                                            .also { itemCache += it }
    val SUPER_CONDUCTOR = NTMItem("super_conductor", NTMProp(group = parts))                                                            .also { itemCache += it }
    val GOLD_WIRE = NTMItem("gold_wire", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val SCHRABIDIUM_WIRE = NTMItem("schrabidium_wire", NTMProp(radiation = 1, group = parts, rarity = Rarity.RARE))                     .also { itemCache += it }
    val HIGH_TEMPERATURE_SUPER_CONDUCTOR = NTMItem("high_temperature_super_conductor", NTMProp(group = parts))                          .also { itemCache += it }
    // Coils
    val COPPER_COIL = NTMItem("copper_coil", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val RING_COIL = NTMItem("ring_coil", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val SUPER_CONDUCTING_COIL = NTMItem("super_conducting_coil", NTMProp(group = parts))                                                .also { itemCache += it }
    val SUPER_CONDUCTING_RING_COIL = NTMItem("super_conducting_ring_coil", NTMProp(group = parts))                                      .also { itemCache += it }
    val GOLD_COIL = NTMItem("gold_coil", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val GOLDEN_RING_COIL = NTMItem("golden_ring_coil", NTMProp(group = parts))                                                          .also { itemCache += it }
    val HEATING_COIL = NTMItem("heating_coil", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val HIGH_TEMPERATURE_SUPER_CONDUCTING_COIL = NTMItem("high_temperature_super_conducting_coil", NTMProp(group = parts))              .also { itemCache += it }
    // Some random stuff
    val STEEL_TANK = NTMItem("steel_tank", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val MOTOR = NTMItem("motor", NTMProp(group = parts))                                                                                .also { itemCache += it }
    val CENTRIFUGE_ELEMENT = NTMItem("centrifuge_element", NTMProp(group = parts))                                                      .also { itemCache += it }
    val CENTRIFUGE_TOWER = NTMItem("centrifuge_tower", NTMProp(group = parts))                                                          .also { itemCache += it }
    val DEE_MAGNETS = NTMItem("dee_magnets", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val FLAT_MAGNET = NTMItem("flat_magnet", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val CYCLOTRON_TOWER = NTMItem("cyclotron_tower", NTMProp(group = parts))                                                            .also { itemCache += it }
    val BREEDING_REACTOR_CORE = NTMItem("breeding_reactor_core", NTMProp(group = parts))                                                .also { itemCache += it }
    val RTG_UNIT = NTMItem("rtg_unit", NTMProp(group = parts))                                                                          .also { itemCache += it }
    // Distribution Units
    val THERMAL_DISTRIBUTION_UNIT = NTMItem("thermal_distribution_unit", NTMProp(group = parts))                                        .also { itemCache += it }
    val ENDOTHERMIC_DISTRIBUTION_UNIT = NTMItem("endothermic_distribution_unit", NTMProp(group = parts))                                .also { itemCache += it }
    val EXOTHERMIC_DISTRIBUTION_UNIT = NTMItem("exothermic_distribution_unit", NTMProp(group = parts))                                  .also { itemCache += it }
    val GRAVITY_MANIPULATOR = NTMItem("gravity_manipulator", NTMProp(group = parts))                                                    .also { itemCache += it }
    // Some more random stuff
    val STEEL_PIPES = NTMItem("steel_pipes", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val TITANIUM_DRILL = NTMItem("titanium_drill", NTMProp(group = parts))                                                              .also { itemCache += it }
    val PHOTOVOLTAIC_PANEL = NTMItem("photovoltaic_panel", NTMProp(group = parts))                                                      .also { itemCache += it }
    val CHLORINE_PINWHEEL = NTMItem("chlorine_pinwheel", NTMProp(group = parts))                                                        .also { itemCache += it }
    val TELEPAD = NTMItem("telepad", NTMProp(group = parts))                                                                            .also { itemCache += it }
    val ENTANGLEMENT_KIT = NTMItem("entanglement_kit", NTMProp(group = parts))                                                          .also { itemCache += it }
    val STABILIZER_COMPONENT = NTMItem("stabilizer_component", NTMProp(group = parts))                                                  .also { itemCache += it }
    val EMITTER_COMPONENT = NTMItem("emitter_component", NTMProp(group = parts))                                                        .also { itemCache += it }
    val ALUMINIUM_CAP = NTMItem("aluminium_cap", NTMProp(group = parts))                                                                .also { itemCache += it }
    val SMALL_STEEL_SHELL = NTMItem("small_steel_shell", NTMProp(group = parts))                                                        .also { itemCache += it }
    val SMALL_ALUMINIUM_SHELL = NTMItem("small_aluminium_shell", NTMProp(group = parts))                                                .also { itemCache += it }
    val BIG_STEEL_SHELL = NTMItem("big_steel_shell", NTMProp(group = parts))                                                            .also { itemCache += it }
    val BIG_ALUMINIUM_SHELL = NTMItem("big_aluminium_shell", NTMProp(group = parts))                                                    .also { itemCache += it }
    val BIG_TITANIUM_SHELL = NTMItem("big_titanium_shell", NTMProp(group = parts))                                                      .also { itemCache += it }
    val FLAT_STEEL_CASING = NTMItem("flat_steel_casing", NTMProp(group = parts))                                                        .also { itemCache += it }
    val SMALL_STEEL_GRID_FINS = NTMItem("small_steel_grid_fins", NTMProp(group = parts))                                                .also { itemCache += it }
    val BIG_STEEL_GRID_FINS = NTMItem("big_steel_grid_fins", NTMProp(group = parts))                                                    .also { itemCache += it }
    val LARGE_STEEL_FINS = NTMItem("large_steel_fins", NTMProp(group = parts))                                                          .also { itemCache += it }
    val SMALL_TITANIUM_FINS = NTMItem("small_titanium_fins", NTMProp(group = parts))                                                    .also { itemCache += it }
    val STEEL_SPHERE = NTMItem("steel_sphere", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val STEEL_PEDESTAL = NTMItem("steel_pedestal", NTMProp(group = parts))                                                              .also { itemCache += it }
    val DYSFUNCTIONAL_NUCLEAR_REACTOR = NTMItem("dysfunctional_nuclear_reactor", NTMProp(group = parts))                                .also { itemCache += it }
    val LARGE_STEEL_ROTOR = NTMItem("large_steel_rotor", NTMProp(group = parts))                                                        .also { itemCache += it }
    val GENERATOR_BODY = NTMItem("generator_body", NTMProp(group = parts))                                                              .also { itemCache += it }
    val TITANIUM_BLADE = NTMItem("titanium_blade", NTMProp(group = parts))                                                              .also { itemCache += it }
    val TUNGSTEN_REINFORCED_BLADE = NTMItem("tungsten_reinforced_blade", NTMProp(group = parts))                                        .also { itemCache += it }
    val TITANIUM_STEAM_TURBINE = NTMItem("titanium_steam_turbine", NTMProp(group = parts))                                              .also { itemCache += it }
    val REINFORCED_TURBOFAN_BLADES = NTMItem("reinforced_turbofan_blades", NTMProp(group = parts))                                      .also { itemCache += it }
    val GENERATOR_FRONT = NTMItem("generator_front", NTMProp(group = parts))                                                            .also { itemCache += it }
    val TOOTHPICKS = NTMItem("toothpicks", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val DUCT_TAPE = NTMItem("duct_tape", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val CLAY_CATALYST = NTMItem("clay_catalyst", NTMProp(group = parts))                                                                .also { itemCache += it }
    val SMALL_MISSILE_ASSEMBLY = NTMItem("small_missile_assembly", NTMProp(group = parts))                                              .also { itemCache += it }
    // Warheads
    val SMALL_WARHEAD = NTMItem("small_warhead", NTMProp(group = parts))                                                                .also { itemCache += it }
    val MEDIUM_WARHEAD = NTMItem("medium_warhead", NTMProp(group = parts))                                                              .also { itemCache += it }
    val LARGE_WARHEAD = NTMItem("large_warhead", NTMProp(group = parts))                                                                .also { itemCache += it }
    val SMALL_INCENDIARY_WARHEAD = NTMItem("small_incendiary_warhead", NTMProp(group = parts))                                          .also { itemCache += it }
    val MEDIUM_INCENDIARY_WARHEAD = NTMItem("medium_incendiary_warhead", NTMProp(group = parts))                                        .also { itemCache += it }
    val LARGE_INCENDIARY_WARHEAD = NTMItem("large_incendiary_warhead", NTMProp(group = parts))                                          .also { itemCache += it }
    val SMALL_CLUSTER_WARHEAD = NTMItem("small_cluster_warhead", NTMProp(group = parts))                                                .also { itemCache += it }
    val MEDIUM_CLUSTER_WARHEAD = NTMItem("medium_cluster_warhead", NTMProp(group = parts))                                              .also { itemCache += it }
    val LARGE_CLUSTER_WARHEAD = NTMItem("large_cluster_warhead", NTMProp(group = parts))                                                .also { itemCache += it }
    val SMALL_BUNKER_BUSTER_WARHEAD = NTMItem("small_bunker_busting_warhead", NTMProp(group = parts))                                   .also { itemCache += it }
    val MEDIUM_BUNKER_BUSTER_WARHEAD = NTMItem("medium_bunker_busting_warhead", NTMProp(group = parts))                                 .also { itemCache += it }
    val LARGE_BUNKER_BUSTER_WARHEAD = NTMItem("large_bunker_busting_warhead", NTMProp(group = parts))                                   .also { itemCache += it }
    val NUCLEAR_WARHEAD = NTMItem("nuclear_warhead", NTMProp(group = parts))                                                            .also { itemCache += it }
    val THERMONUCLEAR_WARHEAD = NTMItem("thermonuclear_warhead", NTMProp(group = parts))                                                .also { itemCache += it }
    val ENDOTHERMIC_WARHEAD = NTMItem("endothermic_warhead", NTMProp(group = parts))                                                    .also { itemCache += it }
    val EXOTHERMIC_WARHEAD = NTMItem("exothermic_warhead", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Fuel Tanks
    val SMALL_FUEL_TANK = NTMItem("small_fuel_tank", NTMProp(group = parts))                                                            .also { itemCache += it }
    val MEDIUM_FUEL_TANK = NTMItem("medium_fuel_tank", NTMProp(group = parts))                                                          .also { itemCache += it }
    val LARGE_FUEL_TANK = NTMItem("large_fuel_tank", NTMProp(group = parts))                                                            .also { itemCache += it }
    // Thrusters
    val SMALL_THRUSTER = NTMItem("small_thruster", NTMProp(group = parts))                                                              .also { itemCache += it }
    val MEDIUM_THRUSTER = NTMItem("medium_thruster", NTMProp(group = parts))                                                            .also { itemCache += it }
    val LARGE_THRUSTER = NTMItem("large_thruster", NTMProp(group = parts))                                                              .also { itemCache += it }
    val LV_N_NUCLEAR_ROCKET_ENGINE = NTMItem("lv_n_nuclear_rocket_engine", NTMProp(group = parts))                                      .also { itemCache += it }
    // Satellite stuff
    val SATELLITE_BASE = NTMItem("satellite_base", NTMProp(group = parts))                                                              .also { itemCache += it }
    val HIGH_GAIN_OPTICAL_CAMERA = NTMItem("high_gain_optical_camera", NTMProp(group = parts))                                          .also { itemCache += it }
    val M700_SURVEY_SCANNER = NTMItem("m700_survey_scanner", NTMProp(group = parts))                                                    .also { itemCache += it }
    val RADAR_DISH = NTMItem("radar_dish", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val DEATH_RAY = NTMItem("death_ray", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val XENIUM_RESONATOR = NTMItem("xenium_resonator", NTMProp(group = parts))                                                          .also { itemCache += it }
    // Connectors
    val SIZE_10_CONNECTOR = NTMItem("size_10_connector", NTMProp(group = parts))                                                        .also { itemCache += it }
    val SIZE_15_CONNECTOR = NTMItem("size_15_connector", NTMProp(group = parts))                                                        .also { itemCache += it }
    val SIZE_20_CONNECTOR = NTMItem("size_20_connector", NTMProp(group = parts))                                                        .also { itemCache += it }
    // Chopper stuff
    val HUNTER_CHOPPER_COCKPIT = NTMItem("hunter_chopper_cockpit", NTMProp(group = parts))                                              .also { itemCache += it }
    val EMPLACEMENT_GUN = NTMItem("emplacement_gun", NTMProp(group = parts))                                                            .also { itemCache += it }
    val HUNTER_CHOPPER_BODY = NTMItem("hunter_chopper_body", NTMProp(group = parts))                                                    .also { itemCache += it }
    val HUNTER_CHOPPER_TAIL = NTMItem("hunter_chopper_tail", NTMProp(group = parts))                                                    .also { itemCache += it }
    val HUNTER_CHOPPER_WING = NTMItem("hunter_chopper_wing", NTMProp(group = parts))                                                    .also { itemCache += it }
    val HUNTER_CHOPPER_ROTOR_BLADES = NTMItem("hunter_chopper_rotor_blades", NTMProp(group = parts))                                    .also { itemCache += it }
    val COMBINE_STEEL_SCRAP_METAL = NTMItem("combine_steel_scrap_metal", NTMProp(group = parts))                                        .also { itemCache += it }
    // And more random stuff
    val HEAVY_HAMMER_HEAD = NTMItem("heavy_hammer_head", NTMProp(group = parts))                                                        .also { itemCache += it }
    val HEAVY_AXE_HEAD = NTMItem("heavy_axe_head", NTMProp(group = parts))                                                              .also { itemCache += it }
    val REINFORCED_POLYMER_HANDLE = NTMItem("reinforced_polymer_handle", NTMProp(group = parts))                                        .also { itemCache += it }
    // Circuits
    val BASIC_CIRCUIT_ASSEMBLY = NTMItem("basic_circuit_assembly", NTMProp(group = parts))                                              .also { itemCache += it }
    val BASIC_CIRCUIT = NTMItem("basic_circuit", NTMProp(group = parts))                                                                .also { itemCache += it }
    val ENHANCED_CIRCUIT = NTMItem("enhanced_circuit", NTMProp(group = parts))                                                          .also { itemCache += it }
    val ADVANCED_CIRCUIT = NTMItem("advanced_circuit", NTMProp(group = parts))                                                          .also { itemCache += it }
    val OVERCLOCKED_CIRCUIT = NTMItem("overclocked_circuit", NTMProp(group = parts))                                                    .also { itemCache += it }
    val HIGH_PERFORMANCE_CIRCUIT = NTMItem("high_performance_circuit", NTMProp(group = parts, rarity = Rarity.RARE))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_1 = NTMItem("military_grade_circuit_board_tier_1", NTMProp(group = parts))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_2 = NTMItem("military_grade_circuit_board_tier_2", NTMProp(group = parts))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_3 = NTMItem("military_grade_circuit_board_tier_3", NTMProp(group = parts))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_4 = NTMItem("military_grade_circuit_board_tier_4", NTMProp(group = parts))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_5 = NTMItem("military_grade_circuit_board_tier_5", NTMProp(group = parts))                    .also { itemCache += it }
    val MILITARY_GRADE_CIRCUIT_BOARD_TIER_6 = NTMItem("military_grade_circuit_board_tier_6", NTMProp(group = parts))                    .also { itemCache += it }
    // Weapon mechanisms
    val REVOLVER_MECHANISM = NTMItem("revolver_mechanism", NTMProp(group = parts))                                                      .also { itemCache += it }
    val ADVANCED_REVOLVER_MECHANISM = NTMItem("advanced_revolver_mechanism", NTMProp(group = parts))                                    .also { itemCache += it }
    val RIFLE_MECHANISM = NTMItem("rifle_mechanism", NTMProp(group = parts))                                                            .also { itemCache += it }
    val ADVANCED_RIFLE_MECHANISM = NTMItem("advanced_rifle_mechanism", NTMProp(group = parts))                                          .also { itemCache += it }
    val LAUNCHER_MECHANISM = NTMItem("launcher_mechanism", NTMProp(group = parts))                                                      .also { itemCache += it }
    val ADVANCED_LAUNCHER_MECHANISM = NTMItem("advanced_launcher_mechanism", NTMProp(group = parts))                                    .also { itemCache += it }
    val HIGH_TECH_WEAPON_MECHANISM = NTMItem("high_tech_weapon_mechanism", NTMProp(group = parts))                                      .also { itemCache += it }
    // Bullet Primers
    val POINT_357_MAGNUM_PRIMER = NTMItem("point_357_magnum_primer", NTMProp(group = parts))                                            .also { itemCache += it }
    val POINT_44_MAGNUM_PRIMER = NTMItem("point_44_magnum_primer", NTMProp(group = parts))                                              .also { itemCache += it }
    val SMALL_CALIBER_PRIMER = NTMItem("small_caliber_primer", NTMProp(group = parts))                                                  .also { itemCache += it }
    val LARGE_CALIBER_PRIMER = NTMItem("large_caliber_primer", NTMProp(group = parts))                                                  .also { itemCache += it }
    val BUCKSHOT_PRIMER = NTMItem("buckshot_primer", NTMProp(group = parts))                                                            .also { itemCache += it }
    // Bullet casings
    val POINT_357_MAGNUM_CASING = NTMItem("point_357_magnum_casing", NTMProp(group = parts))                                            .also { itemCache += it }
    val POINT_44_MAGNUM_CASING = NTMItem("point_44_magnum_casing", NTMProp(group = parts))                                              .also { itemCache += it }
    val SMALL_CALIBER_CASING = NTMItem("small_caliber_casing", NTMProp(group = parts))                                                  .also { itemCache += it }
    val LARGE_CALIBER_CASING = NTMItem("large_caliber_casing", NTMProp(group = parts))                                                  .also { itemCache += it }
    val BUCKSHOT_CASING = NTMItem("buckshot_casing", NTMProp(group = parts))                                                            .also { itemCache += it }
    // Bullet assemblies
    val IRON_BULLET_ASSEMBLY = NTMItem("iron_bullet_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val LEAD_BULLET_ASSEMBLY = NTMItem("lead_bullet_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val GLASS_BULLET_ASSEMBLY = NTMItem("glass_bullet_assembly", NTMProp(group = parts))                                                .also { itemCache += it }
    val GOLD_BULLET_ASSEMBLY = NTMItem("gold_bullet_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val SCHRABIDIUM_BULLET_ASSEMBLY = NTMItem("schrabidium_bullet_assembly", NTMProp(group = parts))                                    .also { itemCache += it }
    val NIGHTMARE_BULLET_ASSEMBLY = NTMItem("nightmare_bullet_assembly", NTMProp(group = parts))                                        .also { itemCache += it }
    val DESH_BULLET_ASSEMBLY = NTMItem("desh_bullet_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val POINT_44_MAGNUM_ASSEMBLY = NTMItem("point_44_magnum_assembly", NTMProp(group = parts))                                          .also { itemCache += it }
    val NINE_MM_ASSEMBLY = NTMItem("9_mm_assembly", NTMProp(group = parts))                                                             .also { itemCache += it }
    val POINT_22_LR_ASSEMBLY = NTMItem("point_22_lr_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val POINT_5_MM_ASSEMBLY = NTMItem("point_5_mm_assembly", NTMProp(group = parts))                                                    .also { itemCache += it }
    val POINT_50_AE_ASSEMBLY = NTMItem("point_50_ae_assembly", NTMProp(group = parts))                                                  .also { itemCache += it }
    val POINT_50_BMG_ASSEMBLY = NTMItem("point_50_bmg_assembly", NTMProp(group = parts))                                                .also { itemCache += it }
    // Folly bullet casings and parts
    val SILVER_BULLET_CASING = NTMItem("silver_bullet_casing", NTMProp(group = parts))                                                  .also { itemCache += it }
    val TWELVE_POINT_8_CM_STARMETAL_HIGH_ENERGY_SHELL = NTMItem("12_point_8_cm_starmetal_high_energy_shell", NTMProp(group = parts))    .also { itemCache += it }
    val TWELVE_POINT_8_CM_NUCLEAR_SHELL = NTMItem("12_point_8_cm_nuclear_shell", NTMProp(group = parts))                                .also { itemCache += it }
    val TWELVE_POINT_8_CM_DU_SHELL = NTMItem("12_point_8_cm_du_shell", NTMProp(group = parts))                                          .also { itemCache += it }
    // More random
    val CABLE_DRUM = NTMItem("cable_drum", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val PAINTING_OF_A_CARTOON_PONY = NTMItem("painting_of_a_cartoon_pony", NTMProp(group = parts))                                      .also { itemCache += it }
    val CONSPIRACY_THEORY = NTMItem("conspiracy_theory", NTMProp(group = parts))                                                        .also { itemCache += it }
    val POLITICAL_TOPIC = NTMItem("political_topic", NTMProp(group = parts))                                                            .also { itemCache += it }
    val OWN_OPINION = NTMItem("own_opinion", NTMProp(group = parts))                                                                    .also { itemCache += it }
    val EXPLOSIVE_PELLETS = NTMItem("explosive_pellets", NTMProp(group = parts))                                                        .also { itemCache += it }
    val LEAD_PELLETS = NTMItem("lead_pellets", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val FLECHETTES = NTMItem("flechettes", NTMProp(group = parts))                                                                      .also { itemCache += it }
    val POISON_GAS_CARTRIDGE = NTMItem("poison_gas_cartridge", NTMProp(group = parts))                                                  .also { itemCache += it }
    val MAGNETRON = NTMItem("magnetron", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val DENSE_COAL_CLUSTER = NTMItem("dense_coal_cluster", NTMProp(group = parts))                                                      .also { itemCache += it }
    val MACHINE_UPGRADE_PIECE_TEMPLATE = NTMItem("machine_upgrade_piece_template", NTMProp(group = parts, maxStackSize = 1))            .also { itemCache += it }
    // Catalyst matrices
    val BLANK_CATALYST_MATRIX = NTMItem("blank_catalyst_matrix", NTMProp(group = parts, maxStackSize = 1))                              .also { itemCache += it }
    val COOL_CATALYST_MATRIX = NTMItem("cool_catalyst_matrix", NTMProp(group = parts, glint = true, maxStackSize = 1))                  .also { itemCache += it }
    val BALANCED_CATALYST_MATRIX = NTMItem("balanced_catalyst_matrix", NTMProp(group = parts, glint = true, maxStackSize = 1))          .also { itemCache += it }
    val ROUGH_CATALYST_MATRIX = NTMItem("rough_catalyst_matrix", NTMProp(group = parts, glint = true, maxStackSize = 1))                .also { itemCache += it }
    val MULTIPLICATIVE_CATALYST_MATRIX = NTMItem("multiplicative_catalyst_matrix", NTMProp(group = parts, glint = true, maxStackSize = 1)).also { itemCache += it }
    val ADDITIVE_CATALYST_MATRIX = NTMItem("additive_catalyst_matrix", NTMProp(group = parts, glint = true, maxStackSize = 1))          .also { itemCache += it }
    // ???
    val BURNED_OUT_QUAD_SCHRABIDIUM_FUEL_ROD = NTMItem("burned_out_quad_schrabidium_fuel_rod", NTMProp(group = parts, rarity = Rarity.EPIC, maxStackSize = 1)).also { itemCache += it }
    // Waste
    val SCRAP = NTMItem("scrap", NTMProp(group = parts))                                                                                .also { itemCache += it }
    val DEPLETED_URANIUM_FUEL_HOT = NTMItem("depleted_uranium_fuel_hot", NTMProp(group = parts))                                        .also { itemCache += it }
    val DEPLETED_THORIUM_FUEL_HOT = NTMItem("depleted_thorium_fuel_hot", NTMProp(group = parts))                                        .also { itemCache += it }
    val DEPLETED_PLUTONIUM_FUEL_HOT = NTMItem("depleted_plutonium_fuel_hot", NTMProp(group = parts))                                    .also { itemCache += it }
    val DEPLETED_MOX_FUEL_HOT = NTMItem("depleted_mox_fuel_hot", NTMProp(group = parts))                                                .also { itemCache += it }
    val DEPLETED_SCHRABIDIUM_FUEL_HOT = NTMItem("depleted_schrabidium_fuel_hot", NTMProp(group = parts))                                .also { itemCache += it }
    val DEPLETED_URANIUM_FUEL = NTMItem("depleted_uranium_fuel", NTMProp(group = parts))                                                .also { itemCache += it }
    val DEPLETED_THORIUM_FUEL = NTMItem("depleted_thorium_fuel", NTMProp(group = parts))                                                .also { itemCache += it }
    val DEPLETED_PLUTONIUM_FUEL = NTMItem("depleted_plutonium_fuel", NTMProp(group = parts))                                            .also { itemCache += it }
    val DEPLETED_MOX_FUEL = NTMItem("depleted_mox_fuel", NTMProp(group = parts))                                                        .also { itemCache += it }
    val DEPLETED_SCHRABIDIUM_FUEL = NTMItem("depleted_schrabidium_fuel", NTMProp(group = parts))                                        .also { itemCache += it }
    val TRINITITE = NTMItem("trinitite", NTMProp(group = parts))                                                                        .also { itemCache += it }
    val NUCLEAR_WASTE = NTMItem("nuclear_waste", NTMProp(group = parts))                                                                .also { itemCache += it }
    val TINY_NUCLEAR_WASTE = NTMItem("tiny_nuclear_waste", NTMProp(group = parts))                                                      .also { itemCache += it }
    // Crystals
    val CRYSTAL_HORN = NTMItem("crystal_horn", NTMProp(group = parts))                                                                  .also { itemCache += it }
    val CHARRED_CRYSTAL = NTMItem("charred_crystal", NTMProp(group = parts))                                                            .also { itemCache += it }

    @SubscribeEvent
    @JvmStatic
    fun registerItems(event: Register<Item>) {
        NTM.logger.debug("Registering items...")

        event.registry.registerAll(*itemCache.toTypedArray())
        itemCache.removeAll { true }
        ModBlocks.blocks.forEach {
            val block = ForgeRegistries.BLOCKS.getValue(ResourceLocation(MODID, it)) as CustomizedBlock?
            if (block?.blockItem != null) event.registry.register(block.blockItem)
        }

        NTM.logger.debug("Items registered")
    }
}
