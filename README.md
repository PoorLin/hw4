= Postman 和 cURL 用途簡易說明
:toc: macro
:toclevels: 2
:icons: font

== 專案使用手冊
請您使用 IDE 的 Tomcat 或是外部的 Tomcat 開啟。

=== tomcat (Intellij)
點選右上角編譯旁邊的edit configuration，新增tomcat並選擇版本10.1.23，選擇完版本後進入此tomcat設定中的deployment，點擊 "+"這個符號後選擇Artifact
之後會有一個選單，請選擇"hw4:war"，並且把下方的Application context改成 "/hw4"


=== main方法執行專案
執行Application的main方法


== Postman

Postman 是一個流行的 API 開發工具，提供了使用者友好的介面來測試和管理 API 請求。它允許開發者輕鬆發送 HTTP 請求並查看響應，支持各種請求方法（如 GET、POST、PUT、DELETE 等）。

=== 主要功能

* **用戶介面友好**：提供直觀的介面，方便用戶構建和發送請求。
* **請求和響應管理**：支持請求參數、請求頭和請求體的設置，以及響應數據的可視化。
* **集合和環境**：可以組織請求集合和環境變數，便於管理不同的 API 測試。
* **自動化測試**：支持編寫測試腳本，並可通過 Newman CLI 工具進行自動化測試。
* **文件生成**：可以根據請求生成 API 文件，方便團隊共享。

=== 使用場景

* 測試 RESTful APIs
* 調試 API 請求和響應
* 管理和共享 API 文件
* 自動化 API 測試

== cURL

cURL 是一個命令列工具，用於向伺服器發送請求並獲取響應。它支持多種協議，包括 HTTP、HTTPS、FTP 等。cURL 常用於腳本和命令行環境中，方便開發者快速測試 API。

=== 主要功能

* **命令行工具**：通過命令行介面輕鬆發送請求，適合腳本化操作。
* **廣泛支持**：支持多種協議和請求方法，適用於各種場景。
* **靈活性**：可以通過命令行參數設置請求頭、請求體、認證信息等。
* **響應輸出**：可以將響應數據輸出到控制台或文件中，方便查看和保存。

=== 使用場景

* 快速測試 HTTP 請求
* 在腳本中集成 API 調用
* 處理 API 請求和響應數據
* 調試網絡請求

== 實際使用經驗
=== 上方筆記皆為查詢結果，下面為個人經驗
* 在postman中可以建立group，可以跟團隊共享所寫的API，隨時與別人整合測試流程(裡面可以儲存一個流程裡面存放很多API來當作單元測試或簡單的整合測試)，而且一個API又可以詳細的設定header和body。有一個與跟功能相似的網站”API Tester“，雖然介面沒有Postman那麼好用，不過進入網站就可以直接使用，不需下載或登入
* 目前使用過cURL大多是用在非圖形化作業系統(Linux或ubuntu)中用於下載資源時使用。


== 總結

Postman 和 cURL 是兩個強大的工具，適用於不同的 API 開發和測試場景。Postman 提供了用戶友好的介面，而 cURL 則適合命令行用戶和腳本化操作。根據項目需求選擇合適的工具，可以提高 API 開發和測試的效率。


