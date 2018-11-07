package me.calebbassham.scenariomanager.scenario;

import me.calebbassham.scenariomanager.api.ScenarioManagerInstance;
import org.bukkit.plugin.java.JavaPlugin;

public class ScenarioPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ScenarioManagerInstance.getScenarioManager().register(new Scenario(), this);
    }
}
