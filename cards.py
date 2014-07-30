import random
number=[1,2,3,4,5,6,7,8,9,"Ace","King","Queen","Jack"]
color=["Spades","Hearts","Diamonds","Clubs"]
class player(object):
    def __init__(self,color,number):
        self.color=color
        self.number=number
p1=player(color[random.randint(0,3)],number[random.randint(0,12)])
p2=player(color[random.randint(0,3)],number[random.randint(0,12)])
p3=player(color[random.randint(0,3)],number[random.randint(0,12)])
print "First Card is :" ,p1.color,p1.number
print "Second Card is:" ,p2.color,p2.number
print "Third Card is :",p3.color,p3.number
print "Shuffling....."
Result=[False,False,False]
Arr=random.sample(range(1,4),3)
print "The first card is in ?"
guess1=int(raw_input())
if guess1==Arr[0]:
    Result[0]=True
else:
    Result[0]=False
print "The second card is in ?"
guess2=int(raw_input())
if guess2==Arr[1]:
    Result[1]=True
else:
    Result[1]=False
print "The third card is in?"
guess3=int(raw_input())
if guess3==Arr[2]:
    Result[2]=True
else:
    Result[2]=False
print Arr
for item in Result:
    if item==True:
        print "Correct !"
    else:
        print "Sorry Wrong guess :( "
