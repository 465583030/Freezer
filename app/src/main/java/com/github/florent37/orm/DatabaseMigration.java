package com.github.florent37.orm;

import java.util.Observable;

import fr.xebia.android.freezer.annotations.DatabaseName;
import fr.xebia.android.freezer.annotations.Migration;
import fr.xebia.android.freezer.migration.Migrator;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by florentchampigny on 28/01/2016.
 */
@DatabaseName("mmm")
public class DatabaseMigration {

    @Migration(2)
    public static void migrateTo2(Migrator migrator) {
        //migrator.update("User")
        //        .removeField("age")
        //        .renameTo("Man");
    }

    //@Migration(3)
    //public static void migrateTo3(Migrator migrator) {
    //    migrator.update("Man")
    //            .addField("birth", ColumnType.Primitive.Int);
    //}

    //@Migration(4)
    //public static void migrateTo4(Migrator migrator) {
    //    migrator.update("Man")
    //            .transform("name").renameTo("myName")
    //            .addField("lastName", ColumnType.Primitive.String);
    //}

    //@Migration(5)
    //public static void migrateTo5(Migrator migrator) {
    //    migrator.addTable(migrator.createModel("Woman")
    //                    .field("name", ColumnType.Primitive.String)
    //                    .build());
    //}

    //@Migration(6)
    //public static void migrateTo6(Migrator migrator) {
    //    migrator.update("Woman")
    //            .addField("mans", ColumnType.collectionOfModel("Man"))
    //            .addField("age", ColumnType.Primitive.Int);
    //}

}
