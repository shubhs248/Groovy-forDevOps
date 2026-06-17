/*
 * Exercise 2.1 - Log Parser
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: going through text line by line and counting with a map.
 *
 * WHAT TO BUILD:
 *   Using the 'log' text below, print:
 *     - the total number of requests (lines)
 *     - how many requests there were for each status code (200, 404, 500, ...)
 *
 *   In each line the status code is the 9th item when you split on spaces
 *   (index 8), e.g. the "200" in:
 *     192.168.1.10 - - [..] "GET /index.html HTTP/1.1" 200 1024
 *
 * HOW TO RUN:
 *   groovy exercise-1-log-parser.groovy
 *
 * HINTS:
 *   - Go line by line:   log.eachLine { line -> ... }
 *   - Split a line:      def parts = line.split(' ');  def status = parts[8]
 *   - A counting map:    def counts = [:].withDefault { 0 }
 *                        counts[status] = counts[status] + 1
 *   - Sorted output:     counts.sort().each { code, n -> println "${code}: ${n}" }
 * ---------------------------------------------------------------------------
 */

def log = '''192.168.1.10 - - [17/Jun/2026:09:01:12 +0530] "GET /index.html HTTP/1.1" 200 1024
192.168.1.11 - - [17/Jun/2026:09:01:15 +0530] "GET /style.css HTTP/1.1" 200 512
192.168.1.10 - - [17/Jun/2026:09:01:20 +0530] "GET /api/users HTTP/1.1" 500 256
192.168.1.12 - - [17/Jun/2026:09:02:01 +0530] "POST /api/login HTTP/1.1" 401 128
192.168.1.13 - - [17/Jun/2026:09:02:30 +0530] "GET /missing.html HTTP/1.1" 404 64
192.168.1.14 - - [17/Jun/2026:09:03:45 +0530] "GET /api/orders HTTP/1.1" 500 256
192.168.1.11 - - [17/Jun/2026:09:04:02 +0530] "GET /favicon.ico HTTP/1.1" 404 64
192.168.1.15 - - [17/Jun/2026:09:05:10 +0530] "GET /api/report HTTP/1.1" 200 8192'''

// TODO 1: go through the log line by line, splitting each line and reading parts[8]


// TODO 2: keep a running total and a count per status code


// TODO 3: print the total, then each status code with its count


println "Done - replace this line once you have written your solution above."
