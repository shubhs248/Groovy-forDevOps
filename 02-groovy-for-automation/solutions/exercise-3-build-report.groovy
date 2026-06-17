/* Solution - Exercise 2.3 Build Report */

def builds = [
    [job: 'api-service',  result: 'SUCCESS', durationSec: 120],
    [job: 'web-frontend', result: 'FAILURE', durationSec: 80],
    [job: 'worker',       result: 'SUCCESS', durationSec: 200],
    [job: 'scheduler',    result: 'SUCCESS', durationSec: 60],
    [job: 'notifier',     result: 'FAILURE', durationSec: 45],
]

println "Build report"
println "-" * 30
builds.each { println "${it.job}: ${it.result} (${it.durationSec}s)" }

def passed = builds.count { it.result == 'SUCCESS' }
def failed = builds.count { it.result == 'FAILURE' }
def average = builds.sum { it.durationSec } / builds.size()
def slowest = builds.max { it.durationSec }

println "-" * 30
println "Passed: ${passed}   Failed: ${failed}"
println "Average duration: ${average}s"
println "Slowest job: ${slowest.job} (${slowest.durationSec}s)"
