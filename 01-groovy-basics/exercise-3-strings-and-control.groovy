/*
 * Exercise 1.3 - Strings & Control Flow
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: GStrings, if/switch, ranges, and writing a method.
 *
 * WHAT TO BUILD:
 *   1. Variables name='web-01' and cpu=90. Print "Server web-01 is at 90%"
 *      using a GString (double quotes with ${...}).
 *   2. Print "HIGH" if cpu is 80 or more, "MEDIUM" if 50 or more, else "OK"
 *      (use if / else if / else).
 *   3. A switch on a 'status' variable: "up" -> "running", "down" -> "stopped",
 *      anything else -> "unknown". Test it with status = 'down'.
 *   4. Use a range to print the numbers 1 to 5.
 *   5. Write a method statusFor(int cpu) that RETURNS the same word as task 2
 *      ("HIGH"/"MEDIUM"/"OK"). Print statusFor(45).
 *
 * HOW TO RUN:
 *   groovy exercise-3-strings-and-control.groovy
 *
 * HINTS:
 *   - GString: "Server ${name} is at ${cpu}%"
 *   - switch: switch (status) { case 'up': ...; break; default: ... }
 *   - range loop: for (i in 1..5) { println i }
 *   - a method returns its last expression even without 'return'
 * ---------------------------------------------------------------------------
 */

// TODO 1: GString message


// TODO 2: if / else if / else on cpu


// TODO 3: switch on status


// TODO 4: range 1..5


// TODO 5: statusFor(int cpu) method, then print statusFor(45)


println "Done - replace this line once you have written your solution above."
