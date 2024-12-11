package industrialis.content;

import industrialis.content.blocks.*;

public class IndustrialBlocks {
    public static void load() {
        IndustrialFluidTransport.load();
        IndustrialLogic.load();
        IndustrialTransport.load();
        IndustrialProduction.load();
        IndustrialExtractors.load();
        IndustrialAssembly.load();
        IndustrialSupport.load();
        IndustrialDefence.load();
        IndustrialPower.load();
    }
}