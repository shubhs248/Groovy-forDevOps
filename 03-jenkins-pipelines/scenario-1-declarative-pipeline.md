# Scenario 3.1 — A Basic Declarative Pipeline

**You write:** a `Jenkinsfile` using the declarative style.

---

## 📋 The spec
Write a declarative pipeline that:

- runs on `agent any`
- sets an environment variable `APP_NAME = 'web-app'`
- has three stages:
  1. **Build** — runs `echo "Building ${APP_NAME}"` then `sh 'make build'`
  2. **Test** — runs `sh 'make test'`
  3. **Deploy** — runs `sh 'make deploy'`
- has a `post` section that:
  - on `success` prints `Build succeeded`
  - on `failure` prints `Build failed`
  - `always` prints `Pipeline finished`

## ✅ How to check
- It starts with `pipeline {` and contains `agent`, `stages`, and `post`.
- Each stage has a `steps { }` block.
- Compare with [`solutions/scenario-1-Jenkinsfile`](solutions/scenario-1-Jenkinsfile).

## 💡 Hints
- The skeleton is:
  ```groovy
  pipeline {
      agent any
      environment { APP_NAME = 'web-app' }
      stages {
          stage('Build') { steps { /* ... */ } }
          // more stages
      }
      post {
          success { echo '...' }
          failure { echo '...' }
          always  { echo '...' }
      }
  }
  ```
- Inside `steps`, shell commands use `sh '...'` and messages use `echo "..."`.
- Environment variables are used with `${APP_NAME}` inside double quotes.
