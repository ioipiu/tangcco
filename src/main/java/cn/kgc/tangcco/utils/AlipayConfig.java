package cn.kgc.tangcco.utils;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101200665907";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDEpANHeU9Znr7gKYQcfEvTQ38fHLWfQ02mYJyuj14wOSSdp/aum0feh2DbemPpfg+ZM4nRAhWMaPjDRGhKLIWG5n/QRCseXAe4On/TfDe+2fCs3DrqTHRRyanG1cavn1FJlmSVRtgmdkje2qzoTK6NB/YA2hV8yV8DpdLIObKhq6uIBp3PZSuIyPZ2TiZXX2oDEunEotnIRWvxEizTp4xgvbIcoyOJy0+g9AS1vGD1zKOkAm7rgvNBY9I/njWnoaOfLPIkzlAhQNlgyBzpAxQpBDpbaIpbqnwcfP83NMUkn7ZCiEZ+spKuu3Orql8SRfeKdZOGaczPCPOSgyPMax2bAgMBAAECggEAUzh2itE0W+FrNsNbPhL8pDR0oF4uH3EEc91/cgELA62raW2kYNEm4W659ykdD7xiLZw6P1J6fCoQ3dMdsAaXnDgA78tp1DdurPFVF9QCY6soyH+MD4y7zcFjMNtYcwsiA9q6RtLst5pnzKkPdGC/nsA3xLSHU4CFza1oP4TrrK+Utz4dALLaw9sN7St0xIYg17byjFpzJm9aEw+vfA6muKdmm7YqvyyqGsi1/Nam7fGkC3XD3K44FVZNg/5opsvqQEFfPFVcGssJS+gogmafyymLkUbkonU59MOSzqj+jnc47ilhmPPSFHHvi78ojO/xq8MLDbFKFoh43Tm5gZO1wQKBgQDmPpJQPrlHqkz0PLUXKkIxd0mdkVg1+8cdbzS55mI5cGl0EqNiUbwJC1Z4VV6yNTls2EirBCDnS4LUZaGMjfD1a8D8LpBEM11nLsIRbqSWbaVuXWVNSqZN/m6gVT9Ou2YxlWcLC6T/NQcVSZz1kdlg4/tSFk7ZKiCuJjlWZK5cfQKBgQDaoySEgykD7Vifku4thjYOG8Y/1rmf4I30slxtuTtBl9A5lHoezC+t4+7DoXL8wfkFDhcapGRKsNqwX4aMjOkoXbK0C3cxqNtcIJWMFP7/OqgOkasFKGf4RTaw0sloBHRyiTkCuDCyCtXH66Bi0X6xH9NRAttzwa5QJqJY21I19wKBgQCoEkT8Ds1xYv+JykbnAhIPyeQTAWZDAef3tJXoniRViZlxAaoCu2dnsr8MWEUoEXI54igprnnWXWjDYuzqjTK39FCLxfHJ1zT3fUptLzc2GBQK3GJ2aWe8x1457ACqmGGhEE6H4ZgwM6VYBMRu/miQMdvjsCUeoYH5ni18w0IEgQKBgH1wtsX0frbLGVrMsSybYS4tD0yXRP8OlkO7hb5KVU4n7QbsQjijTAPHz7icS93q6JXW5LibcxNLbt1coVTIkAlh4OLd5TAvwlOUOlkZvsfu/ncFaorWCPjvtRY0ievNCoagZn5B8WZlQwymCupHahnzuYk0S3aZvAoucFzs0Lk3AoGAC4aC4A9ZkWreWM8bA9Q579j3G+5ptsYOZZwqIMRqPiZZkUSJDbUTt8a8GaDPTzTGnRRwHl5E3iu16vlmoHtPjfFWEoOiwq5q64As5UGzgYDTWnfKwZ+vOmrO1deuiheiO8evY4ANdC1VK3Sxqmnr35Mc0cVNcinHEvov5YfGBl4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjqsmJUuaVD1Yf+ebRj/4pWejPqSqJ0xWVsc8wTaFubI5URXE58GxpparjxKwiXjiA1jDmKQG+JVvauWXCKwrdjM2tgBBtZ501SaeJP89uNu1SsvypS2Z9KRMa25GAkygF9wl5wWaFuhCOZ4+l/bTruXrARt8ZoxZf4J77RjzswsS41jHp3AWwe4juZ3pwlIRvIa17kWwioLhkTtcTlGgoahXPzLWEySgkHkxnGR+/p/K7SOTw50hxDIuyW/m0putsm2g6MmXE9jzIfd+wLZxuyPSVBtdSPcbWtOkerojhdVP2iQtEIAO/5lz2Gdb+5oJcKgfMETTvoUlv9oEcLpJhwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipaydemo/filed.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipaydemo/queryAlipay";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
}

