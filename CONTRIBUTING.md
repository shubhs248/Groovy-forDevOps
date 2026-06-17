# 🤝 Contributing

Thanks for thinking about helping out! This is a learning project, so contributions of every size are welcome — even fixing a typo.

If this repo helped you, the easiest way to support it is to **star** ⭐ it, **fork** 🍴 it, and **share** 🔗 it on LinkedIn so others can find it too.

## Ways you can help

- **Fix something** — a typo, a broken link, or code that does not run.
- **Add a new exercise** — more Groovy practice, or another Jenkins pipeline scenario.
- **Improve the wording** — make an explanation clearer or simpler.
- **Add a shared-library example** — a `vars/*.groovy` step is a great addition.

## How to contribute (step by step)

1. **Fork** this repo to your own GitHub account.
2. **Clone** your fork:
   ```bash
   git clone https://github.com/<your-username>/groovy-practice-lab.git
   cd groovy-practice-lab
   ```
3. **Create a branch**:
   ```bash
   git switch -c add-shared-library-scenario
   ```
4. **Make your change** and test it (see the checklist below).
5. **Commit** and **push**, then open a **Pull Request**:
   ```bash
   git add .
   git commit -m "Add a shared library Jenkins scenario"
   git push -u origin add-shared-library-scenario
   ```

## Adding an exercise

Keep the same simple style:

- For parts 1 & 2: add a starter `exercise-*.groovy` (brief, hints, `// TODO`s) and a working
  answer in `solutions/` with the same name.
- For part 3: add a `scenario-*.md` brief and a solution `Jenkinsfile` in `solutions/`.
- Use plain, simple English.

## Checklist before you open a PR

- [ ] `.groovy` exercises run with `groovy <file>` and print what the brief expects.
- [ ] Jenkinsfiles use valid declarative or scripted syntax.
- [ ] Instructions use plain, simple English.
- [ ] If you added a new part, you linked it from the main `README.md`.

## Code of conduct

Be kind and helpful. Assume good intent and keep feedback friendly.

---

Made by **Shubham Sharma** · [GitHub](https://github.com/shubhs248) · [LinkedIn](https://www.linkedin.com/in/shubhs248)
