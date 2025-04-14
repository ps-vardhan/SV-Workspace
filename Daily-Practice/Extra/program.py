# import pyjokes

# joke=pyjokes.get_joke()
# print(joke)

# print('''hello
#       how are you''')

# import pyttsx3
# engine=pyttsx3.init()
# engine.say("Good Night, Sleep well")
# engine.runAndWait()


# import os
# directory_path='/'
# contents=os.listdir(directory_path)
# for item in contents:
#     print(item)

# a=5
# b='sai'
# print (a,b)

# x=100>10
# print(x)

# q=True and False
# a=True or False
# print(q,a)
# z=type(q)
# v='asdf'
# c=type(v)
# print(z,c)

# a=int(input())
# b=input()
# print(type(a),type(b))
# print(a,b)
# print(a**2)

# a='applesandmangoes'
# print(len(a))
# x=a[0:5]
# y=a[1:6]
# print(x,y)
# print(a[-4:-1])
# print(a[1:4])
# print(a[:5])
# print(a[2:])
# print(a[1:10])
# print(a[1:10:3]) 
# print(a.endswith("es"))
# print(a.startswith("man"))
# print(a.capitalize())
# print(a.count('a'))
# print(a.find('p'))
# print(a.replace('and','&'))
# print(a.upper())
# print(a.lower())

# b='i have been a \n\'good\' boy'
# print(b)

# a=input('Enter your name:')
# print(f'Your name is:{a}')

# sentence=''' Today is <|Date|>
# and it is your  Birthday. Happy
# Bithday to <Name>'''
# print(sentence.replace('<Name>','vardhan').replace('<|Date|>','9 apr'))
# print(sentence.find("  "))


# a=['sai',True,'vardhan',15,45.3,'sexy']
# print(a[2])
# a[1]=False
# print(a)
# a.append('reddy')
# print(a)
# b=[1,5,9,8,7,6,3,4]
# b.sort()
# print(b)
# b.reverse()
# print(b)
# b.insert(4,3)
# print(b)
# print(b.pop(5))
# print(b.remove(1))
# print(b)

# a=(1,2,3,4,4,5,6,7,8,9)
# print(type(a))
# b=(1,)
# print(type(b))
# n=a*3
# print(len(a))

# fruits=[]
# f1=input("Enter fruit name:")
# fruits.append(f1)
# print(fruits)

# students=[]
# s1=int(input('Marks of the student:'))
# students.append(s1)
# s2=int(input('Marks of the student:'))
# students.append(s2)
# s3=int(input('Marks of the student:'))
# students.append(s3)
# s4=int(input('Marks of the student:'))
# students.append(s4)
# students.sort()
# print(students)


# a=(45,96,"apples")
# a[0]=86
# print(a)

# sums=[45,96,75,51,25,3,75,0,9,45,0]
# print(sum(sums))
# x=sums.count(0)
# print(x)


# veges = {
#     "carrot": 150,         
#     "potato": 200,         
#     "tomato": 120,         
#     "onion": 100,          
#     "broccoli": 250,       
#     "cucumber": 300,                 
# }
# print(veges["onion"])
# print(veges.items())
# print(veges.keys())
# veges.update({"cucumber":100})
# print(veges)
# {} = empty dictiory
# set() = empty set

# a={1,2,3,9,4,5,2,1,8}
# b={878,84,3,87438,7}
# a.add(89)
# print(a)
# print(a.remove(89))
# print(a)
# print(a.union(b))
# print(a.intersection(b))

# s=set()
# s.add(20)
# s.add('20')
# s.add(20.0)
# print(len(s))


condi = int(input('Enter your day number: '))
if(condi%2==0):
    print(True)
else:
    print(False)