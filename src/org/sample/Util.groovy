package org.sample

class Util implements Serializable {
    def script

    Util(script) {
        this.script = script
    }

    def speak() {
        script.println("heelo")
    }
}
