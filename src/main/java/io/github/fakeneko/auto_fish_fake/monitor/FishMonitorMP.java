package io.github.fakeneko.auto_fish_fake.monitor;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.network.Packet;
import io.github.fakeneko.auto_fish_fake.AutoFishFakeneko;

public interface FishMonitorMP {

    void hookTick(AutoFishFakeneko autofish, MinecraftClient minecraft, FishingBobberEntity hook);

    void handleHookRemoved();

    void handlePacket(AutoFishFakeneko autofish, Packet<?> packet, MinecraftClient minecraft);

}