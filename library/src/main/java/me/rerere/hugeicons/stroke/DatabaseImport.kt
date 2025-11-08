package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DatabaseImport: ImageVector
    get() {
        if (_databaseImport != null) {
            return _databaseImport!!
        }
        _databaseImport = ImageVector.Builder(
            name = "DatabaseImport",
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
        moveTo(7f, 10.8418f)
        curveTo(7.60158f, 11.0226f, 8.27434f, 11.1716f, 9f, 11.2817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(7.58172f, 15f, 4f, 13.6569f, 4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17.8418f)
        curveTo(7.60158f, 18.0226f, 8.27434f, 18.1716f, 9f, 18.2817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
        verticalLineTo(5f)
        moveTo(20f, 5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 19.3265f)
        lineTo(18.8258f, 20.8131f)
        curveTo(18.2008f, 21.6044f, 17.8883f, 22f, 17.5f, 22f)
        curveTo(17.1117f, 22f, 16.7992f, 21.6044f, 16.1742f, 20.8131f)
        lineTo(15f, 19.3265f)
        moveTo(17.5f, 21.9128f)
        verticalLineTo(14f)
        }
        }.build()

        return _databaseImport!!
    }

private var _databaseImport: ImageVector? = null
