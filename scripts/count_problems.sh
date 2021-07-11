#!/usr/bin/env sh

PROBLEMS=$(find ../src/main/kotlin -type f -name "Main.kt" | wc -l | xargs)

echo "You have solved $PROBLEMS problems so far, keep going!"
