package com.traverse.appliedforge.compat;

import com.traverse.appliedforge.AppliedForge;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;

public final class ModCompat {
    public static final String HEPHAESTUS_FORGE = "hephaestus";
    public static final String PRODUCTIVE_METALWORKS = "productivemetalworks";
    public static final String JEI = "jei";
    public static final String JADE = "jade";
    public static final String CURIOS = "curios";

    private static boolean hephaestusForgeLoaded;
    private static boolean productiveMetalworksLoaded;
    private static boolean curiosLoaded;

    private ModCompat() {}

    public static void init(IEventBus modEventBus, Dist dist) {
        ModList mods = ModList.get();
        hephaestusForgeLoaded = mods.isLoaded(HEPHAESTUS_FORGE);
        productiveMetalworksLoaded = mods.isLoaded(PRODUCTIVE_METALWORKS);
        curiosLoaded = mods.isLoaded(CURIOS);

        AppliedForge.LOGGER.info("Applied Forge compat: Hephaestus Forge={}, Productive Metalworks={}, JEI={}, Jade={}, Curios={}",
                hephaestusForgeLoaded, productiveMetalworksLoaded, mods.isLoaded(JEI), mods.isLoaded(JADE), curiosLoaded);
    }

    public static boolean hephaestusForgeLoaded() { return hephaestusForgeLoaded; }

    public static boolean productiveMetalworksLoaded() { return productiveMetalworksLoaded; }

    public static boolean curiosLoaded() { return curiosLoaded; }
}
