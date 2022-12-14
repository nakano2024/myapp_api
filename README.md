<h2>訴訟ごっこ.net</h2>

<h3>概要</h3>
<div>
訴訟ごっこ.netは、ユーザー同士のディベートや論争に特化した、裁判形式の掲示板サービスです。
</div>

<h3>URL</h3>
<div>https://www.sosho-gokko.kn-portfolio.net</div>

<h3>テストアカウント</h3>
<ul>
  <li>メールアドレス：taro1999@kn-portfolio.net</li>
  <li>パスワード：P4ifRwQs</li>
</ul>

<h3>フロント部分</h3>
<div>https://github.com/nakano2024/myapp_front</div>

<h3>制作背景</h3>
<div>一般的なコミュニティで疎外されがちなユーザー同士の論争を、専ら建設的に行えるようなサービスを提供したいという思いから制作に至りました。</div>

<h3>工夫した点</h3>
<div>
最も工夫した点は、ユーザー同士が建設的な議論を行える場所となるよう心掛けたことです。</br>
その為に、議題、争点の明確化やスレッド主による「どちらの主張が支持できるか」の評決の導出といった、裁判形式の手続きを行うような仕様になっております。</br>
また、スレッド主による迷惑ユーザーに対するブロック機能なども工夫点の一つです。</br>
以上のように、ユーザー同士が建設的な議論を行える場となるように工夫を施しました。
</div> 

<h3>機能</h3>
<ul>
  <li>ログイン/ログアウト</li>
  <li>スレッド投稿</li>
  <li>レス返信</li>
  <li>スレッド主による特定のユーザーのブロック</li>
  <li>スレッド主による評決</li>
  <li>スレッド検索</li>
  <li>投稿したスレッドの一覧</li>
  <li>管理者ユーザーによるスレッド・レスの削除</li>
  <li>管理者ユーザーによる特定のユーザーに対する一部の機能の利用停止処分</li>
</ul>

<h3>使用技術</h3>
<div>Java、Spring Boot、JavaScript、React.js、MySQL、AWS</div>

<h3>使用手順</h3>

<h4>スレッド投稿</h4>
<div>
  <p>
    スレッドの投稿は、トップページ右下にある+ボタンの押下によって出現するフォームから行います。<br/>
    フォームの項目は、<strong>議題の概要</strong>、<strong>争点</strong>、争点に対する<strong>赤と青のポジション</strong>です。
  </p>
  <p>
   （例）<br>
    議題の概要：〇〇について<br>
    争点：賛成か反対か<br>
    赤のポジション：賛成<br>
    青のポジション：反対
  </p>
</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208531440-bb16f9da-e787-4b79-9330-12ffea53c131.mp4 /></div>

<h4>レス返信</h4>
<div>
  レスの返信は、各スレッド下部のフォームから行います。<br>
  フォームの項目は、議題に対する<strong>自分のポジション</strong>と<strong>主張内容</strong>です。
</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208532608-4d25260d-24f7-405c-a35e-f80f4fdc2062.mp4 /></div>

<h4>スレッド主による特定のユーザーのブロック</h4>
<div>
  スレッド主は、各レスに表示されるブロックボタンから、特定のユーザーをブロックすることができます。
</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208533404-2aedff8a-52b4-467d-8acd-f4d956864c34.mp4 /></div>
<div>ブロックされたユーザーは、当該スレへのレスの返信ができなくなります。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208537606-ebc58a39-72a1-414c-9030-ee61fb7c26b8.mp4 /></div>

<h4>スレッド主による評決</h4>
<div>
  スレッド主は、レスの返信フォームの最下部から評決を下すことができます。<br/>
  評決に至った理由を添えることも可能です。</br>
  評決を下されたスレッドは、自動的に閉鎖されます。
</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208537803-86300c07-0356-41a2-ad8d-afbdddd882a3.mp4/></div>

<h4>スレッド検索</h4>
<div>上部検索フォームから、キーワードによるスレッド検索を行うことができます。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208538929-c491e05a-e929-4ee5-a574-12abeb8cf5f7.mp4 /></div>

<h4>投稿したスレッドの一覧</h4>
<div>ユーザーは、自身が投稿したスレッドを一覧表示させることができます。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208611209-0baceec6-673c-43c5-ae85-993351ccecf6.mp4 /></div>

<h4>管理者ユーザーによる特定のユーザーに対する一部機能の利用停止処分</h4>
<div>管理者ユーザーは、右上のAdminボタンから、特定のユーザーに対する一部機能の利用停止処分を下すことができます。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208539497-0d46a6a9-51de-4f45-899e-7ccfc7ac0639.mp4 /></div>

<div>当該処分を下されたユーザーは、スレッドの投稿やレスの返信ができなくなります。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208540061-ea3ed2c1-d6c7-4a78-9463-9db9e4d773b0.mp4 /></div>

<h4>管理者ユーザーによるスレッド・レスの削除</h4>
<div>管理者ユーザーは、スレッド及びレスの削除を行うことができます。</div>
<div><video controls muted src=https://user-images.githubusercontent.com/83113782/208544837-37da62a8-073b-4c0b-8383-36421fb4dee2.mp4 /></div>

<h3>改善点</h3>
<div>
  <ul>
    <li>レスに画像ファイルを添付する機能を追加したい。</li>
    <li>評決済みのスレッドと未評決のスレッドを分けて表示させたい。</li>
    <li>レス同士でやり取りを行うためのレスアンカーを追加したい。</li>
  </ul>
</div>



