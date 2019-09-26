# powershell远程登录并调用脚本

## 前提条件：
+ 开启WinRM 服务，不仅启动了 WinRM 服务，还帮我们设置好了防火墙规则
~~~
Enable-PSRemoting –Force    
~~~       
+ #Get-Service WinRM                 #用于查看winrm service 是否开启。
+ #Set-ExecutionPolicy RemoteSigned  #脚本执行策略

# 添加信任
+ 方式一：将待访问主机加入本地信任域
#Set-Item wsman:\localhost\Client\TrustedHosts -value a.b.c.d   
+ 方式二：将待访问主机加入本地信任域 
#winrm quickconfig                                             
#winrm set winrm/config/client '@{TrustedHosts="a.b.c.*"}'

（2）参数：
$uname = "administrator"                                                   #administrator为用户名
$pwd = ConvertTo-SecureString "111111" -AsPlainText -Force;?               #111111为密码
$cred = New-Object System.Management.Automation.PSCredential($uname,$pwd); #创建自动认证对象
$pcname = "192.168.44.129"

（3）方式
方式一：登录（创建远程链接），此时用户相当于在远程链接的主机上直接进行操作（直接输入命令操作）
Enter-PSSession -ComputerName $pcname -Credential $cred 
Get-process       

方式二：通过-scriptblock指令来执行单个命令
Invoke-Command -Credential $cred -ComputerName $pcname  -scriptblock {ipconfig}

方式三：通过-filepath 远程执行脚本
Invoke-Command -Credential $cred -ComputerName $pcname -FilePath C:\runme.ps1  #filepath可以继续执行其他ps脚本

