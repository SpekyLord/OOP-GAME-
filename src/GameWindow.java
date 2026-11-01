/*
 * GameWindow — the Swing GUI (STUB, no code yet). Extends JFrame.
 *
 * Purpose:   Everything the player sees and clicks. Holds NO game rules; it only
 *            calls Game and shows the result.
 * Layout:    NORTH  = day/clock label + 5 status bars (hunger, hydration, energy, motivation, sanity)
 *            CENTER = bedroom panel with clickable objects (bed, phone, desk/laptop, fridge, door)
 *                     and the character sprite showing the current mood
 *            SOUTH  = scrolling message log
 * Behaviour: Clicking an object opens a popup menu of its Tasks (kept in a Map<String, List<Task>>).
 *            Picking one calls Game.run(task). Shows dialogs for code puzzles (via CodeTask.Asker),
 *            the random bathroom pop-up, blocked tasks (TaskBlockedException) and the ending.
 * Talks to:  Game, Task and subclasses, Ending, TaskBlockedException.
 */
