# 🎤 Groovy & Jenkins Pipelines — Interview Questions

> Groovy questions mostly come up in the context of **Jenkins pipelines**. Plain-English answers you can say out loud, covering both the language basics and the pipeline patterns. Do the exercises and pipeline scenarios first.

**How to use this file:** cover the answers, read a question, answer out loud, then check. For pipeline questions, be ready to describe the *stages* and *why*, not just syntax.

---

## 🟢 Groovy basics

**1. What is Groovy and why is it used with Jenkins?**
Groovy is a dynamic language that runs on the JVM and is largely Java-compatible. Jenkins uses it because its **pipeline-as-code** (the `Jenkinsfile`) is a Groovy DSL — so understanding Groovy helps you write and debug pipelines.

**2. What does `def` do?**
It declares a variable without a fixed type (dynamic typing). `def name = "web"` — Groovy figures out the type. You can also use explicit types (`String name = "web"`).

**3. What is a GString?**
A Groovy string with interpolation using double quotes: `"Hello ${name}"`. Single-quoted strings are plain Java strings with no interpolation. Use `${...}` to embed variables/expressions.

**4. How do closures work and why do they matter?**
A closure is a block of code you can pass around like a value: `{ x -> x * 2 }`. They power Groovy's collection methods (`each`, `collect`, `findAll`) and are central to how pipeline steps are written.

**5. What's the difference between `each`, `collect`, and `findAll`?**
- `each` — run code for every item (side effects), returns the original.
- `collect` — transform every item, returns a **new** list (like `map`).
- `findAll` — keep only items matching a condition (like `filter`).

---

## 🔵 Groovy for automation

**6. How do you work with lists and maps in Groovy?**
Lists: `[1, 2, 3]` with `.size()`, `.sum()`, `.sort()`. Maps: `[name: "web", port: 80]`, access with `map.name` or `map["name"]`. Iterate a map with `each { k, v -> ... }`.

**7. How do you parse JSON in Groovy?**
```groovy
import groovy.json.JsonSlurper
def data = new JsonSlurper().parseText(jsonString)
```
For output, `JsonOutput.toJson(obj)` / `JsonOutput.prettyPrint(...)`. Useful for reading API responses or config in pipelines.

**8. How do closures help build a report (e.g. a build summary)?**
You chain collection methods: `builds.findAll { it.failed }.collect { it.name }`. This reads almost like English and avoids manual loops — that's the build-report exercise in this lab.

**9. What is `it` in a closure?**
The implicit name for the single parameter when you don't declare one: `list.each { println it }`. As soon as you need multiple params you name them explicitly.

---

## 🟣 Jenkins pipelines — declarative

**10. Declarative vs scripted pipelines — what's the difference?**
- **Declarative** — structured, opinionated, starts with `pipeline { }`. Easier to read, has built-in `post`, `when`, validation. Preferred for most cases.
- **Scripted** — full Groovy in a `node { }` block. More flexible/powerful but more complex.
You can drop into scripted Groovy inside declarative using a `script { }` block.

**11. What are the main sections of a declarative pipeline?**
`pipeline { agent ... stages { stage('Build') { steps { ... } } } }`, plus optional `environment`, `parameters`, `options`, `triggers`, and `post`. (Scenario 1 in this lab.)

**12. What does `agent` do?**
It tells Jenkins **where** to run. `agent any` runs on any available node, `agent none` means define per-stage, and `agent { docker 'image' }` runs inside a container. You can set it globally or per stage.

**13. What is the `post` section for?**
It runs after stages finish, based on outcome: `always`, `success`, `failure`, `unstable`, `changed`. Used for notifications, cleanup, archiving artifacts — e.g. "Slack the team on failure".

**14. How do you define and use environment variables?**
```groovy
environment {
  APP_ENV = 'production'
}
```
Reference them as `${APP_ENV}` or `env.APP_ENV`. For secrets, use `credentials('id')` so they're masked.

**15. How do you handle parameters / make a pipeline configurable?**
A `parameters { }` block with `string`, `booleanParam`, `choice`, etc. Users pick values when triggering the build, accessed via `params.NAME`. (Scenario 2 in this lab.)

---

## 🟠 Pipelines — parallel, conditions, reuse

**16. How do you run stages in parallel?**
A `parallel` block containing multiple stages. Useful for running tests across OSes or building several components at once to save time. (Scenario 2 in this lab.)

**17. How does the `when` directive work?**
It runs a stage only if a condition is met: `when { branch 'main' }` or `when { expression { params.DEPLOY } }`. Common for "deploy only on main".

**18. How do you reuse code across pipelines?**
Define functions/`def` methods, or use a **Shared Library** (`@Library`) loaded from a Git repo. Shared libraries let teams standardise steps (build, notify, deploy) across many Jenkinsfiles. (Scenario 3 touches reusable functions.)

**19. How do you handle errors in a pipeline?**
`try/catch` in a `script`/scripted block, the `post { failure { } }` section, `retry(n) { }` to retry flaky steps, and `timeout(time: 10) { }` to avoid hanging builds. `catchError` lets a stage fail without killing the whole pipeline.

---

## 🔴 "Senior" / real-world

**20. What does "pipeline as code" give you over the old freestyle jobs?**
The pipeline lives in the repo (`Jenkinsfile`), so it's version-controlled, reviewable in PRs, reproducible, and travels with the code. Freestyle jobs were click-configured in the UI and easy to lose/drift.

**21. How do you manage secrets in Jenkins pipelines?**
Use the **Credentials** store and `withCredentials` / `credentials()`. Never hardcode secrets in the Jenkinsfile. Jenkins masks credential values in logs.

**22. What's an agent/node and how does Jenkins distribute work?**
Jenkins has a controller (coordinates) and agents/nodes (do the work). Labels route jobs to the right agent (e.g. `linux`, `docker`). This lets you scale builds horizontally.

**23. A pipeline stage is flaky / intermittently fails. What do you do?**
Wrap it in `retry`, add a `timeout`, investigate the root cause (network, shared state, test ordering), and isolate it (containerised agents, clean workspace). Don't just retry forever — find why.

**24. How do you speed up a slow pipeline?**
Run independent stages in `parallel`, cache dependencies, use lighter agents/containers, skip unnecessary stages with `when`, and fail fast (run quick checks/tests first).

**25. How do you trigger a pipeline automatically?**
`triggers { }` (cron, `pollSCM`), webhooks from GitHub/GitLab on push or PR, or upstream/downstream job triggers. Webhooks are preferred over polling.

---

## 🧠 Whiteboard / live prompts

Try these in this lab.

1. **Write a declarative pipeline** with Build → Test → Deploy stages.
2. **Add a `when` so Deploy only runs on `main`.**
3. **Run unit and integration tests in parallel.**
4. **Notify on failure** using the `post` section.
5. **Parse a JSON build report** and print failed jobs (Groovy closures).

---

## ⭐ Found this useful?
If this helped your prep, please **star** ⭐, **fork** 🍴, and **share** 🔗 the repo on LinkedIn. Got a Groovy/Jenkins question from a real interview? Add it via [CONTRIBUTING.md](CONTRIBUTING.md).

Made by **Shubham Sharma** · [GitHub](https://github.com/shubhs248) · [LinkedIn](https://www.linkedin.com/in/shubhs248)
