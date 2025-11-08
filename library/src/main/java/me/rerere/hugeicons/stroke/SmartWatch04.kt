package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartWatch04: ImageVector
    get() {
        if (_smartWatch04 != null) {
            return _smartWatch04!!
        }
        _smartWatch04 = ImageVector.Builder(
            name = "SmartWatch04",
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
        moveTo(4.5f, 12f)
        curveTo(4.5f, 8.71252f, 4.5f, 7.06878f, 5.40796f, 5.96243f)
        curveTo(5.57418f, 5.75989f, 5.75989f, 5.57418f, 5.96243f, 5.40796f)
        curveTo(7.06878f, 4.5f, 8.71252f, 4.5f, 12f, 4.5f)
        curveTo(15.2875f, 4.5f, 16.9312f, 4.5f, 18.0376f, 5.40796f)
        curveTo(18.2401f, 5.57418f, 18.4258f, 5.75989f, 18.592f, 5.96243f)
        curveTo(19.5f, 7.06878f, 19.5f, 8.71252f, 19.5f, 12f)
        curveTo(19.5f, 15.2875f, 19.5f, 16.9312f, 18.592f, 18.0376f)
        curveTo(18.4258f, 18.2401f, 18.2401f, 18.4258f, 18.0376f, 18.592f)
        curveTo(16.9312f, 19.5f, 15.2875f, 19.5f, 12f, 19.5f)
        curveTo(8.71252f, 19.5f, 7.06878f, 19.5f, 5.96243f, 18.592f)
        curveTo(5.75989f, 18.4258f, 5.57418f, 18.2401f, 5.40796f, 18.0376f)
        curveTo(4.5f, 16.9312f, 4.5f, 15.2875f, 4.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 22f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 10f)
        lineTo(13f, 13f)
        moveTo(15f, 9f)
        lineTo(11f, 13f)
        }
        }.build()

        return _smartWatch04!!
    }

private var _smartWatch04: ImageVector? = null
