# **Introdução à Computação em Nuvem: Conceitos e Modelos**

O conteúdo aborda os fundamentos da computação em nuvem, explicando sua evolução, modelos de serviço e considerações de custo. A precificação na nuvem é baseada no consumo, com valores que variam conforme a localidade devido a diferentes impostos.

### Evolução da Computação

A computação em nuvem surgiu como evolução dos datacenters tradicionais. Inicialmente, empresas precisavam manter salas com servidores físicos, o que era caro e limitado. Com a virtualização, tornou-se possível emular várias máquinas em um único servidor. A nuvem representa o próximo passo, onde grandes empresas como Microsoft, Amazon (AWS) e Google oferecem serviços de infraestrutura virtualizada pela internet.

### Vantagens da Nuvem

- Criação rápida de recursos através de um portal na internet
- Modelo de pagamento baseado no consumo (self-service)
- Eliminação da necessidade de orçamentos e compras de hardware
- Disponibilidade imediata de recursos (em segundos, dependendo do tipo)
- Capacidade de criar ambientes em diferentes localizações geográficas

### Modelos de Nuvem

**Nuvem Privada:**

- Ambiente em nuvem dentro do próprio datacenter da organização
- Organização é responsável por toda operação e manutenção
- Recursos não são compartilhados com outras organizações

**Nuvem Pública:**

- Serviços fornecidos por um provedor (como Microsoft Azure)
- Recursos compartilhados entre diversas organizações
- Mesmo portal e interface para todos os clientes
- Acesso através de conexão segura pela internet

**Nuvem Híbrida:**

- Combinação do modelo on-premises com nuvem pública
- Comunicação entre ambientes privados e públicos
- Considerada "o melhor dos dois mundos"

Há também o modelo multi-cloud (não abordado em detalhes), onde uma empresa utiliza serviços de múltiplos provedores de nuvem simultaneamente.

# **Benefícios da Computação em Nuvem: Governança e Gerenciabilidade**

Este é um trecho educacional sobre dois benefícios importantes da computação em nuvem: governança e gerenciabilidade. O conteúdo explica como esses conceitos funcionam e sua importância para organizações que utilizam serviços na nuvem.

### Governança na Nuvem

A governança na nuvem refere-se à gestão de recursos e implementação de padrões corporativos:

- Não está relacionada a governo, mas sim à gestão de recursos e padrões
- Permite que empresas sigam padrões específicos exigidos pela indústria (ex: setor farmacêutico)
- Possibilita auditorias para monitorar quem fez o quê e quem tem acesso a determinados recursos
- Sinaliza recursos fora de conformidade e oferece estratégias de mitigação
- Caminha junto com segurança, mas foca em padrões corporativos e requisitos regulatórios
- Permite bloquear criação de recursos em regiões específicas
- Algumas empresas têm equipes dedicadas de TI apenas para governança

### Gerenciabilidade na Nuvem

A gerenciabilidade refere-se às diferentes formas de criar e gerenciar recursos:

- Oferece múltiplas interfaces para gerenciamento: portal web, linha de comando, APIs, PowerShell
- Suporta ferramentas como Visual Studio Code, Terraform, Ansible e GitHub
- Facilita a criação de recursos para usuários com diferentes níveis de habilidade
- Permite automação para implantações em larga escala
- Reduz erros humanos em implantações complexas
- Possibilita o uso de modelos pré-configurados (ARM, BICEP, arquivos JSON)

### Recomendações para Aprendizado

Para quem está começando com computação em nuvem:

- Não pular etapas no aprendizado
- Iniciar pelo portal para entender os recursos disponíveis
- Progredir gradualmente para métodos baseados em código
- Entender que um profissional de nuvem precisa dominar mais que apenas o portal

# **Tipos de Serviço de Nuvem: IaaS, PaaS e SaaS** 

Este é o último tópico do módulo 1 da formação Z900, focando nos conceitos fundamentais de serviços de nuvem e o modelo de responsabilidade compartilhada. O conteúdo explica os três principais tipos de serviços de nuvem: Infraestrutura como Serviço (IaaS), Plataforma como Serviço (PaaS) e Software como Serviço (SaaS).

### Conceitos Gerais

Os modelos de serviço de nuvem seguem padrões gerais que se aplicam a todos os provedores de nuvem, não apenas à Microsoft. As diferenças entre provedores estão geralmente nos nomes dos recursos e produtos específicos oferecidos, mas os conceitos básicos permanecem os mesmos.

### Infraestrutura como Serviço (IaaS)

O IaaS é o modelo onde o cliente tem maior controle e responsabilidade. Características principais:

- Cliente se envolve mais na configuração, monitoramento e backup
- Oferece maior acesso e liberdade para personalização dos recursos
- Requer configuração detalhada (ex: máquinas virtuais exigem definição de assinatura, grupo de recursos, rede, etc.)
- Atualizações e monitoramento são responsabilidades do cliente
- Permite criar infraestrutura de TI pagando conforme o uso

### Plataforma como Serviço (PaaS)

O PaaS representa um nível intermediário de responsabilidade compartilhada:

- Cliente não precisa se preocupar com o sistema operacional ou infraestrutura subjacente
- Foco na aplicação e nos dados, não no servidor
- Exemplo: usar um banco de dados sem gerenciar o servidor que o hospeda
- Ideal para ambientes de teste, produção ou desenvolvimento de aplicativos

### Software como Serviço (SaaS)

O SaaS é o nível mais alto de abstração com menor responsabilidade para o cliente:

- Aplicações já existem e estão prontas para uso
- Exemplos incluem Microsoft Teams e Microsoft 365
- O acesso a recursos e funcionalidades é determinado pelo modelo de licenciamento
- Cliente apenas configura grupos de usuários e configurações específicas
- Não há preocupação com servidores, memória ou recursos subjacentes

### Comparação de Responsabilidades

À medida que se avança de IaaS para SaaS:

- Diminui a responsabilidade do cliente
- Reduz a necessidade de monitoramento e manutenção contínua
- Diminui a carga de trabalho para equipes de TI
- Oferece menos flexibilidade de personalização

A escolha entre estes modelos deve ser baseada nas necessidades específicas de cada organização e nas responsabilidades que se deseja assumir.
