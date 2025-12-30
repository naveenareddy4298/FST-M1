import pytest

@pytest.fixture
def number_list():
    return list(range(0, 11))  # 0 to 10
