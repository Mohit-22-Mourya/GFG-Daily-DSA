# Day 01 — Grid Movement Feasibility

- **Platform:** GeeksforGeeks
- **Language:** Java
- **Topic:** Simulation, Coordinate Tracking
- **Difficulty:** To be verified
- **Status:** Solved

## Approach

1. Start from coordinate `(0, 0)`.
2. Process each character in the movement string:
   - `L`: Move left.
   - `R`: Move right.
   - `U`: Move up.
   - `D`: Move down.
3. Track the minimum and maximum row and column coordinates visited.
4. Calculate the total span in both dimensions.
5. If both spans fit within the grid dimensions `n × m`, return `true`; otherwise, return `false`.

## Key Observation

The required number of rows is:

`maxRow - minRow + 1`

The required number of columns is:

`maxCol - minCol + 1`

Therefore, the path fits if:

- `maxRow - minRow < n`
- `maxCol - minCol < m`

The starting position can be shifted within the grid, so the path does not have to remain anchored at `(0, 0)`.

## Complexity Analysis

- **Time Complexity:** `O(|s|)` — each movement is processed once.
- **Auxiliary Space Complexity:** `O(1)` — only a fixed number of variables are used.

## Learning

Learned how coordinate tracking and bounding ranges can determine whether a movement path fits inside a rectangular grid without simulating every possible starting position.

## Solution

See [`Solution.java`](Solution.java).
