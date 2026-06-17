# Part 3 — Jenkins Pipelines

## 🎯 Goal
Write the thing Groovy is most used for in DevOps: a `Jenkinsfile`. You will write a basic declarative pipeline, then add parameters/conditions/parallel stages, then see the scripted style and reusable functions.

## 🧠 What you practise here
- The shape of a **declarative** pipeline: `agent`, `stages`, `steps`, `post`
- `environment`, `parameters`, `when`, and `parallel`
- The **scripted** style (`node { ... }`) and writing a reusable function
- Plain English mapping from "what I want" to pipeline syntax

> ℹ️ You do not need a running Jenkins to do these. Write the `Jenkinsfile`, then compare with the solution. If you do have Jenkins, you can paste it into a Pipeline job. The online **Jenkins Pipeline Linter** (or `Jenkinsfile` validation in Blue Ocean) can also check syntax.

---

## 📝 The 3 scenarios

| # | File | You write |
|---|------|-----------|
| 1 | `scenario-1-declarative-pipeline.md`    | a basic declarative pipeline |
| 2 | `scenario-2-parallel-and-conditions.md` | parameters, parallel stages, conditional deploy |
| 3 | `scenario-3-scripted-and-functions.md`  | a scripted pipeline with a reusable function |

Read the spec, write your `Jenkinsfile`, then compare with the matching file in [`solutions/`](solutions).

🎉 Finished all three parts? You now know enough Groovy to read and write real Jenkins pipelines with confidence. Go back to the [main README](../README.md) and share your fork on LinkedIn!

---

## ⭐ Found this useful?
Please **star** ⭐, **fork** 🍴, and **share** 🔗 this repo on LinkedIn so others can use it too. Want to add a scenario or fix something? See [CONTRIBUTING.md](../CONTRIBUTING.md).

Made by **Shubham Sharma** · [GitHub](https://github.com/shubhs248) · [LinkedIn](https://www.linkedin.com/in/shubhs248)
