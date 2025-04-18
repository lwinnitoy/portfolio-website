import doctest

def print_whale():
    """Whale by Riitta Rasimus
    https://www.asciiart.eu/animals/fish
    prints out askii art of a whale
    """
    print('       .                  ')
    print('      ":"                 ')
    print('    ___:____     |"\/"|   ')
    print("  ,'        `.    \  /    ")
    print('  |  O        \___/  |    ')
    print('~^~^~^~^~^~^~^~^~^~^~^~^~ ')     
 
 
def print_moose():
    """
    https://www.asciiart.eu/animals/moose
    prints out askii art of a moose
    """
    print('         \\_//  ')
    print('        __/".   ')
    print('      /__ |    ')
    print("     '|| ||    ")
    
    
def print_logo():
    """print two copies of the whale and moose askii art in alternating order
    """
    print("/~~~~~~~~\\")
    print_whale()
    print("/~~~~~~~~\\")
    print_moose()
    print("/~~~~~~~~\\")
    print_whale()
    print("/~~~~~~~~\\")
    print_moose()
    print("/~~~~~~~~\\")
    
    
def calculate_surface_area(hieght: float, diameter: float):
    """takes the diameter and hieght and prints out the surface area of a 
    cylidar
    >>> calculate_surface_area(1.2, 3.5)
    cylindar area: 32.4
    >>> calculate_surface_area(4.9, 6.2)
    cylindar area: 155.7

    """
    pie = 3.14
    circumference = diameter * pie
    area_on_top = 2*(pie * (diameter/2)**2)
    area_of_walls = hieght * circumference
    cylindar_area = area_on_top + area_of_walls
    
    print(f'cylinder area: {cylindar_area:.1f}')