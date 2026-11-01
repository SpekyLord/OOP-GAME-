/*
 * Task — ABSTRACT parent of everything the student can do (STUB, no code yet).
 *
 * OOP pillars: ABSTRACTION (abstract class) and POLYMORPHISM (each subclass overrides apply()).
 * Planned:     fields (private): name, hours, needsEnergy.
 *              perform(Player, hourNow)  -> final template method: if needsEnergy and energy == 0,
 *                                           throw TaskBlockedException; otherwise call apply().
 *              protected abstract apply(Player, hourNow) -> subclass-specific effect, returns a message.
 *              cost(hourNow)  -> hours the task takes (SleepTask overrides it).
 *              drainFactor()  -> how fast stats drain during it (sleep drains less).
 *              isSleep()      -> true only for SleepTask.
 * Subclasses:  PhysiologicalTask, SocialTask, SleepTask, CodeTask.
 */
