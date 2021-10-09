"""
 DDoS Repository
 Network Programming Platform : Basic UDP Socket Client
 . https://github.com/purmirl/DDoS/src/network-programming-platform/udp_client.py
"""

import socket

# udp server ip address
server_ip_address = ""

# udp server port number, should be converted to integer
server_port_number = ""
server_port_number = int(server_port_number)

# set server address
server_address = (server_ip_address, server_port_number)

# max data size
max_server_data_size = 1024

# make client socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# send client data to server
client_send_data = ""
client_socket.sendto(client_send_data.encode("utf-8"), server_address)

# receive server data
server_data = client_socket.recvfrom(max_server_data_size)