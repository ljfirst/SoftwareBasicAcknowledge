# powershellԶ�̵�¼�����ýű�

## ǰ��������
+ ����WinRM ���񣬲��������� WinRM ���񣬻����������ú��˷���ǽ����
~~~
Enable-PSRemoting �CForce    
~~~       
+ #Get-Service WinRM                 #���ڲ鿴winrm service �Ƿ�����
+ #Set-ExecutionPolicy RemoteSigned  #�ű�ִ�в���

# �������
+ ��ʽһ�����������������뱾��������
#Set-Item wsman:\localhost\Client\TrustedHosts -value a.b.c.d   
+ ��ʽ�������������������뱾�������� 
#winrm quickconfig                                             
#winrm set winrm/config/client '@{TrustedHosts="a.b.c.*"}'

��2��������
$uname = "administrator"                                                   #administratorΪ�û���
$pwd = ConvertTo-SecureString "111111" -AsPlainText -Force;?               #111111Ϊ����
$cred = New-Object System.Management.Automation.PSCredential($uname,$pwd); #�����Զ���֤����
$pcname = "192.168.44.129"

��3����ʽ
��ʽһ����¼������Զ�����ӣ�����ʱ�û��൱����Զ�����ӵ�������ֱ�ӽ��в�����ֱ���������������
Enter-PSSession -ComputerName $pcname -Credential $cred 
Get-process       

��ʽ����ͨ��-scriptblockָ����ִ�е�������
Invoke-Command -Credential $cred -ComputerName $pcname  -scriptblock {ipconfig}

��ʽ����ͨ��-filepath Զ��ִ�нű�
Invoke-Command -Credential $cred -ComputerName $pcname -FilePath C:\runme.ps1  #filepath���Լ���ִ������ps�ű�

