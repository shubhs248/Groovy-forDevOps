/* Solution - Exercise 1.3 Strings & Control Flow */

// 1. GString message
def name = 'web-01'
def cpu = 90
println "Server ${name} is at ${cpu}%"

// 2. if / else if / else
if (cpu >= 80) {
    println "HIGH"
} else if (cpu >= 50) {
    println "MEDIUM"
} else {
    println "OK"
}

// 3. switch
def status = 'down'
switch (status) {
    case 'up':
        println "running"
        break
    case 'down':
        println "stopped"
        break
    default:
        println "unknown"
}

// 4. range
for (i in 1..5) {
    println i
}

// 5. a method that returns the status word
def statusFor(int value) {
    if (value >= 80) return "HIGH"
    if (value >= 50) return "MEDIUM"
    return "OK"
}
println statusFor(45)
