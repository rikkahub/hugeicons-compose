package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TrapezoidLineVertical: ImageVector
    get() {
        if (_trapezoidLineVertical != null) {
            return _trapezoidLineVertical!!
        }
        _trapezoidLineVertical = ImageVector.Builder(
            name = "TrapezoidLineVertical",
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
        moveTo(12f, 5f)
        curveTo(14.6653f, 5f, 15.998f, 5f, 16.9449f, 5.62726f)
        curveTo(17.0483f, 5.69576f, 17.1471f, 5.76916f, 17.2409f, 5.84711f)
        curveTo(18.1001f, 6.56098f, 18.2886f, 7.69057f, 18.6655f, 9.94975f)
        lineTo(19.0328f, 12.1515f)
        curveTo(19.5645f, 15.338f, 19.8303f, 16.9312f, 18.7825f, 17.9656f)
        curveTo(17.7348f, 19f, 15.8551f, 19f, 12.0957f, 19f)
        horizontalLineTo(11.9043f)
        curveTo(8.14492f, 19f, 6.26523f, 19f, 5.21745f, 17.9656f)
        curveTo(4.16967f, 16.9312f, 4.4355f, 15.338f, 4.96716f, 12.1515f)
        lineTo(5.33451f, 9.94974f)
        curveTo(5.71144f, 7.69057f, 5.89991f, 6.56098f, 6.75905f, 5.84711f)
        curveTo(6.85287f, 5.76915f, 6.95171f, 5.69576f, 7.05511f, 5.62726f)
        curveTo(8.00198f, 5f, 9.33465f, 5f, 12f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        lineTo(12f, 2f)
        }
        }.build()

        return _trapezoidLineVertical!!
    }

private var _trapezoidLineVertical: ImageVector? = null
