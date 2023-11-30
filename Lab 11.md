## Lab 11

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

1. Hostname of the device: HP-FISCHBACH
2. MAC address of the NIC connected to the network: 18-26-49-3F-92-E2
3. IP address: 130.102.224.157
4. Subnet mask: 255.255.252.0
5. Gateway address: 130.108.224.1
6. DHCP server address: 192.168.151.43
7. DNS server address: 130.108.128.200
8. Public IP used for communications outside subnet: 130.108.224.157

## Part 2 Answers

1. `tcpdump` command:

   - How many packets were captured? 2852 
   - Looking through the output, what traffic are you seeing? most is SSH related

2. Fancy `tcpdump` command: tcpdump -i eth0 -A 'host www.google.com'

3. Capturing `google.com` traffic:
   - Was there a difference in output from `curl` when using `http` or `https`? It looks the same but there could be some small differences that are hard to find.
   - Was there a difference in packet content in `tcpdump` when using `http` or `https`? https recieved and captured more
   - What caused the difference? https is secure so it has to go through more endpoints.
4. Save capture to a file: sudo tcpdump -i eth0 -w dump.pcap icmp
   Read capture from a file: sudo tcpdump -r dump.pcap
   Don't forget to `commit` and `push` your capture to your `Lab11` folder.

## Part 3 Answers

1. Command(s) to install `python3` and `pip3`:
2. Run web server with `index.html` contents in your folder:
3. Confirm content is being served:
   - Using `localhost`:
   - Using the system's private IP:
   - Using the system's public IP:
4. What's playing?
5. Command to show `LISTEN`ing processes:
6. Command to `kill`:
