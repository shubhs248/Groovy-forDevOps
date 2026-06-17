/* Solution - Exercise 2.2 JSON Config */

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

def config = new JsonSlurper().parseText(jsonText)

def up = config.servers.count { it.status == 'up' }
def down = config.servers.count { it.status == 'down' }

def cpuLimit = config.thresholds.cpu_percent
def memLimit = config.thresholds.mem_percent
def over = config.servers.findAll { it.cpu > cpuLimit || it.mem > memLimit }.collect { it.name }

println "Servers up:   ${up}"
println "Servers down: ${down}"
println "Over limit (cpu>${cpuLimit} or mem>${memLimit}): ${over}"
