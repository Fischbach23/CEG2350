## Lab 12

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers:

1. `tar` options:
   - `-c` creates a new archive.
   - `-v` displays the names of files being processed.
   - `-f` specifies the filename of the archive.
   - `-z` compress or decompress the archive.
   - `-x` xtract files from an archive.
2. Command(s): `tar -cvzf my_archive.tar.gz my_folder`


## Part 2 Answers:

1. Command: sftp -i /home/blocka23/ceg2350.pem ubuntu@34.206.47.39
2. `sftp` options:
   - `ls` list the contents of the current remote directory
   - `lls` lists files and directories in the current directory
   - `put` upload files from the local machine to the remote server
   - `get` used to download files from the remote server to the local machine
3. Command(s): `sftp -i /home/blocka23/ceg2350.pem ubuntu@34.206.47.39`
               `get tarfile.tar.gz`
4. Command(s): `tar -xvf tarfile.tar.gz`

## Part 3 Answers:

1. `sudo adduser Fischbach2350`
2. `ssh-keygen | this was on the local system`
3. `opy the public key that we made and paste it into the new users authorized_keys file that we made for them in the .ssh folder`
4. `ssh -i /path/new_key_pair.pem Fischbach2350@34.206.47.39`

## Part 4 Answers

1. Translate to network prefixes + CIDR notation:
   - Sample: `10.0.0.0 - 10.0.1.255` = `10.0.0.0/23` OR `10.0.1.0/23`
   - `130.108.0.0 - 130.108.255.255` = `130.108.0.0/16`
   - `10.0.0.0 - 10.0.0.255` = `10.0.0.0/25`
   - `your_public_ip - your_public_ip` = `130.108.227.216/32`
2. How you confirmed current rules are bad, and why are they bad: The current rules are that any IP can acess the system from anywhere. If someone was able to access my private key and had the right IP then they could get into ubuntu instance.
3. Your implementation details and **screenshot** ![image](https://github.com/Fischbach23/CEG2350/assets/89490140/e4964a94-b331-47ab-84d8-959ea2010ffd)
4. Something invalid: 131.0.10.269

## Extra Credit Answers:

### Solve the conflict

1.
2.
3.
4.
5.
