from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """
    
    ## called in username and password since we are calling them in
    ## I could have hard coded the username and password in but that would not be as
    ## dynamic since we would have to change the code every time to access the database
    def __init__(self, username, password):
        # Initializing the MongoClient. This helps to 
        # access the MongoDB databases and collections. 
        self.client = MongoClient('mongodb://%s:%s@127.0.0.1:51717/AAC' %(username,password))
        # where xxxx is your unique port number
        ## Set the project to AAC since I was having issues to make it work
        self.database = self.client['AAC']

    # Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:
            ## inserts our data into the database animals
            dataInsert = self.database.animals.insert(data)  # data should be dictionary 
            ## returning our data insert
            return dataInsert
        else:
            raise Exception("Nothing to save, because data parameter is empty")

# Create method to implement the R in CRUD.
    def read(self, dataSearch):
        if dataSearch is not None:
            data = self.database.animals.find(dataSearch,{"_id": False})        
        else:
            data = self.database.animals.find({},{"_id": False})
        
        return data
    
    
    ## tried to make the update function by following a few tutorials but I am going to keep looking into it
    def update(self, query, data):
        if data is not None:
            updateData = self.database.animals.update_one(query, data)
        else:
            return "Nothing to save, because data parameter is empty"
     
    ## tried to make the delete function by following a tutorial have not had a chance to test it to see if it's working
    def delete(self, data):
        if data is not None:
            deleteData = self.database.animals.delete_one(data)
            return deleteData
        else:
            raise Exception("Nothing to save, because data parameter is empty")