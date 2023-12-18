package displays;

public class AccSpecs {
    public static String[] getSpecs(String selectedAccessory, int index) {
        if ("Helmet".equals(selectedAccessory)) {
            // Helmet specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: HighGuard Helmet",
                            "Type: Half-face",
                            "Size: Medium",
                            "Material: Carbon Fiber",
                            "Weight: 1.1 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: AeroLite Helmet",
                            "Type: Half-face",
                            "Size: Large",
                            "Material: Fiberglass",
                            "Weight: 0.9 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: CustomFit Helmet",
                            "Type: Half-face",
                            "Size: Adjustable",
                            "Material: Composite blend",
                            "Weight: 1.0 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Locks".equals(selectedAccessory)) {
            // Lock specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UltraGuard U-Lock",
                            "Type: U-lock",
                            "Size: 8 inches",
                            "Material: Hardened steel",
                            "Weight: 1.4 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: FlexCable Lock",
                            "Type: Cable lock",
                            "Size: 5 feet",
                            "Material: Braided steel",
                            "Weight: 0.6 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: ArmorLink Chain Lock",
                            "Type: Chain lock",
                            "Size: 3 feet",
                            "Material: Reinforced steel links",
                            "Weight: 1.8 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Side Mirrors".equals(selectedAccessory)) {
            // Side Mirrors specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: VistaView Mirrors",
                            "Type: Adjustable",
                            "Material: Shatterproof plastic",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: AeroGaze Mirrors",
                            "Type: Aerodynamic",
                            "Material: Aluminum alloy",
                            "Weight: 0.3 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: FlexView Mirrors",
                            "Type: Flexible Arm",
                            "Material: ABS plastic",
                            "Weight: 0.15 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Bicycle Light".equals(selectedAccessory)) {
            // Bicycle Light specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: BlazeBeam Front Light",
                            "Type: LED",
                            "Brightness: 1000 lumens",
                            "Power Source: Rechargeable battery",
                            "Weight: 0.15 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: NightGlow Rear Light",
                            "Type: Rear LED",
                            "Brightness: 600 lumens",
                            "Power Source: AAA batteries",
                            "Weight: 0.12 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SolarRay Commuter Light",
                            "Type: Solar-powered",
                            "Brightness: 800 lumens",
                            "Power Source: Solar rechargeable",
                            "Weight: 0.18 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Fenders".equals(selectedAccessory)) {
            // Fenders specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: MudGuard Pro",
                            "Type: Full coverage",
                            "Material: Polypropylene",
                            "Weight: 0.4 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SplashGuard Lite",
                            "Type: Quick-release",
                            "Material: PVC",
                            "Weight: 0.3 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UrbanFlex Fenders",
                            "Type: Flexible and Lightweight",
                            "Material: Composite material",
                            "Weight: 0.35 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Kickstands".equals(selectedAccessory)) {
            // Kickstands specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: StableStand",
                            "Type: Adjustable",
                            "Material: Aluminum alloy",
                            "Weight: 0.5 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EasyLean Kickstand",
                            "Type: Single-leg",
                            "Material: Steel",
                            "Weight: 0.4 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: QuickPark Kickstand",
                            "Type: Spring-loaded",
                            "Material: Stainless steel",
                            "Weight: 0.45 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Phone mounts".equals(selectedAccessory)) {
            // Phone mounts specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: GripTech Phone Mount",
                            "Compatibility: Universal",
                            "Rotation: 360 degrees",
                            "Material: ABS plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SecureHold Bike Mount",
                            "Compatibility: iPhone/Android",
                            "Rotation: 180 degrees",
                            "Material: Silicone",
                            "Weight: 0.08 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: QuickSnap Phone Holder",
                            "Rotation: 270 degrees",
                            "Material: Rubberized plastic",
                            "Weight: 0.12 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Speedometers".equals(selectedAccessory)) {
            // Speedometers specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SpeedMaster Pro",
                            "Display Type: Digital",
                            "Functions: Speed, Distance, Time",
                            "Material: Plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: AeroDash Wireless",
                            "Display Type: Wireless",
                            "Functions: Speed, Cadence, Heart Rate",
                            "Material: Aluminum",
                            "Weight: 0.12 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UrbanRider Speed Tracker",
                            "Display Type: Bluetooth-enabled",
                            "Functions: Speed, Average Speed, Calories Burned",
                            "Material: Composite material",
                            "Weight: 0.15 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Repair kits".equals(selectedAccessory)) {
            // Repair kits specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: QuickFix Patch Kit",
                            "Contents: Patches, Glue, Tire Levers",
                            "Material: Rubber, Plastic",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: MultiTool Master",
                            "Functions: 16-in-1",
                            "Material: Stainless steel",
                            "Weight: 0.15 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Tubeless Tire Repair Kit",
                            "Contents: Repair plugs, Reamer, Plug installer",
                            "Material: Nylon, Metal",
                            "Weight: 0.18 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        }

        return new String[]{"UNABLE TO FIND SPECIFICATION"};
    }
}
