//: Playground - noun: a place where people can play

import UIKit
import Foundation

var x = 0
let y = 1


// Ternary operator
let xyz = (x == 0) ? true : false
print(xyz)

// String interpolation
var str = "Hello"
var name = "Kevin"

print("\(str) \(name == "Kevin"), you are the best!")

// Tuples
let tuple: (first: String, String) = ("name", "kevin")
print(tuple.first)
print(tuple.1)


// Collections

var list = ["Fish", "Potatoes"]
var array = Array<String>()
let array1 = [String]()
array.append("Milk")
array.append("Eggs")

for num in 0 ..< array.count {
    print(array[num])
}

for string in array {
    print(string + " is great!")
}


var jobs = [
    "Kevin" : "Programmer",
    "John" : "Fisherman"
]

print(jobs["Kevin"])

var myDictionary = [String: String]()

// Functions (parameter names used in function, are default function labels... used in function calls, or use _ for no function label)
print(sayHello(to: "Kevin"))
print(sayHello())

func sayHello(to name: String = "Obama") -> String {
    return "\(name) is cool"
}

// Variadic Function
func loop(these: Int...) {
    for num in these {
        print(num)
    }
}

loop(these: 1, 2, 3, 4, 5)

// Functional Programming

func sayHello(name: String) {
    print("Hello \(name)")
}

let mapArray = ["John", "James", "Kobe"]
mapArray.map( {
    (curr_name) in
    sayHello(name: curr_name)
} )

let intArray = [1, 2, 3, 4, 5]
intArray.filter( {
    $0 % 2 == 1
} )

// Optionals (since Swift has compile-time null checking to prevent runtime error, need way to use nulls)
var opt: String?
opt = "Kev"

print(opt)

if let safeName = opt {
    print(safeName)
}

