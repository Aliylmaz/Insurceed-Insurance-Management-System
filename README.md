
# Insurceed 🚀  
Sigorta süreçlerini tek bir çatı altında toplayan web tabanlı **Sigorta Yönetim Platformu**.  

Amaç; tekliften poliçeye, ödemeden hasar süreçlerine kadar tüm adımları dijitalleştirip, kullanıcı dostu bir arayüz ile daha şeffaf ve hızlı hale getirmektir.  

---

## 🌟 Özellikler  

- **Rol Tabanlı Yönetim**
  - **Müşteri:** Teklif alma, ödeme yapma, poliçe görüntüleme, hasar bildirimi.
  - **Acente:** Teklif yönetimi, poliçe oluşturma, hasar ve doküman inceleme.
  - **Admin:** Kullanıcı & acente yönetimi, rol atamaları, sistem denetimi.
  
- **Teklif ve Poliçe Yönetimi**  
  - Araç, konut veya sağlık için teklif oluşturma.  
  - Teklif onayı sonrası otomatik poliçe oluşturma.  

- **Hasar Yönetimi**  
  - Müşteri hasar bildirimi açar, belgeleri yükler.  
  - Acente belgeleri inceleyip onay/ret kararı verebilir.  

- **Ödeme ve Raporlama**  
  - Ödeme ekranları ve işlem takibi.  
  - Poliçe, ödeme ve hasar kayıtlarını dışa aktarma (Excel/PDF).  

---

## 🛠️ Kullanılan Teknolojiler  

### Backend  
- **Java Spring Boot**  
- Spring Data JPA & Hibernate  
- PostgreSQL  
- JWT Authentication  
- Lombok  

### Frontend  
- **React**  
- **TypeScript**  
- **Vite**  
- Axios  
- TailwindCSS / ShadcnUI  


## ⚙️ Kurulum  

### 1. Backend (Spring Boot)  

```bash
# Repository klonla
git clone https://github.com/kullaniciadi/insurceed.git
cd insurceed/backend

# application.properties içinde PostgreSQL bilgilerini düzenle
spring.datasource.url=jdbc:postgresql://localhost:5432/insurceed
spring.datasource.username=postgres
spring.datasource.password=postgres

# Uygulamayı çalıştır
mvn spring-boot:run
````

### 2. Frontend (React + Vite + TypeScript)

```bash
cd insurceed/frontend

# Bağımlılıkları yükle
npm install

# Geliştirme ortamında çalıştır
npm run dev

# Prod için build al
npm run build
```

Frontend varsayılan olarak `http://localhost:5173` üzerinde çalışır.

---

## 📂 Proje Yapısı

```bash
insurceed/
│
├── backend/                  # Spring Boot backend
│   ├── src/main/java/...      # Controller, Service, Repository
│   ├── src/main/resources/    # application.properties
│   └── pom.xml
│
├── frontend/                 # React + TypeScript + Vite frontend
│   ├── src/                  # Components, Pages, Hooks
│   ├── public/
│   └── package.json
│
└── README.md
```

---

## 👥 Katkıda Bulunanlar

* **Ali Yılmaz** – Geliştirici
* **ADA Yazılım** – Staj desteği

---

## 📄 Lisans

Bu proje kişisel öğrenim ve gösterim amacıyla hazırlanmıştır.

```


