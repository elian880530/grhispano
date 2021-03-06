dataSource {
	pooled = true
	driverClassName = "org.hsqldb.jdbcDriver"
	username = "sa"
	password = ""
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update"
            url = "jdbc:mysql://localhost/grhispano"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
		}
	}
	test {
		dataSource {
			dbCreate = "create-drop"
			url = "jdbc:hsqldb:mem:testDb"
		}
	}
	production {
		dataSource {
			url = "jdbc:mysql://localhost/grhispano"
			driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
		}
	}
}