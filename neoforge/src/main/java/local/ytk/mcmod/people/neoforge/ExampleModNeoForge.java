package local.ytk.mcmod.people.neoforge;

import net.neoforged.fml.common.Mod;

import local.ytk.mcmod.people.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
