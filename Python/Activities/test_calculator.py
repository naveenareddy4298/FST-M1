import calculator

def test_add():
    assert calculator.add(10, 5) == 15

def test_subtract():
    assert calculator.subtract(10, 5) == 5

def test_multiply():
    assert calculator.multiply(10, 5) == 50

def test_divide():
    assert calculator.divide(10, 5) == 2
