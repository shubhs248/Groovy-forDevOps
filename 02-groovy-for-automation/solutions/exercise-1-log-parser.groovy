/* Solution - Exercise 2.1 Log Parser */

def log = '''192.168.1.10 - - [17/Jun/2026:09:01:12 +0530] "GET /index.html HTTP/1.1" 200 1024
192.168.1.11 - - [17/Jun/2026:09:01:15 +0530] "GET /style.css HTTP/1.1" 200 512
192.168.1.10 - - [17/Jun/2026:09:01:20 +0530] "GET /api/users HTTP/1.1" 500 256
192.168.1.12 - - [17/Jun/2026:09:02:01 +0530] "POST /api/login HTTP/1.1" 401 128
192.168.1.13 - - [17/Jun/2026:09:02:30 +0530] "GET /missing.html HTTP/1.1" 404 64
192.168.1.14 - - [17/Jun/2026:09:03:45 +0530] "GET /api/orders HTTP/1.1" 500 256
192.168.1.11 - - [17/Jun/2026:09:04:02 +0530] "GET /favicon.ico HTTP/1.1" 404 64
192.168.1.15 - - [17/Jun/2026:09:05:10 +0530] "GET /api/report HTTP/1.1" 200 8192'''

def counts = [:].withDefault { 0 }
def total = 0

log.eachLine { line ->
    if (!line.trim()) return
    def parts = line.split(' ')
    def status = parts[8]
    counts[status] = counts[status] + 1
    total++
}

println "Total requests: ${total}"
println "By status code:"
counts.sort().each { code, n -> println "  ${code}: ${n}" }
