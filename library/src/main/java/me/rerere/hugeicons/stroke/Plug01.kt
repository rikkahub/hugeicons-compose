package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plug01: ImageVector
    get() {
        if (_plug01 != null) {
            return _plug01!!
        }
        _plug01 = ImageVector.Builder(
            name = "Plug01",
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
        moveTo(15.5f, 2f)
        verticalLineTo(6f)
        moveTo(8.5f, 6f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00446f, 7.61331f)
        curveTo(5.93719f, 6.74273f, 6.63957f, 6f, 7.53014f, 6f)
        horizontalLineTo(16.4699f)
        curveTo(17.3604f, 6f, 18.0628f, 6.74273f, 17.9955f, 7.61331f)
        lineTo(17.8117f, 9.99197f)
        curveTo(17.6796f, 11.7019f, 17.1011f, 13.3498f, 16.132f, 14.7773f)
        lineTo(15.5312f, 15.6622f)
        curveTo(14.9638f, 16.4979f, 14.0077f, 17f, 12.9838f, 17f)
        horizontalLineTo(11.0162f)
        curveTo(9.99228f, 17f, 9.03617f, 16.4979f, 8.46881f, 15.6622f)
        lineTo(7.86803f, 14.7773f)
        curveTo(6.89885f, 13.3498f, 6.32041f, 11.7019f, 6.18827f, 9.99197f)
        lineTo(6.00446f, 7.61331f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 9f)
        horizontalLineTo(13f)
        }
        }.build()

        return _plug01!!
    }

private var _plug01: ImageVector? = null
