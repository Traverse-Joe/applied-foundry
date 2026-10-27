package com.traverse.appliedforge;

import com.mojang.logging.LogUtils;
import com.traverse.appliedforge.compat.ModCompat;
import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AppliedForge.MODID)
public final class AppliedForge {
    public static final String MODID = "appliedforge";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AppliedForge(IEventBus modEventBus, Dist dist) {
        ModCompat.init(modEventBus, dist);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}
