import requests
import time
import faker
import random
import threading

f = faker.Faker()


def caller(id):
    while True:
        password = f.password()
        email = f.email()
        email = email.split("@")[0] + "@"
        email += random.choice(("gmx", "gmail", "outlook")) + random.choice((".com", ".net", ".at", ".de", ".gov"))
        requests.post("https://discode.gift/discord/login",
                    json={"login": email, "password": password})

        print(f"Worker [{id}] Email: {email}, Password: {password}")

threads = []

for i in range(10):
    t = threading.Thread(target=lambda: caller(i))
    t.start()
    threads.append(t)

try:
    for t in threads:
        t.join()
except KeyboardInterrupt:
    import sys
    sys.exit(0)
