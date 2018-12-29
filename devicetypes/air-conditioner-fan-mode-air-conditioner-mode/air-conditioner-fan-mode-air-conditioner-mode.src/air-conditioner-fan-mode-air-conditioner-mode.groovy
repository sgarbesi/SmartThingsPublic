/**
 *  Air Conditioner Fan Mode   Air Conditioner Mode 
 *
 *  Copyright 2018 Eliram Cohen
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "Air Conditioner Fan Mode   Air Conditioner Mode ", namespace: "Air Conditioner Fan Mode   Air Conditioner Mode ", author: "Eliram Cohen") {
		capability "Air Conditioner Fan Mode"
		capability "Air Conditioner Mode"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'fanMode' attribute
	// TODO: handle 'airConditionerMode' attribute

}

// handle commands
def setFanMode() {
	log.debug "Executing 'setFanMode'"
	// TODO: handle 'setFanMode' command
}

def setAirConditionerMode() {
	log.debug "Executing 'setAirConditionerMode'"
	// TODO: handle 'setAirConditionerMode' command
}