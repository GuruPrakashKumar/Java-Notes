import math
from functools import reduce

# Function to compute LCM of two numbers
def lcm(x, y):
    return x * y // math.gcd(x, y)

# Function to compute LCM of a list of numbers
def lcm_of_list(numbers):
    return reduce(lcm, numbers)

# List of numbers
# numbers = [48, 60, 72, 108, 140]
# numbers = [12,15,20,27]
# numbers = [6,7,8,9,12]
numbers = [12,15,18,27]
# numbers = [20,25,35,40]

# Calculate LCM
print(lcm_of_list(numbers))