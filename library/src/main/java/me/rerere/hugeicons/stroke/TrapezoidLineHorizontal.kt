package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TrapezoidLineHorizontal: ImageVector
    get() {
        if (_trapezoidLineHorizontal != null) {
            return _trapezoidLineHorizontal!!
        }
        _trapezoidLineHorizontal = ImageVector.Builder(
            name = "TrapezoidLineHorizontal",
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
        moveTo(5f, 12f)
        curveTo(5f, 9.33466f, 5f, 8.00198f, 5.62726f, 7.05511f)
        curveTo(5.69576f, 6.95171f, 5.76916f, 6.85287f, 5.84711f, 6.75905f)
        curveTo(6.56098f, 5.89991f, 7.69057f, 5.71144f, 9.94975f, 5.33451f)
        lineTo(12.1515f, 4.96715f)
        curveTo(15.338f, 4.4355f, 16.9312f, 4.16967f, 17.9656f, 5.21745f)
        curveTo(19f, 6.26523f, 19f, 8.14492f, 19f, 11.9043f)
        verticalLineTo(12.0957f)
        curveTo(19f, 15.8551f, 19f, 17.7348f, 17.9656f, 18.7826f)
        curveTo(16.9312f, 19.8303f, 15.338f, 19.5645f, 12.1515f, 19.0328f)
        lineTo(9.94974f, 18.6655f)
        curveTo(7.69057f, 18.2886f, 6.56098f, 18.1001f, 5.84711f, 17.2409f)
        curveTo(5.76916f, 17.1471f, 5.69576f, 17.0483f, 5.62726f, 16.9449f)
        curveTo(5f, 15.998f, 5f, 14.6653f, 5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(2f, 12f)
        }
        }.build()

        return _trapezoidLineHorizontal!!
    }

private var _trapezoidLineHorizontal: ImageVector? = null
