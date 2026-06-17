/*
 * Exercise 2.3 - Build Report
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: turning a list of maps into a summary (count, sum, max).
 *
 * WHAT TO BUILD:
 *   Using the 'builds' list below, print a report:
 *     - one line per build: "<job>: <result> (<durationSec>s)"
 *     - how many passed (result == 'SUCCESS') and how many failed
 *     - the average build duration in seconds
 *     - the name of the slowest job
 *
 * HOW TO RUN:
 *   groovy exercise-3-build-report.groovy
 *
 * HINTS:
 *   - Per line:   builds.each { println "${it.job}: ${it.result} (${it.durationSec}s)" }
 *   - Count:      builds.count { it.result == 'SUCCESS' }
 *   - Sum a field:builds.sum { it.durationSec }
 *   - Average:    builds.sum { it.durationSec } / builds.size()
 *   - Slowest:    builds.max { it.durationSec }   (returns the whole map)
 * ---------------------------------------------------------------------------
 */

def builds = [
    [job: 'api-service',  result: 'SUCCESS', durationSec: 120],
    [job: 'web-frontend', result: 'FAILURE', durationSec: 80],
    [job: 'worker',       result: 'SUCCESS', durationSec: 200],
    [job: 'scheduler',    result: 'SUCCESS', durationSec: 60],
    [job: 'notifier',     result: 'FAILURE', durationSec: 45],
]

// TODO 1: print one line per build


// TODO 2: print how many passed and how many failed


// TODO 3: print the average duration


// TODO 4: print the slowest job's name


println "Done - replace this line once you have written your solution above."
