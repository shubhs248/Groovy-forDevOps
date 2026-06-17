/*
 * Exercise 2.2 - JSON Config
 * ---------------------------------------------------------------------------
 * WHAT YOU PRACTISE: parsing JSON and filtering a list of maps.
 *   (Jenkins jobs often read JSON from an API or a file.)
 *
 * WHAT TO BUILD:
 *   Parse the 'jsonText' below, then print:
 *     - how many servers are "up" and how many are "down"
 *     - the names of servers that are over a limit
 *       (cpu above thresholds.cpu_percent OR mem above thresholds.mem_percent)
 *
 * HOW TO RUN:
 *   groovy exercise-2-json-config.groovy
 *
 * HINTS:
 *   - import groovy.json.JsonSlurper
 *   - def config = new JsonSlurper().parseText(jsonText)
 *   - config.servers is a list of maps; config.thresholds is a map
 *   - Count: config.servers.count { it.status == 'up' }
 *   - Filter: config.servers.findAll { it.cpu > limit || it.mem > limit2 }
 *   - Names only: ....collect { it.name }
 * ---------------------------------------------------------------------------
 */

import groovy.json.JsonSlurper

def jsonText = '''
{
  "thresholds": { "cpu_percent": 80, "mem_percent": 85 },
  "servers": [
    { "name": "web-01", "status": "up",   "cpu": 35, "mem": 60 },
    { "name": "web-02", "status": "up",   "cpu": 82, "mem": 70 },
    { "name": "db-01",  "status": "up",   "cpu": 55, "mem": 88 },
    { "name": "db-02",  "status": "down", "cpu": 0,  "mem": 0  },
    { "name": "api-01", "status": "down", "cpu": 0,  "mem": 0  },
    { "name": "api-02", "status": "up",   "cpu": 90, "mem": 75 }
  ]
}
'''

// TODO 1: parse jsonText with JsonSlurper


// TODO 2: count how many servers are "up" and how many are "down"


// TODO 3: read the two limits from thresholds, then print the names over a limit


println "Done - replace this line once you have written your solution above."
