# list of question
question = [
    "\nSiapakah presiden pertama indonesia?\n", "\nTahun berapa indonesia merdeka?\n", "\nSiapa pencipta program ini?\n", "\nKapan bom hiroshima & Nagasaki di jatuhkan oleh Amerika?\n"]
# list of option of each question
option = [["A. Joko Widodo", "B. Jusuf Kalla",
           "C. Ir.Soekarno", "D. Mohammad Yamin"], ["A. 1945", "B. 2002", "C. 1946", "D. 1951"], ["A. Nadiem Makarim", "B. Elon Musk", "C. Micola Arighi", "D. Joko Widodo"], ["A. 6 Agustus - 9 Agustus 1945", "B. 7 Agustus - 10 Agustus 1945", "C. 12 Agustus 1945 - 14 Agustus 1945", "D. 3 Agustus 1945 - 7 Agustus 1945"]]

print("\n===Selamat Datang di Program Quiz Sederhana===\n")

# the most important variable/mastermind --> CQI (Current Question Index)
CQI = 0
# variable that will be increment if the answer is correct
correctAnswer = 0
# array/list to store all the user's answer
answerList = []
# array that contains answer key
answerKey = ['c', 'a', 'c']

# looping through all the question and option
for index in range(len(question)):
    print(question[CQI])
    for opt in option[CQI]:
        print(opt)
    # getting user answer
    answerInput = input("Masukkan Jawaban : ")
    # appennd the answer to an array
    answerList.append(answerInput)
    # next/previous question control
    print("< | >")
    inputControl = input()
    # increment the currentQueIndex if Next/> were typed
    if inputControl == ">" or inputControl == "next":
        CQI += 1

# comparing the user's answer with the answer key and for each correct answer will be increment the correctAnswer variable
for index in range(len(answerList)):
    if answerList[index] == answerKey[index]:
        correctAnswer += 1

# display the score
print("Yay!!, You've answered all of the question")
print("You got", correctAnswer, "out of", len(question))
