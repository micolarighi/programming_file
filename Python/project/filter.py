import json

f = open('datasiswa.json', "r")
json_file = json.load(f)

for i in json_file :
    for j in json_file[i] :
        if j < 73 :
           print(i, "tidak lulus")

        else :
            print(i, "lulus")