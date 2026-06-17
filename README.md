# 🟣 Groovy for DevOps — Practice Lab

> A **clone-and-go** lab to quickly refresh Groovy and practise the thing most DevOps engineers actually use it for: **Jenkins pipelines**. Includes plain-Groovy exercises plus write-the-Jenkinsfile scenarios.

[![Made with Groovy](https://img.shields.io/badge/Made%20with-Groovy-4298B8.svg?logo=apachegroovy&logoColor=white)](https://groovy-lang.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

---

## 🎯 Why this repo?

Most people meet Groovy through a `Jenkinsfile` and copy-paste their way through it. This lab helps you actually understand it: first the Groovy language (lists, maps, closures, strings), then small automation tasks, then writing real Jenkins pipelines from a spec.

## 🗂️ What's inside

```
groovy-practice-lab/
├── README.md                 ← you are here
├── CHEATSHEET.md             ← 1-page Groovy + Jenkins pipeline reminder
├── CONTRIBUTING.md           ← how to add your own exercises
├── 01-groovy-basics/         ← variables, strings, lists, maps, closures
│   ├── README.md
│   ├── exercise-1-collections.groovy
│   ├── exercise-2-closures.groovy
│   ├── exercise-3-strings-and-control.groovy
│   └── solutions/
├── 02-groovy-for-automation/ ← parse text, JSON, build a report
│   ├── README.md
│   ├── exercise-1-log-parser.groovy
│   ├── exercise-2-json-config.groovy
│   ├── exercise-3-build-report.groovy
│   └── solutions/
└── 03-jenkins-pipelines/     ← write Jenkinsfiles from a spec
    ├── README.md
    ├── scenario-1-declarative-pipeline.md
    ├── scenario-2-parallel-and-conditions.md
    ├── scenario-3-scripted-and-functions.md
    └── solutions/
```

## ✅ Requirements

- **Java** (8 or newer) — Groovy runs on the JVM.
- **Groovy** — to run the `.groovy` exercises in parts 1 and 2.

Install Groovy (any one):

```bash
# SDKMAN (macOS / Linux / WSL) - recommended
curl -s "https://get.sdkman.io" | bash
sdk install groovy

# macOS (Homebrew)
brew install groovy

# Windows (Scoop or Chocolatey)
scoop install groovy        # or:  choco install groovy
```

> Don't want to install anything yet? You can paste the exercises into the online
> [Groovy Web Console](https://groovyconsole.appspot.com/) to run them.
> Part 3 (Jenkins pipelines) is about **writing** Jenkinsfiles, so it needs no local setup.

## 🚀 Quick start

```bash
git clone https://github.com/shubhs248/groovy-practice-lab.git
cd groovy-practice-lab

# Run a basics exercise (after writing your answer in it)
groovy 01-groovy-basics/exercise-1-collections.groovy
```

## 🧭 Suggested path (about 90 minutes)

| # | Part | What you practise | Time |
|---|------|-------------------|------|
| 1 | [Groovy Basics](01-groovy-basics/README.md) | variables, strings, lists, maps, closures | 30 min |
| 2 | [Groovy for Automation](02-groovy-for-automation/README.md) | parsing text & JSON, building a report | 30 min |
| 3 | [Jenkins Pipelines](03-jenkins-pipelines/README.md) | declarative & scripted Jenkinsfiles | 30 min |

## 📝 How each part works

- **Parts 1 & 2**: open the `exercise-*.groovy` file, complete the `// TODO` lines, then run it with `groovy <file>`. Compare with `solutions/`.
- **Part 3**: read the scenario spec, write the `Jenkinsfile`, then compare with the matching file in `solutions/`.

---

## ⭐ Found this useful?

- **Star** ⭐ the repo so more people discover it.
- **Fork** 🍴 it and practise on your own copy.
- **Share** 🔗 it on LinkedIn and tag me — I would love to see your progress.
- **Contribute** 🤝 a new exercise or fix. See [CONTRIBUTING.md](CONTRIBUTING.md).

## 👋 About the author

Made with care by **Shubham Sharma**.

- GitHub: [github.com/shubhs248](https://github.com/shubhs248)
- LinkedIn: [linkedin.com/in/shubhs248](https://www.linkedin.com/in/shubhs248)

## 📜 License

MIT — free to use, fork, teach with, and share. A star ⭐ or a tag on LinkedIn is always appreciated!
