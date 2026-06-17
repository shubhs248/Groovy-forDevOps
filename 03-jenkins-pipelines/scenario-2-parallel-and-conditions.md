# Scenario 3.2 — Parameters, Parallel Stages, and a Conditional Deploy

**You write:** a `Jenkinsfile` that takes input and only deploys to production when asked.

---

## 📋 The spec
Write a declarative pipeline that:

- runs on `agent any`
- has a **parameter**: a choice called `ENVIRONMENT` with choices `dev` and `prod` (default `dev`)
- has these stages:
  1. **Build** — runs `sh 'make build'`
  2. **Tests** — runs two stages **in parallel**:
     - `Unit` → `sh 'make unit'`
     - `Integration` → `sh 'make integration'`
  3. **Deploy** — runs `sh 'make deploy'` **only when** `params.ENVIRONMENT == 'prod'`

## ✅ How to check
- There is a `parameters { }` block with a `choice(...)`.
- The Tests stage uses a `parallel { }` block with two inner stages.
- The Deploy stage uses a `when { expression { ... } }` guard.
- Compare with [`solutions/scenario-2-Jenkinsfile`](solutions/scenario-2-Jenkinsfile).

## 💡 Hints
- A choice parameter:
  ```groovy
  parameters {
      choice(name: 'ENVIRONMENT', choices: ['dev', 'prod'], description: 'Where to deploy')
  }
  ```
- Parallel stages live inside a stage:
  ```groovy
  stage('Tests') {
      parallel {
          stage('Unit')        { steps { sh 'make unit' } }
          stage('Integration') { steps { sh 'make integration' } }
      }
  }
  ```
- Run a stage only sometimes:
  ```groovy
  when { expression { params.ENVIRONMENT == 'prod' } }
  ```
