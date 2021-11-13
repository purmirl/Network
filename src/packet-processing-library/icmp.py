""" https://github.com/purmirl
packet processing library
python scapy
    --> python 3.8.3
    --> scapy 2.4.3
"""

""" ICMP (Internet Control Message Protocol)
"""

from scapy.layers.inet import IP, ICMP
from scapy.sendrecv import send

# set destination ip address (8.8.8.8 google DNS)
destination_ip = "8.8.8.8"

# set data
data = "hello world"

# set ICMP
icmp_packet = IP(dst = destination_ip) / ICMP() / data

# print my ICMP
icmp_packet.show()

# send ICMP
send(icmp_packet)