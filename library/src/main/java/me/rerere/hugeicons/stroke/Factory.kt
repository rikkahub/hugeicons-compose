package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = ImageVector.Builder(
            name = "Factory",
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
        moveTo(9f, 13.5f)
        verticalLineTo(9f)
        curveTo(9f, 8.05719f, 9f, 7.58579f, 8.70711f, 7.29289f)
        curveTo(8.41421f, 7f, 7.94281f, 7f, 7f, 7f)
        horizontalLineTo(5f)
        curveTo(4.05719f, 7f, 3.58579f, 7f, 3.29289f, 7.29289f)
        curveTo(3f, 7.58579f, 3f, 8.05719f, 3f, 9f)
        verticalLineTo(18f)
        curveTo(3f, 19.8856f, 3f, 20.8284f, 3.58579f, 21.4142f)
        curveTo(4.17157f, 22f, 5.11438f, 22f, 7f, 22f)
        horizontalLineTo(9f)
        moveTo(9f, 13.5f)
        lineTo(12.3167f, 11.8416f)
        curveTo(13.4174f, 11.2913f, 13.9678f, 11.0161f, 14.3942f, 11.199f)
        curveTo(14.4853f, 11.2381f, 14.57f, 11.2905f, 14.6457f, 11.3545f)
        curveTo(15f, 11.6541f, 15f, 12.2694f, 15f, 13.5f)
        lineTo(18.1056f, 11.9472f)
        curveTo(19.4028f, 11.2986f, 20.0515f, 10.9743f, 20.5257f, 11.2674f)
        curveTo(21f, 11.5605f, 21f, 12.2857f, 21f, 13.7361f)
        verticalLineTo(18f)
        curveTo(21f, 19.8856f, 21f, 20.8284f, 20.4142f, 21.4142f)
        curveTo(19.8284f, 22f, 18.8856f, 22f, 17f, 22f)
        horizontalLineTo(9f)
        moveTo(9f, 13.5f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 10f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 2f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 2f, 6.58579f, 2f, 6.29289f, 2.29289f)
        curveTo(6f, 2.58579f, 6f, 3.05719f, 6f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 5f)
        lineTo(17f, 5f)
        }
        }.build()

        return _factory!!
    }

private var _factory: ImageVector? = null
