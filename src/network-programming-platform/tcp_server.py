"""
 DDoS Repository
 Network Programming Platform : Basic TCP Socket Server
 . https://github.com/purmirl/DDoS/src/network-programming-platform/tcp_server.py
"""

import socket

# tcp server ip address
server_ip_address = ""

# tcp server port number, should be converted to integer
server_port_number = ""
server_port_number = int(server_port_number)

# max data size
max_client_data_size = 1024

# make server socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# anti WinError 10048 (using port error)
server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)

# connect server ip address and server port number (bind)
server_socket.bind((server_ip_address, server_port_number))

# listen (connection request waiting)
server_socket.listen()

# accept connection request
client_socket, client_ip_address = server_socket.accept()

# receive client data
client_data = client_socket.recv(max_client_data_size)

# send server data
server_send_data = ""
client_socket.send(server_send_data.encode("utf-8"))

# close server socket
server_socket.close()

