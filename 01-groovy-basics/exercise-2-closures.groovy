/*
 * Exercise 1.2 - Closures
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: closures - little blocks of code you can name and pass around.
 *   (Closures are everywhere in Jenkinsfiles, so this is important.)
 *
 * WHAT TO BUILD:
 *   1. A closure 'greet' that takes a name and returns "Hi <name>". Call it twice.
 *   2. A closure 'square' that returns its argument times itself (use the
 *      automatic 'it' variable). Print square(5).
 *   3. Given servers = ['web-01', 'web-02', 'db-01']:
 *      - use .each to print each server
 *      - use .findAll to keep only the ones whose name starts with 'web'
 *      - use .collect to make a new list of names in UPPERCASE
 *   4. Write a method 'applyToAll(list, action)' that runs the given closure on
 *      every item. Call it to print each number in [1, 2, 3].
 *
 * HOW TO RUN:
 *   groovy exercise-2-closures.groovy
 *
 * HINTS:
 *   - Named closure: def greet = { name -> "Hi ${name}" }
 *   - 'it' is the implicit single argument: def square = { it * it }
 *   - startsWith: { it.startsWith('web') }
 *   - uppercase: { it.toUpperCase() }
 *   - A method taking a closure: def applyToAll(list, Closure action) { list.each(action) }
 * ---------------------------------------------------------------------------
 */

// TODO 1: greet closure


// TODO 2: square closure, print square(5)


// TODO 3: each / findAll / collect on the servers list


// TODO 4: applyToAll method, then call it on [1, 2, 3]


println "Done - replace this line once you have written your solution above."
