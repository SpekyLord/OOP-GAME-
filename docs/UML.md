# UML Class Diagram (PLACEHOLDER)

Purpose: the course requires a class diagram in the documentation that **matches the final code**.
Draw it (Mermaid, PlantUML or an image) only after the classes are written, then paste it here.

Classes to show:

- `Main` -> creates `GameWindow`
- `GameWindow` (extends `JFrame`) -> uses `Game`, `Task`
- `Game` -> has one `Player`, runs `Task`s, returns an `Ending`
- `Player` -> has `Stat` values (private map)
- `Task` (abstract) <|-- `PhysiologicalTask`, `SocialTask`, `SleepTask`, `CodeTask`
- `CodeTask` -> nested interface `Asker`
- `Task` -> throws `TaskBlockedException` (extends `Exception`)
- Enums: `Stat`, `Ending`
