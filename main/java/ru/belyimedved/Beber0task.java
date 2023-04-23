package ru.belyimedved;

import org.bukkit.plugin.java.JavaPlugin;

public final class Beber0task extends JavaPlugin {

    @Override
    public void onEnable() {
        getMultiplesNumber(12);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void getMultiplesNumber(int number){
        String numbers = "";
        int summ = 0;
        for(int i = 0; i <= number; i++) {
            if ((i % 2) == 0) {
                numbers += i + ",";
                summ+=i;
            }
        }
        numbers += ";" + summ;
        System.out.println(numbers);
    }

}
