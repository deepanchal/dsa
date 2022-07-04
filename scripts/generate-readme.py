#!/usr/bin/env python3

from os import listdir
from os.path import splitext

delimiter="-"
project = {
    "name": "DSA",
    "subtitle": "Data Structures & Algorithms",
    "description": "Repo for practicing Data Structures & Algorithms",
    "repo": "https://github.com/deepanchal/dsa/tree/main/",
}
problem_table_header = """
| Num | Title | Difficulty | Solution |
| :-: | ----- | :--------: | :------: |
"""

print("Generating README.md...")

# Generate leetcode table
leetcode_url="https://leetcode.com/problems/"
leetcode_path = "leetcode/"
leetcode_solutions = listdir('./' + leetcode_path)
leetcode_table = problem_table_header

for sol in leetcode_solutions:
    info = sol.split(delimiter)
    num, title = info[0], info[1:]
    link = leetcode_url + '-'.join(title)
    title = ' '.join(title).capitalize()
    solutions = ', '.join([f'[{i.split(".")[1]}]({leetcode_path}{sol}/{i})' for i in listdir(leetcode_path + sol) if i.lower().startswith('solution')])
    print(solutions)
    md_line = f"| {num} | [{title}](<{link}>) |  | {solutions} |\n"
    leetcode_table += md_line


# Generate type-challenges table
type_challenges_url = "https://tsch.js.org/"
type_challenges_table = problem_table_header
type_challenges_path = "type-challenges/problems/"
type_challenges_solutions = listdir("./" + type_challenges_path)

for sol in type_challenges_solutions:
    fileName, fileExt = splitext(sol)
    info = fileName.split(delimiter)
    num, difficulty, title = info[0], info[1], info[2:]
    link = type_challenges_url + '-'.join(title)
    title = ' '.join(title).capitalize()
    md_line = f"| {num} | [{title}](<{link}>) | {difficulty} | [{fileExt}]({type_challenges_path}{sol}) |\n"
    type_challenges_table += md_line

# README.md template
readme_md = f"""# {project['name']} ({project['subtitle']})

{project['description']}

## Leetcode

Problems solved so far:
{leetcode_table}

## Type Challenges

Challenges solved so far:
{type_challenges_table}

## Getting Started

### Generate README.md

```bash
./scripts/generate-readme.py
```

## License

MIT
"""

print("Writing README.md...")
print(readme_md)

readme_path = "README.md"
with open(readme_path, 'w') as f:
    f.write(readme_md)
    f.close()

