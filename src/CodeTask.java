/*
 * CodeTask — extends Task (STUB, no code yet).
 *
 * Purpose:  Coding puzzles, assignments and studying: multiple-choice "fill in the missing code".
 *           Blocked when energy is 0.
 * Rules:    A few questions per task, picked at random from a List of Puzzle (question, options, answer).
 *           Each wrong answer lowers sanity (and a bit of motivation). Correct answers give nothing
 *           by themselves; sanity is only rewarded when the whole task is finished, and the
 *           player's work-done counter goes up.
 * Design:   Nested interface Asker { int ask(String question, String[] options); } lets the GUI
 *           supply the dialog, so this class stays free of Swing code.
 */
