## Lab 07

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

1. Download an ISO:
    - Linux distribution: linux-version other(64-bit)
    - URL to download it: https://ubuntu.com/download/desktop
2. Virtual Machine configurations:
    - RAM - 1.9 Gib
    - CPU - 6 Cores
    - Disk size - 26.8 GB

![Screenshot of Summary](![image](https://github.com/Fischbach23/CEG2350/assets/89490140/7590900a-c646-447a-b2f1-fc8c67968f4d)


3. Install Guest OS:
    - Start installation: I downloaded the ubuntu Iso file from the ubuntu website.
    - Disk to install to: `C:\Users\30bla\Downloads\ubuntu-22.04.3-desktop-amd64(1).iso`
    - Partition size: 25 GiB
    - Partition filesystem: squashfs
4. Remove installation media:
    - How to remove: go to settings, click on storage, click remove.
    - How to verify: relaunch the vm and see if it failed.
5. Guest Additions:
    - How to insert Guest Additions: go to settings | storage | add a controller | add Guest Additions
    - How to run the Guest Additions installer for your Guest Operating System: click devices | insert Guest Additions CD Image
    - How to change resolution of the VM: Once Guest Additions are installed, go to the VM window's "View" menu and select "Virtual Screen 1" to choose a resolution
6. VM Control:
    - Turning on the VM: click on start | let it load | log in
    - Turning off the VM: click the top right corner | click "Power off/ Log Out | click power off
    - Restarting the VM: click start 
7. Proof of your VM running your Guest OS:

![Screenshot with name in file]("![Screenshot 2023-12-08 210727](https://github.com/Fischbach23/CEG2350/assets/89490140/eec7eda3-092a-4e9f-bcf6-108307d8ebfe)")


## Part 2 Answers

1. How to change your desktop background in your VM: I clicked in the top right corner of my Vm, went to settings, background and then picked one of the options.
2. How to install VSCode in your VM: I went to the ubuntu app store and installed VsCode through it.
3. How to connect to your AWS instance from your VM using `ssh`: I went to aws academy and downloaded the pem file, copied the contents and pasted it in a file called ceg2350-key.pem, I then used the command ssh -i ceg2350-key.pem ubuntu@3.212.42.61 to ssh into my aws instance.
