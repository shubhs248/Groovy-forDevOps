/* Solution - Exercise 1.2 Closures */

// 1. A named closure
def greet = { name -> "Hi ${name}" }
println greet('Sam')
println greet('Priya')

// 2. Using the implicit 'it' argument
def square = { it * it }
println "square(5) = ${square(5)}"

// 3. each / findAll / collect
def servers = ['web-01', 'web-02', 'db-01']
servers.each { println it }
println "Web servers: ${servers.findAll { it.startsWith('web') }}"
println "Upper: ${servers.collect { it.toUpperCase() }}"

// 4. A method that takes a closure and runs it on every item
def applyToAll(list, Closure action) {
    list.each(action)
}
applyToAll([1, 2, 3]) { println "number: ${it}" }
