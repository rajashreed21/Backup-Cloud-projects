#!/bin/bash

# Infinite loop to keep asking for user input
while true; do
  # Prompt the user to enter a number
  read -p "Enter a number (or '0' to exit): " number
  
  # Check if the input is '0'
  if [ "$number" -eq 0 ]; then
    echo "Exiting the program."
    break  # Break the loop and exit the program
  fi
  
  # Check if the number is even or odd using modulo
  if [ $((number % 2)) -eq 0 ]; then
    echo "$number is Even."
  else
    echo "$number is Odd."
  fi
done