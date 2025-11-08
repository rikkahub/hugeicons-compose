package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = ImageVector.Builder(
            name = "Signature",
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
        moveTo(22f, 12.6344f)
        curveTo(18f, 16.1465f, 17.4279f, 10.621f, 15.3496f, 11.0165f)
        curveTo(13f, 11.4637f, 11.5f, 16.4445f, 13f, 16.4445f)
        curveTo(14.5f, 16.4445f, 12.5f, 10.5f, 10.5f, 12.5556f)
        curveTo(8.5f, 14.6111f, 7.85936f, 17.2946f, 6.23526f, 15.3025f)
        curveTo(-1.5f, 5.81446f, 4.99998f, -1.14994f, 8.16322f, 3.45685f)
        curveTo(10.1653f, 6.37256f, 6.5f, 16.9769f, 2f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21f)
        horizontalLineTo(19f)
        }
        }.build()

        return _signature!!
    }

private var _signature: ImageVector? = null
