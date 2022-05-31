package com.codeetoasty.colwater.ModUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.fabricmc.loader.api.FabricLoader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.codeetoasty.colwater.ColoredWater.MOD_ID;

public class ConfigUtils {
    public static final String CONFIG = FabricLoader.getInstance().getConfigDir()+"/fluidlogged.json";
    public static final List<String> fluidList =
            List.of("black","brown","cyan","gray","green","light_blue","lime","magenta","orange",
                    "pink","purple","red","white","yellow");
    public static void fluidLogLiquids(){
        if(FabricLoader.getInstance().isModLoaded("fluidlogged")) {
            try(FileReader reader = new FileReader(CONFIG)) {
                JsonObject file = (JsonObject) JsonParser.parseReader(reader);
                JsonArray fluids = file.get("fluids").getAsJsonArray();
                if(!checkFluids(fluids)){
                    for(String s : fluidList){
                        fluids.add(MOD_ID+":"+s);
                    }
                    for(String s : fluidList){
                        fluids.add(MOD_ID+":glow_"+s);
                    }

                    JsonObject new_file = new JsonObject();
                    new_file.addProperty("compatibilityMode",false);
                    new_file.add("fluids",fluids);
                    new_file.addProperty("printFluidIds",false);

                    FileWriter output = new FileWriter(CONFIG);
                    output.write(new_file.toString());
                    output.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean checkFluids(JsonArray fluids){
        for(JsonElement fluid : fluids){
            if(fluid.getAsString().contains(MOD_ID)){
                return true;
            }
        }
        return false;
    }
}
