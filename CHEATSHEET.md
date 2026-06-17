# 📋 Groovy + Jenkins Quick-Revision Cheatsheet

A one-page reminder of the Groovy you need for DevOps, plus the Jenkins pipeline shapes.

## Variables & strings
```groovy
def name = "web-01"          // 'def' = dynamic type
int count = 3                 // or give an explicit type
String role = 'web'

// GString: double quotes allow ${...} interpolation
println "Server ${name} has role ${role}"
// single quotes are plain strings (no interpolation)
println 'No ${interpolation} here'

// multi-line string
def banner = """
  line one
  line two
"""
```

## Lists
```groovy
def nums = [4, 7, 10, 15]
nums << 20                    // append
nums.size()                   // 4 -> 5
nums.each { println it }      // 'it' is the implicit loop variable
def evens = nums.findAll { it % 2 == 0 }
def doubled = nums.collect { it * 2 }     // like map()
def total = nums.sum()
```

## Maps
```groovy
def server = [name: "db-01", cpu: 55, role: "db"]
server.cpu                    // 55  (dot access)
server["role"]               // "db" (bracket access)
server.mem = 88               // add a key
server.each { k, v -> println "$k = $v" }
```

## Closures (Groovy's superpower)
```groovy
def greet = { person -> "Hi ${person}" }
greet("Sam")                  // "Hi Sam"

// one argument is automatically called 'it'
def square = { it * it }
square(5)                     // 25

// closures are passed to methods all the time:
[1, 2, 3].each { println it }
```

## Control flow
```groovy
if (cpu > 80) { println "HIGH" } else { println "OK" }

switch (status) {
    case "up":   println "running"; break
    case "down": println "stopped"; break
    default:     println "unknown"
}

for (i in 1..5) { println i }         // ranges with ..
3.times { println it }                // 0,1,2
```

## Methods
```groovy
def isHealthy(int cpu, int mem) {
    return cpu < 80 && mem < 85       // last expression is returned even without 'return'
}
```

## Handy for automation
```groovy
import groovy.json.JsonSlurper
def data = new JsonSlurper().parseText('{"name":"web","up":true}')
data.name                              // "web"

new File("notes.txt").eachLine { line -> println line }
"echo hello".execute().text            // run a shell command (be careful!)
```

---

# Jenkins pipelines

## Declarative pipeline (the common one)
```groovy
pipeline {
    agent any
    environment {
        APP = 'web'
    }
    stages {
        stage('Build') {
            steps {
                sh 'make build'
            }
        }
        stage('Test') {
            steps {
                sh 'make test'
            }
        }
    }
    post {
        success { echo 'Pipeline passed' }
        failure { echo 'Pipeline failed' }
        always  { echo 'Done' }
    }
}
```

## Parameters, when, parallel
```groovy
pipeline {
    agent any
    parameters {
        choice(name: 'ENV', choices: ['dev', 'prod'], description: 'target')
    }
    stages {
        stage('Tests') {
            parallel {
                stage('unit')        { steps { sh 'make unit' } }
                stage('integration') { steps { sh 'make integration' } }
            }
        }
        stage('Deploy') {
            when { expression { params.ENV == 'prod' } }
            steps { sh 'make deploy' }
        }
    }
}
```

## Scripted pipeline & reusable functions
```groovy
def notify(String msg) {           // a plain Groovy function
    echo "NOTIFY: ${msg}"
}

node {
    stage('Build') {
        notify('building')
        sh 'make build'
    }
}
```

## Quick declarative vs scripted
- **Declarative**: starts with `pipeline { ... }`, structured, easier, preferred for most jobs.
- **Scripted**: starts with `node { ... }`, full Groovy, more flexible for complex logic.

---

## ⭐ Found this useful?
Please **star** ⭐, **fork** 🍴, and **share** 🔗 this repo on LinkedIn so others can use it too. Want to improve it? See [CONTRIBUTING.md](CONTRIBUTING.md).

Made by **Shubham Sharma** · [GitHub](https://github.com/shubhs248) · [LinkedIn](https://www.linkedin.com/in/shubhs248)
