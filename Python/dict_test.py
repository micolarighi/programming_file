test = {}
test.update({'pl_1': {'title': 'micola', 'artist':'test'}})
test['pl_2'] = {}
test['pl_2']['title'] = 'swim'
print(test['pl_1']['title'])
print(test['pl_2']['title'])
inp = input('masukkan sesuatu : ')
test[inp] = {}
print(test)