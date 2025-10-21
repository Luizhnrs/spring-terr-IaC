# 🧱 Terraform Setup Guide (Windows)

Este guia explica passo a passo como instalar e configurar o **Terraform** no **Windows**, adicionando-o corretamente ao **PATH** do sistema.

---

## 🚀 1. Baixar o Terraform

````
1. Acesse o site oficial:  
   🔗 [https://www.terraform.io/downloads](https://www.terraform.io/downloads)

2. Na seção **Windows**, baixe o arquivo `.zip` correspondente à sua arquitetura:
   - **Windows 64-bit** → `terraform_x.x.x_windows_amd64.zip`
   - **Windows ARM** (caso utilize) → `terraform_x.x.x_windows_arm64.zip`

3. Após o download, extraia o arquivo `.zip` em uma pasta de sua preferência, por exemplo: 

C:\Program Files\Terraform

````

## ⚙️ 2. Adicionar o Terraform ao PATH

````

Para usar o Terraform de qualquer lugar no terminal, é necessário adicioná-lo ao **PATH** do sistema:

1. Pressione `Win + S` e pesquise por **Editar as variáveis de ambiente do sistema**.  
2. Clique em **Variáveis de Ambiente...**  
3. Em **Variáveis do sistema**, selecione `Path` e clique em **Editar**.  
4. Clique em **Novo** e adicione o caminho da pasta onde o Terraform foi extraído, por exemplo:  

C:\Program Files\Terraform

5. Clique em **OK** em todas as janelas para salvar as alterações.

````

## 🧩 3. Verificar a Instalação

````

Abra o **Prompt de Comando** (`cmd`) ou **PowerShell** e execute:

```bash
terraform -version

````

## ✅ 4. Se tudo estiver correto, será exibida a versão instalada, por exemplo:

````

Terraform v1.9.8
on windows_amd64

````