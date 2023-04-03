package io.github.fakeneko.auto_fish_fake.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import io.github.fakeneko.auto_fish_fake.FabricModAutofish;
import io.github.fakeneko.auto_fish_fake.gui.AutofishScreenBuilder;

public class ModMenuApiAutofish implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutofishScreenBuilder.buildScreen(FabricModAutofish.getInstance(), parent);
    }
}
