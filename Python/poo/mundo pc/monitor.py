class Monitor(object):
    id = 0; 
    
    def __init__(self):
        Monitor.id += 1; 
        self.contador_monitor = Monitor.id;
    
    def __str__(self):
        return f"""***MONITOR****
            -Id:{self.id}
            -Estado:{super().__str__()}
        """