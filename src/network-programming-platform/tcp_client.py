"""
 DDoS Repository
 Network Programming Platform : Basic TCP Socket Client
 . https://github.com/purmirl/DDoS/src/network-programming-platform/tcp_client.py
"""

import socket

# tcp server ip address
server_ip_address = ""

# tcp server port number, should be converted to integer
server_port_number = ""
server_port_number = int(server_port_number)

# max data size
max_server_data_size = 1024

# make client socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# connect to server
client_socket.connect((server_ip_address, server_port_number))

# send client data to server
client_send_data = ""
client_socket.sendall(client_send_data.encode("utf-8"))

# receive server data
server_data = client_socket.recv(max_server_data_size)