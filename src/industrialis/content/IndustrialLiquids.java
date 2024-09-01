package industrialis.content;

import arc.graphics.Color;
import mindustry.type.Liquid;
import mindustry.world.Block;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.world.meta.*;

public class IndustrialLiquids {
    public static Liquid 
    heaterFluid, hyperCoolant, 
    moltenCopper, moltenGold, 
    moltenIron, moltenLead, 
    moltenScrappedMetal, moltenTin;

    public static void load() {
        heaterFluid = new Liquid("heater-fluid") {{
            temperature= 1;
            viscosity = 0.1f;
            color = IndustrialPal.skyRed;
            lightColor = IndustrialPal.skyRed;
            barColor = IndustrialPal.skyRed;
            effect = melting;
        }};

        hyperCoolant = new Liquid("hyper-coolant") {{
            temperature= 0;
            viscosity = 0.1f;
            color = Color.valueOf("53ff9c");
            lightColor = Color.valueOf("7effb5");
            barColor = Color.valueOf("53ff9c");
            effect = freezing;
        }};

        moltenCopper = new Liquid("molten-copper") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("e17416");
            lightColor = Color.valueOf("e17416");
            barColor = Color.valueOf("e17416");
            effect = melting;
        }};

        moltenGold = new Liquid("molten-gold") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("ffae11");
            lightColor = Color.valueOf("ffae11");
            barColor = Color.valueOf("ffae11");
            effect = melting;
        }};

        moltenIron = new Liquid("molten-iron") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("ff2d00");
            lightColor = Color.valueOf("ff2d00");
            barColor = Color.valueOf("ff2d00");
            effect = melting;
        }};

        moltenLead = new Liquid("molten-lead") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("7349b0");
            lightColor = Color.valueOf("7349b0");
            barColor = Color.valueOf("7349b0");
            effect = melting;
        }};

        moltenScrappedMetal = new Liquid("molten-scrapped-metal") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("090909");
            lightColor = Color.valueOf("090909");
            barColor = Color.valueOf("090909");
            effect = melting;
        }};

        moltenTin = new Liquid("molten-tin") {{
            temperature= 1;
            viscosity = 0.8f;
            color = Color.valueOf("969696");
            lightColor = Color.valueOf("969696");
            barColor = Color.valueOf("969696");
            effect = melting;
        }};
    }
}
