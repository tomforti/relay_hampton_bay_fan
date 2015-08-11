/*Device type for use by arduino shield, goes along with smartapp and virtual device
*/
metadata {

	definition (name: "Arduino Fans", namespace: "Fan Control", author: "tomforti@gmail.com") {
        capability "Switch"
        capability "Momentary"
       
                
		command "fan1off"
        command "fan1low"
        command "fan1med"
        command "fan1hi"
        command "fan2off"
        command "fan2low"
        command "fan2med"
        command "fan2hi"
        command "fan3off"
        command "fan3low"
        command "fan3med"
        command "fan3hi"
        command "fan4off"
        command "fan4low"
        command "fan4med"
        command "fan4hi"
       	
	}
    
    ////switchs are push style switches because arduino isn't able to tell if the fans are on or not. 
    tiles {
   		standardTile("fan1off", "device.fan1off", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan1off', action: "fan1off", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan1off', action: "fan1off", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
		standardTile("fan1low", "device.fan1low", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan1low', action: "fan1low", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan1low', action: "fan1low", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan1med", "device.fan1med", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan1med', action: "fan1med", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan1med', action: "fan1med", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan1hi", "device.fan1hi", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan1hi', action: "fan1hi", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan1hi', action: "fan1hi", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan2off", "device.fan2off", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan2off', action: "fan2off", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan2off', action: "fan2off", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
		standardTile("fan2low", "device.fan2low", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan2low', action: "fan2low", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan2low', action: "fan12ow", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan2med", "device.fan2med", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan2med', action: "fan2med", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan2med', action: "fan2med", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan2hi", "device.fan2hi", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan2hi', action: "fan2hi", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan2hi', action: "fan2hi", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan3off", "device.fan3off", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan3off', action: "fan3off", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan3off', action: "fan3off", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
		standardTile("fan3low", "device.fan3low", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan3low', action: "fan3low", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan3low', action: "fan3low", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan3med", "device.fan3med", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan3med', action: "fan3med", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan3med', action: "fan3med", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan3hi", "device.fan3hi", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan3hi', action: "fan3hi", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan3hi', action: "fan3hi", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
		standardTile("fan4off", "device.fan4off", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan4off', action: "fan4off", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan4off', action: "fan4off", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
		standardTile("fan4low", "device.fan4low", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan4low', action: "fan4low", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan4low', action: "fan4low", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan4med", "device.fan4med", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan4med', action: "fan4med", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan4med', action: "fan4med", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
        standardTile("fan4hi", "device.fan4hi", width: 1, height: 1, canChangeIcon: true) {
			state "off", label: 'fan4hi', action: "fan4hi", icon:"st.Lighting.light24", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'fan4hi', action: "fan4hi", icon:"st.Lighting.light24", backgroundColor: "#53a7c0"
		}
   
   
		main "fan1off"
		details(["fan1off", "fan1low", "fan1med", "fan1hi", "fan2off", "fan2low", "fan2med", "fan2hi", "fan3off", "fan3low", "fan3med", "fan3hi", "fan4off", "fan4low", "fan4med", "fan4hi"])
	}
      
}



//Command is simply received and sent over to the arduino shield, relay command are done within the arduino
def fan1off() {
    sendEvent(name: "fan1off", value: "off", isStateChange: true, display: false)//turns the switch back off
	log.debug "Turning Fan 1 Off"
    zigbee.smartShield(text: "fanoff:1").format()//send command over to arduino
} 
def fan1low() {
    sendEvent(name: "fan1low", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 1 to Low"
    zigbee.smartShield(text: "fanlow:1").format()
}
def fan1med() {
	sendEvent(name: "fan1med", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 1 to Med"
    zigbee.smartShield(text: "fanmed:1").format()
}
def fan1hi() {
	sendEvent(name: "fan1hi", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 1 to High"
    zigbee.smartShield(text: "fanhi:1").format()
}

def fan2off() {
	sendEvent(name: "fan2off", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 2 Off"
    zigbee.smartShield(text: "fanoff:2").format()
} 
def fan2low() {
	sendEvent(name: "fan2low", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 2 to Low"
    zigbee.smartShield(text: "fanlow:2").format()
}
def fan2med() {
	sendEvent(name: "fan2med", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 2 to Med"
    zigbee.smartShield(text: "fanmed:2").format()
}
def fan2hi() {
	sendEvent(name: "fan2hi", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 2 to High"
    zigbee.smartShield(text: "fanhi:2").format()
}

def fan3off() {
	sendEvent(name: "fan3off", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 3 Off"
    zigbee.smartShield(text: "fanoff:3").format()
} 
def fan3low() {
	sendEvent(name: "fan3low", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 3 to Low"
    zigbee.smartShield(text: "fanlow:3").format()
}
def fan3med() {
	sendEvent(name: "fan3med", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 3 to Med"
    zigbee.smartShield(text: "fanmed:3").format()
}
def fan3hi() {
	sendEvent(name: "fan3hi", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 3 to High"
    zigbee.smartShield(text: "fanhi:3").format()
}

def fan4off() {
	sendEvent(name: "fan4off", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 4 Off"
    zigbee.smartShield(text: "fanoff:4").format()
} 
def fan4low() {
	sendEvent(name: "fan4low", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 4 to Low"
    zigbee.smartShield(text: "fanlow:4").format()
}
def fan4med() {
	sendEvent(name: "fan4med", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 4 to Med"
    zigbee.smartShield(text: "fanmed:4").format()
}
def fan4hi() {
	sendEvent(name: "fan4hi", value: "off", isStateChange: true, display: false)
	log.debug "Turning Fan 4 to High"
    zigbee.smartShield(text: "fanhi:4").format()
}
