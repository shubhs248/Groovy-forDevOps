# Scenario 3.3 — Scripted Pipeline with a Reusable Function

**You write:** a `Jenkinsfile` in the scripted style, using your own helper function.

---

## 📋 The spec
The **scripted** style is just Groovy: it starts with `node { ... }` and you can use
normal functions, loops, and `try/catch`. Write a scripted pipeline that:

- defines a function `notify(String message)` that prints `NOTIFY: <message>`
- runs inside a `node { ... }` block
- has three `stage(...)` blocks: `Build`, `Test`, `Deploy`
  - each stage calls `notify(...)` with a short message, then runs the matching
    `sh 'make build' / 'make test' / 'make deploy'`
- wraps the stages in a `try { ... } catch (e) { ... }` so that if anything fails it
  calls `notify('pipeline failed')` and re-throws the error

## ✅ How to check
- The file defines `def notify(String message) { ... }`.
- The work happens inside `node { ... }`.
- There is a `try/catch` around the stages.
- Compare with [`solutions/scenario-3-Jenkinsfile`](solutions/scenario-3-Jenkinsfile).

## 💡 Hints
- A function at the top of a scripted Jenkinsfile:
  ```groovy
  def notify(String message) {
      echo "NOTIFY: ${message}"
  }
  ```
- Scripted skeleton:
  ```groovy
  node {
      try {
          stage('Build') { notify('building'); sh 'make build' }
          // more stages
      } catch (err) {
          notify('pipeline failed')
          throw err          // re-throw so the build is marked failed
      }
  }
  ```
- `throw err` makes sure Jenkins still marks the build as failed after you notify.
