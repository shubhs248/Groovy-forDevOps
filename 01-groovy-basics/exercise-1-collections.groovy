/*
 * Exercise 1.1 - Collections (lists & maps)
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: lists, maps, and their everyday methods.
 *
 * WHAT TO BUILD:
 *   1. A list of CPU readings: [35, 82, 20, 90, 55]
 *      - print the whole list
 *      - print how many readings there are
 *      - print only the readings above 80 (the "hot" ones)
 *      - print the average reading
 *   2. A map describing a server: name=db-01, cpu=55, role=db
 *      - print the value of 'role'
 *      - add a new key 'mem' = 88
 *      - print every key and value as "key = value"
 *
 * HOW TO RUN:
 *   groovy exercise-1-collections.groovy
 *
 * HINTS:
 *   - List: def readings = [35, 82, ...]
 *   - Count: readings.size()   Above 80: readings.findAll { it > 80 }
 *   - Average: readings.sum() / readings.size()
 *   - Map: def server = [name: 'db-01', cpu: 55, role: 'db']
 *   - Loop a map: server.each { key, value -> println "..." }
 * ---------------------------------------------------------------------------
 */

// TODO 1: make the list of readings and print it, its size, the hot ones, and the average


// TODO 2: make the server map, print its role, add mem=88, then print every key/value


println "Done - replace this line once you have written your solution above."
