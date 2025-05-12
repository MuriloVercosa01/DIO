<h1>Criando uma instância gerenciada de SQL no azure pelo portal</h1>
<h3>requisitos:</h3>
<ul>
  <li>Uma assinatura do Azure, caso não tenha, crie uma conta gratuita</li>
  <li>O módulo Az.SQL mais recente para a versão atual do PowerShell ou a versão mais recente da CLI do Azure.</li>
</ul>
<h3>Passo-a-passo</h3>
<ol>
  <li>Entre no portal do Azure</li>
  <li>À esquerda selecione o servilço <strong>SQL do Azure</strong></li>
  <li>Clique em criar, para abrir a página de seleção da opção de implantação do SQL</li>
  <li>Selecione <strong>mostrar detalhes</strong>, escolha instância única para abrir a página de criar instância gerenciada de SQL Azure</li>
  <li>
    <dl>
      <dt>Guia básico</dt>
      <dd>
        <ul>
          <li>Preencha as <strong>informações obrigatórias</strong> exigidas na guia Básico, que é o requisito mínimo para provisionar uma Instância Gerenciada de SQL.
          </li>
          <li><strong>Assinatura:</strong> Sua assinatura</li>
          <li><strong>Grupo de recursos:</strong> Um grupo de recursos novo ou existente.</li>
          <li><strong>Nome da instância gerenciada:</strong> Qualquer nome válido.</li>
          <li><strong>Região:</strong> A região na qual você deseja criar a instância gerenciada.</li>
          <li><strong>Pertence a um pool de instâncias?</strong> Sim para que essa instância seja criada dentro de um pool de instâncias.</li>
          <li><strong>Método de autenticação: </strong>Usar a autenticação do SQL(Para fins deste guia de início rápido, use a autenticação SQL.)</li>
          <li><strong>Logon de administrador da Instância Gerenciada: </strong>Qualquer nome de usuário válido.</li>
          <li><strong>Senha:</strong> Qualquer senha válida</li>
        </ul>
      </dd>
    </dl>
  </li>
</ol>
