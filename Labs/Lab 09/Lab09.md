## Lab 09

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

- Make sure infinity is in your Lab09 folder in GitHub

## Part 2 Answers

1. Getting started
   - Command to find the PID:
   - PID of "Terminal A": 1236
   - PID of "Terminal B": 1318
2. Using `./` to run `infinity` in Terminal B
   - PID of script: 1409
   - Command to kill script: kill 1409
   - Effects of running the script: you cannot use the command line if the script is running
3. Using `source` to run `infinity` in Terminal B
   - PID of script: 1318 - Same PID as the terminal
   - Command to kill the script: kill -9 1318
   - Effects of killing the script: When the script was killed so was the SSH connection. When doing a new ssh the PID of the terminal changes.
4. Running `infinity` as a background job in Terminal B
   - Command to run script in background: ./infinity &
   - Job ID of script: 1
   - PID of script: 1684
   - Command to kill script via job id: kill %1 
   - Effects of exiting terminal: If the terminal is closed then it will not be running when the terminal is opened again.
5. Run `infinity` in a `screen` or `tmux` session
   - Command(s) to run `infinity` in a screen session: -S test-session then run ./infinity
   - Detach from `screen` / `tmux` session: ctrl + a + d
   - Command to show `screen` / `tmux` sessions: screen -ls
   - Effects of exiting terminal: The screen is still running because it is not connected to this ssh terminal
   - Command / steps to kill the `screen` / `tmux` session: type k and type y when prompted to kill.

## Part 3 Answers

1. git branch updates
2. git checkout updates
3. vim infinity and add comments using #
4. git add infinity | git command | git push --set-upstream origin updates
5. Confirmed? yes, it is updated in uptades with comments
6. git checkout main
7. git merge updates
8. git push
9. Confirmed? Yes, the comments transfered over to the infinity file in the main branch
10. git status - says that your branch is up to date with origin/(branch)
