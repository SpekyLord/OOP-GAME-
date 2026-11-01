# OOP-GAME-

CIT 240 Object-Oriented Programming final output: a Java Swing slice-of-life RPG about an ICT student
surviving a 5-day sem break. Balance hunger, hydration, energy, motivation and sanity while finishing
assignments. Three endings: SIGNAL: CONNECTED, ANOTHER DAY, BURNED OUT.

**Status:** structure only. Every file contains comments describing what it will become; no game code yet.

```
OOP-GAME-/
├── README.md
├── src/
│   ├── Main.java                  entry point
│   ├── GameWindow.java            Swing GUI (clickable bedroom, bars, log)
│   ├── Game.java                  clock, days, rules, endings logic
│   ├── Player.java                encapsulated stats
│   ├── Stat.java                  enum of the 5 stats
│   ├── Task.java                  ABSTRACT parent of all actions
│   ├── PhysiologicalTask.java     eat / drink / go outside
│   ├── SocialTask.java            chat / doomscroll
│   ├── SleepTask.java             nap or sleep to next day
│   ├── CodeTask.java              coding puzzles, assignments, study
│   ├── TaskBlockedException.java  custom exception (0 energy)
│   └── Ending.java                enum of the 3 endings
├── tests/GameTest.java            assert-based checks
├── docs/                          UML.md, Documentation.md, Presentation.md
└── assets/                        characters, backgrounds, items, ui (see assets/README.md)
```
