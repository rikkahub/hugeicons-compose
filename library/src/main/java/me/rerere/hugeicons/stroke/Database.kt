package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = ImageVector.Builder(
            name = "Database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10.842f)
        curveTo(7.60158f, 11.0229f, 8.27434f, 11.1718f, 9f, 11.282f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12f)
        curveTo(20f, 13.6569f, 16.4183f, 15f, 12f, 15f)
        curveTo(7.58172f, 15f, 4f, 13.6569f, 4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17.842f)
        curveTo(7.60158f, 18.0229f, 8.27434f, 18.1718f, 9f, 18.282f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5f)
        verticalLineTo(19f)
        curveTo(20f, 20.6569f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
        verticalLineTo(5f)
        }
        }.build()

        return _database!!
    }

private var _database: ImageVector? = null
