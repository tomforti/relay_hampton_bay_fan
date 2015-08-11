/*	Virtual fan switch with on/off, low, med, high buttons. Switch take the strings off, low, med, high and makes them
	into setlevels as 0=off, 30=low, 60=med, 100=high. levels are used by smartapp that controls arduino fan relay. 
*/    
metadata {
	definition (name: "Virt Fan Control Switch", namespace: "Fan Control", author: "Tom Forti") {
		capability "Switch"
		capability "Switch Level"
        capability "Refresh"

        command "lowSpeed"
        command "medSpeed"
        command "highSpeed"
        command "push"

		attribute "currentSpeed", "string"

	}

	tiles {
        standardTile("switch", "device.switch", width: 2, height: 2, canChangeIcon: true) {
			state "off", label: '${name}', action: "switch.on", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: '${name}', action: "switch.off", icon:"st.Lighting.light24", backgroundColor: "#79b821"    

		}
        //Slider not show in display but kept in for trouble shooting / testing, if needed. 
		controlTile("levelSliderControl", "device.level", "slider", height: 1, width: 3, inactiveLabel: false) {
			state "level", action:"switch level.setLevel"
		}
        
        //displays current speed as off, low, med, high
        valueTile("currentSpeed", "device.currentSpeed", canChangeIcon: false, inactiveLabel: false, decoration: "flat") {
            state ("default", label:'${currentValue}')
        }

		//Speed control row
        standardTile("lowSpeed", "device.level", inactiveLabel: false, decoration: "flat") {
            state "lowSpeed", label:'LOW', action:"lowSpeed", icon:"st.Home.home30"
        }
        standardTile("medSpeed", "device.level", inactiveLabel: false, decoration: "flat") {
            state "medSpeed", label:'MED', action:"medSpeed", icon:"st.Home.home30"
        }
        standardTile("highSpeed", "device.level", inactiveLabel: false, decoration: "flat") {
            state "highSpeed", label:'HIGH', action:"highSpeed", icon:"st.Home.home30"
        }
        standardTile("refresh", "device.switch", inactiveLabel: false, decoration: "flat") {
			state "default", label:"", action:"refresh.refresh", icon:"st.secondary.refresh"
		}
		main(["switch"])
		details(["switch", "refresh", "currentSpeed", "lowSpeed", "medSpeed", "highSpeed"])
	}
}

def parse(String description) {
}

def on() {
	setLevel(60)//fan set to med
}

def off() {
	setLevel(0)//fan tunred off
	log.info "Fan Off"
}

//take value and turns it into string string value (off, low, med, high)
def setLevel(val){
    log.info "setLevel $val"

    	sendEvent(name:"level",value:val)
    	sendEvent(name:"switch.setLevel",value:val) // had to add this to work if apps subscribed to
        											// setLevel event. "Dim With Me" was one.
        if (val == "0"){ 
       		sendEvent(name: "currentSpeed", value: "OFF" as String)
   		}
        if (val == "30") {
        	sendEvent(name: "currentSpeed", value: "LOW" as String)
        }
        if (val == "60") {
        	sendEvent(name: "currentSpeed", value: "MED" as String)
        }
        if (val == "100") {
        	sendEvent(name: "currentSpeed", value: "HIGH" as String)
        }                                                  
    
}


def setLevel(val, dur){ //used for hue emulator
  log.info "setLevel $val, $dur"
  sendEvent(name:"setLevel",value:val)
}

//allows the buttons to set the level of the fan
def lowSpeed() {
	setLevel(30)
	log.info "Fan low"
    sendEvent(name: "currentSpeed", value: "LOW" as String)
	sendEvent(name: "switch", value: "on", isStateChange: true, display: false)     
}

def medSpeed() {
	setLevel(60)
	log.info "Fan Med"
    sendEvent(name: "currentSpeed", value: "MED" as String)
    sendEvent(name: "switch", value: "on", isStateChange: true, display: false)
}

def highSpeed() {
	setLevel(100)
	log.info "Fan High"
    sendEvent(name: "currentSpeed", value: "HIGH" as String)
    sendEvent(name: "switch", value: "on", isStateChange: true, display: false)
}
