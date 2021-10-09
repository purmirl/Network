"""
 DDoS Repository
 Network Programming Platform : Basic UDP Socket Server
 . https://github.com/purmirl/DDoS/src/network-programming-platform/udp_server.py
"""

import socket

# udp server ip address
server_ip_address = ""

# udp server port number, should be converted to integer
server_port_number = ""
server_port_number = int(server_port_number)

# max data size
max_client_data_size = 1024

# make server socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# connect server ip address and server port number (bind)
server_socket.bind((server_ip_address, server_port_number))

# receive client data
client_data, client_ip_address = server_socket.recvfrom(max_client_data_size)

# send server data
server_send_data = ""
server_socket.sendto(server_send_data.encode("utf-8"), client_ip_address)