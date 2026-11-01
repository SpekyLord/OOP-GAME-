/*
 * Game — rules, clock and day counter (STUB, no code yet). No UI code, so it is testable.
 *
 * Purpose:   The "engine". Owns the Player, the current day (1..5) and hour (starts 8:00).
 * Planned:   run(Task)         -> performs the task, advances the clock, drains stats over time,
 *                                 rolls over to the next day (sleeping, or passing out at midnight).
 *            period()          -> Morning / Afternoon / Night from the hour.
 *            bathroomUrge()    -> random chance of the forced bathroom pop-up.
 *            bathroom(boolean) -> going is fine; holding it lowers the psychological stats.
 *            isOver()          -> after day 5 or when sanity hits 0 (burned out).
 *            ending()          -> picks GOOD / NEUTRAL / BAD from final stats and work done.
 * Talks to:  Player, Task, Ending, TaskBlockedException.
 */
