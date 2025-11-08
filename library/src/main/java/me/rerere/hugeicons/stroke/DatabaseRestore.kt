package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DatabaseRestore: ImageVector
    get() {
        if (_databaseRestore != null) {
            return _databaseRestore!!
        }
        _databaseRestore = ImageVector.Builder(
            name = "DatabaseRestore",
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
        moveTo(19.842f, 13f)
        lineTo(20.4127f, 15.3449f)
        lineTo(19.4647f, 14.7618f)
        curveTo(18.7894f, 14.2569f, 17.9501f, 13.9576f, 17.0404f, 13.9576f)
        curveTo(14.809f, 13.9576f, 13f, 15.7579f, 13f, 17.9788f)
        curveTo(13f, 20.1996f, 14.809f, 22f, 17.0404f, 22f)
        curveTo(18.9951f, 22f, 20.6256f, 20.6185f, 21f, 18.783f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        verticalLineTo(10f)
        moveTo(3f, 5f)
        verticalLineTo(19f)
        curveTo(3f, 20.6569f, 6.58172f, 22f, 11f, 22f)
        curveTo(11.0849f, 22f, 11.1694f, 21.9995f, 11.2537f, 21.9985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        curveTo(3f, 13.616f, 6.40729f, 14.9336f, 10.6748f, 14.9976f)
        }
        }.build()

        return _databaseRestore!!
    }

private var _databaseRestore: ImageVector? = null
