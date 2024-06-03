#!/bin/bash

while true; do
  # Prompt the user for a number
  read -p "Enter a number (0 to quit): " number

  # Check if the user entered '0' to quit
  if [[ "$number" == "0" ]]; then
    echo "Exiting..."
    break
  fi

  # Check if the number is even or odd using modulo operator (%)
  if (( number % 2 == 0 )); then
    echo "$number is even."
  else
    echo "$number is odd."
  fi
done