### C#����powershell�ű�
~~~
public class connect{
    String connectString = "";
    public void connectmethod(){
    	Runspace runspace = RunspaceFactory.CreateRunspace();
    	Pipeline pipeLine = runspace.CreatePipeline();
	runspace.Open();
	try{
		pipeLine.Commands.Add(connectString);
		Collection<PSObject> commandResults = pipeLine.invoke();
		foreach (PSObject cmdlet in commandResults){ 
                	string cmdletName = cmdlet.BaseObject.ToString();
                	System.Diagnostics.Debug.Print(cmdletName);
                	Console.WriteLine(cmdletName);
			}
		}catch(Exception e){
		
		}
    }
}
~~~