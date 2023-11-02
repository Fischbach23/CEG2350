## Lab 08

- Name:Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

1. Disks: sda, sbd
2. Unpartitioned disk: sbd
3. `gdisk` main menu options
   - `p` - print the table
   - `o` - create a new table
   - `n` - create new partition
   - `i` - show information abount a selected partition
   - `w` - write the changes of the partition table
4. Using the `gdisk` utility on the disk: sudo gdisk /dev/sdX
5. sudo mkfs.ext4 /dev/sdX1
6. sudo mkdir/mnt/expanse
7. sudo mount /dev/sdX1 /mnt/expanse
8. Skip - trust you to do it ;)
9. readable text in the binary data
10. included parts of the content that I delted
11. 
12. no

## Part 2 Answers

1. nano original.txt
2. For `original.txt` 
   - Command to find the following info about `original.txt`: stat original.txt
   - inode number of `original.txt`: 9570149208337032
   - number of blocks storing `original.txt`: 0
   - number of links to `original.txt`: 1
3. Command to create a hard link to `original.txt`: ln -P original.txt hardlink.txt
   - What identifiers indicate a hard link was created? If both files have the same inode number and a link count of 2 or more
   - Does modifying the hard linked file modify `original.txt`? Explain Yes, all of these entries point to the same data blocks on the disk.
4. Command to create a symbolic link to `original.txt`: ln -s original.txt symlink.txt
   - What identifiers indicate a symbolic link was created? an "l" in the permissions column and the target file's path in the listing
   - If `original.txt` was deleted, and a new `original.txt` was created, would the sym link still work? Explain: It would just point to a new file. It does not matter the name of the file.
5. Command to create a copy of `original.txt`: cp original.txt copy.txt
   - Does modifying the copied file modify `original.txt`? Explain: No, It would only impact the new copy.
6. Command to move `original.txt` to another directory.: mv original.txt /path/to/another/directory/
   - Does it have the same inode? Explain: Yes, because the file is still in the same file system.
   - Was the hard link you created affected? Explain: No, the hard links are based off the inode number
   - Was the symbolic link you created affected? Explain: No, because the file stayed in the same filesystem.

## Extra Credit Answers

Line added to `/etc/fstab`:

```
Insert line here
```
