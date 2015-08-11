# Hampton Bay Fan Relay Using Smarthings Arduino Shield
This is used to connect a hampton bay fan remote to smartthings

Things need
1) Extra Hampton Bay remote control (unless your bold enough to just use your remote)
    http://www.amazon.com/gp/product/B001I1M95E/ref=oh_aui_detailpage_o04_s00?ie=UTF8&psc=1
2)Arduino uno board
3)Smartthings Shield
4)SainSmart 8 Relay (or any relay company you like)

Find your off, low, med, high contacts and the common and solder them up
Off will go to relay 1
Low to relay 2
Med to relay 3
Hi to relay 4

Solder up the code pins 1-4 and the common
Pin1 will be relay 5
Pin2 will be relay 6
Pin3 will be relay 7
Pin4 will be relay 8

Connect the relay to the Arduino
Relay 1 goes to arduino pin 4
Relay 2 goes to arduino pin 5
Relay 3 goes to arduino pin 6
Relay 4 goes to arduino pin 7
Relay 5 goes to arduino pin 8
Relay 6 goes to arduino pin 9
Relay 7 goes to arduino pin 10 
Relay 8 goes to arduino pin 11

To set up your arduino shield follow the link below up to the example part
http://docs.smartthings.com/en/latest/arduino/

Once your shield is set up you can upload the arduino .ino to the arduino

Go to https://graph.api.smartthings.com/
Go to Device type and add the "Virt fan control switch" device type and the "Arduino Fans" device type.
Go to Devices and find the device you made before when you set up your smartthings shield, Should be called "Arduino thingsshield"
Edit it and change the "type" to the newly made device type "Arduino fans" -> update changes
While still in device, click "add device" and make your vitural house fans, make sure your change the "type" to "virt fan control switch"
repeat making fans until your have the amount you need, i only needed 4.
Go to "my smartapps" app the "fan relay app"

Grab your phone and hit the "+" sroll on the top to "my apps" and select the "fan relay app"
connect your fans and arduino shield
Fan 1 for arduino = has no pins being turned on
Fan 2 for arduino = has pin 1 being turned on
Fan 3 for arduino = has pin 2 being turned on
Fan 4 for arduino = has pin 3 being turned on

Hit Done and go to one of your virtual fan switches and test it out.
