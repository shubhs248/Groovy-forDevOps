/* Solution - Exercise 1.1 Collections */

// 1. List of CPU readings
def readings = [35, 82, 20, 90, 55]
println "Readings: ${readings}"
println "Count: ${readings.size()}"
println "Hot (>80): ${readings.findAll { it > 80 }}"
println "Average: ${readings.sum() / readings.size()}"

// 2. Server map
def server = [name: 'db-01', cpu: 55, role: 'db']
println "Role: ${server.role}"
server.mem = 88
server.each { key, value -> println "${key} = ${value}" }
