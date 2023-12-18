package displays;

public class PartSpecs {
    public static String[] getSpecs(String selectedPart, int index) {
        if ("Rims".equals(selectedPart)) {
            // Rim specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Performance Rim 5000",
                            "Diameter: 26 Inches",
                            "Material: Alloy",
                            "Color: Black",
                            "Spoke Count: 32",
                            "Weight: 1.5 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: AeroLite Rim",
                            "Diameter: 24 Inches",
                            "Material: Aluminum",
                            "Color: Silver",
                            "Spoke Count: 28",
                            "Weight: 1.2 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: CarbonSpeed Rim",
                            "Diameter: 27.5 Inches",
                            "Material: Carbon Fiber",
                            "Color: Red",
                            "Spoke Count: 30",
                            "Weight: 1.3 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UrbanGlide Rim",
                            "Diameter: 700c",
                            "Material: Steel",
                            "Color: Blue",
                            "Spoke Count: 36",
                            "Weight: 1.8 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Batteries".equals(selectedPart)) {
            // Battery specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: PowerMax Battery",
                            "Capacity: 10 Ah",
                            "Voltage: 36V",
                            "Chemistry: Lithium-ion",
                            "Weight: 2.5 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: MegaCharge Battery",
                            "Capacity: 15 Ah",
                            "Voltage: 48V",
                            "Chemistry: Lithium-polymer",
                            "Weight: 3.0 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TurboCell Battery",
                            "Capacity: 20 Ah",
                            "Voltage: 52V",
                            "Chemistry: LiFePO4",
                            "Weight: 3.8 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoPower Battery",
                            "Capacity: 12 Ah",
                            "Voltage: 24V",
                            "Chemistry: Nickel-metal hydride",
                            "Weight: 2.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Charger".equals(selectedPart)) {
            // Charger specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SwiftCharge Charger",
                            "Output Voltage: 42V",
                            "Output Current: 2A",
                            "Charging Time: 5 hours",
                            "Weight: 0.5 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: RapidJuice Charger",
                            "Output Voltage: 54V",
                            "Output Current: 3A",
                            "Charging Time: 4 hours",
                            "Weight: 0.8 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TurboBoost Charger",
                            "Output Voltage: 48V",
                            "Output Current: 5A",
                            "Charging Time: 3 hours",
                            "Weight: 1.0 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoCharge Charger",
                            "Output Voltage: 36V",
                            "Output Current: 1.5A",
                            "Charging Time: 6 hours",
                            "Weight: 0.4 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Tires".equals(selectedPart)) {
            // Tires specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TrailBlazer Tire",
                            "Size: 26 x 2.1 inches",
                            "Type: Mountain bike",
                            "Tread Pattern: Knobby",
                            "Weight: 0.9 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: RoadMaster Tire",
                            "Size: 700 x 25c",
                            "Type: Road bike",
                            "Tread Pattern: Slick",
                            "Weight: 0.6 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoGrip Tire",
                            "Size: 27.5 x 2.0 inches",
                            "Type: Hybrid",
                            "Tread Pattern: All-terrain",
                            "Weight: 0.8 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UrbanSpeed Tire",
                            "Size: 28 x 1.5 inches",
                            "Type: City bike",
                            "Tread Pattern: Smooth",
                            "Weight: 0.7 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Controllers".equals(selectedPart)) {
            // Controller specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: PowerDrive Controller",
                            "Voltage: 36V",
                            "Current: 20A",
                            "Compatibility: Brushless DC motors",
                            "Weight: 0.7 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SpeedBoost Controller",
                            "Voltage: 48V",
                            "Current: 30A",
                            "Compatibility: Brushless DC motors",
                            "Weight: 1.0 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TurboMax Controller",
                            "Voltage: 52V",
                            "Current: 40A",
                            "Compatibility: High-performance motors",
                            "Weight: 1.2 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoDrive Controller",
                            "Voltage: 24V",
                            "Current: 15A",
                            "Compatibility: Low-power motors",
                            "Weight: 0.5 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Connectors".equals(selectedPart)) {
            // Connector specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: PowerLink Connector",
                            "Type: Anderson Powerpole",
                            "Current Rating: 30A",
                            "Voltage Rating: 600V",
                            "Material: Polycarbonate",
                            "Weight: 0.05 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SpeedConnect Connector",
                            "Type: XT60",
                            "Current Rating: 60A",
                            "Voltage Rating: 500V",
                            "Material: Nylon",
                            "Weight: 0.02 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: QuickLink Connector",
                            "Type: EC3",
                            "Current Rating: 40A",
                            "Voltage Rating: 700V",
                            "Material: ABS plastic",
                            "Weight: 0.03 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoPlug Connector",
                            "Type: Banana Plug",
                            "Current Rating: 20A",
                            "Voltage Rating: 300V",
                            "Material: PVC",
                            "Weight: 0.01 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Cycle Analysts".equals(selectedPart)) {
            // Cycle Analyst specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: IntelliMeter CA-1",
                            "Functions: Speedometer, Odometer, Battery monitor",
                            "Display Type: LCD",
                            "Compatibility: Electric bikes",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SmartStats CA-2",
                            "Functions: Power meter, Voltage display, Temperature monitor",
                            "Display Type: OLED",
                            "Compatibility: Electric scooters",
                            "Weight: 0.2 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoMetrics CA-3",
                            "Functions: Efficiency analysis, Trip timer, Health tracker",
                            "Display Type: TFT",
                            "Compatibility: Electric skateboards",
                            "Weight: 0.25 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: PowerProbe CA-4",
                            "Functions: Current sensing, Voltage logging, Regenerative braking",
                            "Display Type: LED",
                            "Compatibility: Electric unicycles",
                            "Weight: 0.22 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("DC-DC Converters".equals(selectedPart)) {
            // DC-DC Converter specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Electric Pulse Dynamo",
                            "Input Voltage: 48V",
                            "Output Voltage: 12V",
                            "Output Current: 10A",
                            "Efficiency: 90%",
                            "Weight: 0.4 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Power Surge Converter",
                            "Input Voltage: 36V",
                            "Output Voltage: 24V",
                            "Output Current: 5A",
                            "Efficiency: 85%",
                            "Weight: 0.3 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: VoltMaster Pro",
                            "Input Voltage: 24V",
                            "Output Voltage: 12V",
                            "Output Current: 8A",
                            "Efficiency: 88%",
                            "Weight: 0.35 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Quantum Charge Regulator",
                            "Input Voltage: 48V",
                            "Output Voltage: 36V",
                            "Output Current: 7A",
                            "Efficiency: 92%",
                            "Weight: 0.5 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Ebrakes".equals(selectedPart)) {
            // Ebrakes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SwiftBrake Disc Master",
                            "Type: Disc brake",
                            "Compatibility: Front and rear",
                            "Material: Aluminum alloy",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: Velocity V-Brake Elite",
                            "Type: V-brake",
                            "Compatibility: Front",
                            "Material: Steel",
                            "Weight: 0.2 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: HydraFlex Hydraulic Brake",
                            "Type: Hydraulic brake",
                            "Compatibility: Rear",
                            "Material: Carbon fiber",
                            "Weight: 0.25 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: MechForce Mechanical Brake",
                            "Type: Mechanical brake",
                            "Compatibility: Front and rear",
                            "Material: Stainless steel",
                            "Weight: 0.22 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        }  else if ("Freewheels and Cassettes".equals(selectedPart)) {
            // Freewheels and Cassettes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SwiftSpin 7-Speed Freewheel",
                            "Type: 7-speed",
                            "Compatibility: Shimano and SRAM",
                            "Material: Steel",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SoloSprint Single-Speed Cassette",
                            "Type: Single-speed",
                            "Compatibility: Fixed gear",
                            "Material: Aluminum",
                            "Weight: 0.2 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TurboTwist 9-Speed Cassette",
                            "Type: 9-speed",
                            "Compatibility: Campagnolo",
                            "Material: Titanium",
                            "Weight: 0.25 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: FreeWheelFlow Fixed Gear",
                            "Type: Fixed gear",
                            "Compatibility: Track bikes",
                            "Material: Steel",
                            "Weight: 0.18 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Lights".equals(selectedPart)) {
            // Lights specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: LumaBeam 800 Front Light",
                            "Type: Front LED light",
                            "Brightness: 800 lumens",
                            "Power Source: Rechargeable battery",
                            "Weight: 0.15 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: NightGlow 500 Rear Light",
                            "Type: Rear LED light",
                            "Brightness: 500 lumens",
                            "Power Source: AAA batteries",
                            "Weight: 0.1 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: LaserLance Bike Tail Light",
                            "Type: Bike laser tail light",
                            "Brightness: 100 lumens",
                            "Power Source: USB rechargeable",
                            "Weight: 0.12 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: FlashFury Handlebar Light",
                            "Type: Handlebar-mounted flashlight",
                            "Brightness: 1200 lumens",
                            "Power Source: 18650 battery",
                            "Weight: 0.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        
        } else if ("Hub Motors".equals(selectedPart)) {
            // Hub Motors specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: PowerPulse 250W Hub Motor",
                            "Power: 250W",
                            "Voltage: 36V",
                            "Wheel Size: 26 Inches",
                            "Weight: 3.0 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TurboThrust 500W Hub Motor",
                            "Power: 500W",
                            "Voltage: 48V",
                            "Wheel Size: 700c",
                            "Weight: 3.5 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: VelocityVibe 750W Hub Motor",
                            "Power: 750W",
                            "Voltage: 48V",
                            "Wheel Size: 20 Inches",
                            "Weight: 4.0 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: MegaMomentum 1000W Hub Motor",
                            "Power: 1000W",
                            "Voltage: 72V",
                            "Wheel Size: 29 Inches",
                            "Weight: 5.0 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Solar".equals(selectedPart)) {
            // Solar specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SunSprint 20W Solar Panel",
                            "Power: 20W",
                            "Voltage: 12V",
                            "Material: Monocrystalline silicon",
                            "Weight: 1.0 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SolarFlare 30W Solar Panel",
                            "Power: 30W",
                            "Voltage: 24V",
                            "Material: Polycrystalline silicon",
                            "Weight: 1.5 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: EcoEnergy 50W Solar Panel",
                            "Power: 50W",
                            "Voltage: 18V",
                            "Material: Amorphous silicon",
                            "Weight: 2.0 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SolarBlast 100W Solar Panel",
                            "Power: 100W",
                            "Voltage: 36V",
                            "Material: CIGS thin-film",
                            "Weight: 1.8 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        
        } else if ("Spokes".equals(selectedPart)) {
            // Spokes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SteelSymphony Spokes Set",
                            "Material: Stainless steel",
                            "Length: 290mm",
                            "Quantity: 36 spokes",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: AeroAlloy Spokes Set",
                            "Material: Aluminum",
                            "Length: 275mm",
                            "Quantity: 32 spokes",
                            "Weight: 0.1 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: CarbonCharm Spokes Set",
                            "Material: Carbon fiber",
                            "Length: 280mm",
                            "Quantity: 40 spokes",
                            "Weight: 0.15 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: ChromoChic Spokes Set",
                            "Material: Chromoly steel",
                            "Length: 265mm",
                            "Quantity: 28 spokes",
                            "Weight: 0.14 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Throttles".equals(selectedPart)) {
            // Throttles specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: TwistTraverse Throttle",
                            "Type: Twist grip",
                            "Compatibility: Electric bikes",
                            "Material: Plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: ThumbThunder Throttle",
                            "Type: Thumb lever",
                            "Compatibility: Electric scooters",
                            "Material: Rubber",
                            "Weight: 0.05 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: DigitDrive Throttle",
                            "Type: Finger trigger",
                            "Compatibility: Electric skateboards",
                            "Material: ABS plastic",
                            "Weight: 0.08 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: GripGlide Throttle",
                            "Type: Hand grip",
                            "Compatibility: ATV and dirt bikes",
                            "Material: Rubberized plastic",
                            "Weight: 0.12 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Torque Arms".equals(selectedPart)) {
            // Torque Arms specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: UniForce Torque Arm",
                            "Type: Universal",
                            "Material: Steel",
                            "Compatibility: Front and rear wheels",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: SoloShield Torque Arm",
                            "Type: Single-sided",
                            "Material: Aluminum",
                            "Compatibility: Rear wheel",
                            "Weight: 0.15 kg"
                    };
                case 2:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: OffsetOmnis Torque Arm",
                            "Type: Offset design",
                            "Material: Stainless steel",
                            "Compatibility: Front wheel",
                            "Weight: 0.18 kg"
                    };
                case 3:
                    return new String[]{
                            "<html><b>Specs:</b><br>",
                            "Name: DualDefender Torque Arm",
                            "Type: Double-sided",
                            "Material: Aluminum alloy",
                            "Compatibility: Rear wheel",
                            "Weight: 0.16 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else {
            return new String[]{"UNABLE TO FIND SPECIFICATION"};
        }
    }  
}