## Lab 02

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

The answers for this section are to help you record what steps  
are needed to create a file locally (in your cloned repo)  
and push them (sync) with GitHub

1. Add a file for tracking: git add ..
2. Commit changes: git commit
3. Sync local commits with GitHub: git push
4. Sync commits on GitHub to `clone`d repository: git pull

## Part 2 Answers

For each, write the command used or answer the question posed.

1. sudo adduser bfischbach
2. /home/bfischbach
3. Yes, you can can use 'sudo' to gain permissions to add files
4. su bfischbach
5. cd
6. Yes, the user has full permissions in his or her's system
7. exit
8. cd /home/ubuntu

## Part 3 Answers

For each, write the command used or answer the question posed.

1. sudo addgroup crew
2. sudo usermod -aG crew ubuntu
sudo usermod -aG crew bfischbach
3. sudo chown -R ubuntu:crew /home/ubuntu/DirA
sudo chmod -R g+rwx /home/ubuntu/DirA
4. su bfischbach
5. touch ~/DirA/new_file.txt
6. Since bfischbach is a member of the crew and the group has ownership of 'DirA'. bfischbach has the perfissions to create a file.

## Part 4 Answers

For each, write the command used or answer the question posed.

1. sudo touch sudowho.txt
2. read and write for the owner and read only for the group and others
3. sudo vim sudowho.txt

## Part 5 Answers

1. `ssh` command before configuring `config` file: ssh -i 2350key.pem ubuntu@34.206.47.39
2. HostName: 34.206.47.39
3. User: ubuntu
4. IdentityFile: ~/2350key.pem
5. `~/.ssh/config` contents:
 

```
  Host 2350ceg
        HostName 34.206.47.39
        User ubuntu
        Port 22
        IdentityFile ~/2350key.pem
```

6. `ssh` command after configuring `config` file: ssh 2350ceg
