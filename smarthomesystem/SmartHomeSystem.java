package smarthomesystem;

import java.util.*;

public class SmartHomeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHome sh = new SmartHome();
        AirConditioner ac = new AirConditioner("AC");
        RGBLight rgb = new RGBLight("RGB");
        SmartDoor door = new SmartDoor("Smart Door");
        CCTV cc = new CCTV("CCTV");
        Heater ht = new Heater("Heater");

        sh.addDevice(ac);
        sh.addDevice(rgb);
        sh.addDevice(door);
        sh.addDevice(cc);
        sh.addDevice(ht);

        boolean running = true;

        while (running) {
            System.out.println("\n---->Smart Home Control Menu<----");
            System.out.println("====================================");
            System.out.println("1.View My Device");
            System.out.println("2.Operate a Device");
            System.out.println("3.Exit");
            System.out.println("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sh.displayAllDevices();
                    break;
                case 2:
                    sh.displayDeviceList();
                    System.out.print("Select a device number to operate: ");

                    int deviceChoice = sc.nextInt() - 1;
                    SmartDevice device = sh.getDeviceByIndex(deviceChoice);
                    if (device != null) {
                        if (device instanceof AirConditioner) {
                            System.out.println("1. Turn ON\n2. Turn OFF\n3. SetTemperature");

                            int acChoice = sc.nextInt();
                            if (acChoice == 1) {
                                device.turnOn();
                            } else if (acChoice == 2) {
                                device.turnOff();
                            } else if (acChoice == 3) {
                                System.out.print("Enter temperature: ");
                                int temp = sc.nextInt();
                                ((AirConditioner) device).setTemperature(temp);
                            }
                        } else if (device instanceof RGBLight) {
                            System.out.println("1. Turn ON\n2. Turn OFF\n3. SetColor");

                            int rgbChoice = sc.nextInt();
                            if (rgbChoice == 1) {
                                device.turnOn();
                            } else if (rgbChoice == 2) {
                                device.turnOff();
                            } else if (rgbChoice == 3) {
                                System.out.print("Enter color: ");
                                sc.nextLine();
                                String color = sc.nextLine();
                                ((RGBLight) device).setColor(color);
                            }
                        } else if (device instanceof SmartDoor) {
                            System.out.println("1. Lock\n2. Unlock");
                            int doorChoice = sc.nextInt();
                            if (doorChoice == 1) {
                                ((SmartDoor) device).Lock();
                            } else if (doorChoice == 2) {
                                ((SmartDoor) device).Unlock();
                            }
                        } else if (device instanceof CCTV) {
                            System.out.println("1. Start Recording\n2. StopRecording");

                            int cctvChoice = sc.nextInt();
                            if (cctvChoice == 1) {
                                ((CCTV) device).startRecording();
                            } else if (cctvChoice == 2) {
                                ((CCTV) device).stopRecording();
                            }
                        } else if (device instanceof Heater) {
                            System.out.println("1. Turn ON\n2. Turn OFF");
                            int heaterChoice = sc.nextInt();
                            if (heaterChoice == 1) {
                                device.turnOn();
                            } else if (heaterChoice == 2) {
                                device.turnOff();
                            }
                        }
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }

}
