package parson;

public class Group {
    public Parson[] arr;
    public int numElem;



    public Group(int size)
    {

        arr=new Parson[size];
        numElem=0;
    }
    public void addParson(String name,String lastName,int age)
    {

            arr[numElem]=new Parson(name,lastName,age) ;

        numElem++;



    }
    public void searchPerson(String searchLastName)
    {
        for(int i=0;i<numElem;i++)
        {
            if(arr[i].getLastName().equals(searchLastName))
            {
                System.out.println("found");
                break;
            }
            else{
                System.out.println("not");
            }
        }



    }
    public void deletePerson(String firstName)
    {

       for(int i=0;i<numElem;i++)
       {if(arr[i].equals(firstName))

       break;

       if (i==numElem)
       {
           System.out.println("not");
       }
       else
       {
           for (int j=i;j<numElem;j++) {
               arr[j] = arr[j + 1];
               numElem--;
               System.out.println("true");
           }

       }

       }


    }
    public void displayParson()
    {

    for (int i=0;i<numElem;i++)
    {
                arr[i].display();
    }
    }
}
