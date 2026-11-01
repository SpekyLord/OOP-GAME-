/*
 * SleepTask — extends Task (STUB, no code yet).
 *
 * Purpose:  Restores energy. Overrides cost() and apply() to behave by time of day:
 *           before noon  = short nap (does not end the day);
 *           noon onward  = sleeps until 8:00 the next day, i.e. the only way to advance the day.
 *           Stats drain slowly while asleep (low drainFactor). isSleep() returns true.
 */
