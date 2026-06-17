# Part 2 — Groovy for Automation

## 🎯 Goal
Use Groovy for the small data tasks that come up inside pipelines: reading log text, parsing JSON, and turning a list of results into a readable report.

## 🧠 What you practise here
- Going through text line by line (`eachLine`)
- Counting with a map
- Parsing JSON with `groovy.json.JsonSlurper`
- `findAll`, `collect`, `count`, `sum`, `max` on lists of maps

Each exercise has its sample data built right into the file, so there is nothing extra to download.

---

## 📝 The 3 exercises

| # | File | What it tests |
|---|------|---------------|
| 1 | `exercise-1-log-parser.groovy`  | parse a log, count status codes |
| 2 | `exercise-2-json-config.groovy` | parse JSON, filter servers |
| 3 | `exercise-3-build-report.groovy`| summarise a list of build results |

Open each file, complete the `// TODO` lines, then run it:

```bash
groovy 02-groovy-for-automation/exercise-1-log-parser.groovy
```

Ready-made answers are in [`solutions/`](solutions).

➡️ Next: [Part 3 — Jenkins Pipelines](../03-jenkins-pipelines/README.md).

---

## ⭐ Found this useful?
Please **star** ⭐, **fork** 🍴, and **share** 🔗 this repo on LinkedIn so others can use it too. Want to add an exercise or fix something? See [CONTRIBUTING.md](../CONTRIBUTING.md).

Made by **Shubham Sharma** · [GitHub](https://github.com/shubhs248) · [LinkedIn](https://www.linkedin.com/in/shubhs248)
