class Something:
    @require(lambda self, x: self.y < x)
    def do_something(self, x: int) -> int:
        pass


__version__ = "dummy"
__xml_namespace__ = "https://dummy.com"
