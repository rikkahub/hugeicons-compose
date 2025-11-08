package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DatabaseExport: ImageVector
    get() {
        if (_databaseExport != null) {
            return _databaseExport!!
        }
        _databaseExport = ImageVector.Builder(
            name = "DatabaseExport",
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
        moveTo(6f, 10.8418f)
        curveTo(6.60158f, 11.0226f, 7.27434f, 11.1716f, 8f, 11.2817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15f)
        curveTo(6.58172f, 15f, 3f, 13.6569f, 3f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17.8418f)
        curveTo(6.60158f, 18.0226f, 7.27434f, 18.1716f, 8f, 18.2817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        curveTo(6.58172f, 22f, 3f, 20.6569f, 3f, 19f)
        verticalLineTo(5f)
        moveTo(19f, 5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 16.6735f)
        lineTo(17.8258f, 15.1869f)
        curveTo(17.2008f, 14.3956f, 16.8883f, 14f, 16.5f, 14f)
        curveTo(16.1117f, 14f, 15.7992f, 14.3956f, 15.1742f, 15.1869f)
        lineTo(14f, 16.6735f)
        moveTo(16.5f, 14.0872f)
        verticalLineTo(22f)
        }
        }.build()

        return _databaseExport!!
    }

private var _databaseExport: ImageVector? = null
