package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Leaf03: ImageVector
    get() {
        if (_leaf03 != null) {
            return _leaf03!!
        }
        _leaf03 = ImageVector.Builder(
            name = "Leaf03",
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
        moveTo(6.67504f, 17.325f)
        curveTo(3.77499f, 14.4249f, 3.77499f, 9.72297f, 6.67504f, 6.82291f)
        curveTo(10.6133f, 2.88465f, 20.459f, 3.54102f, 20.459f, 3.54102f)
        curveTo(20.459f, 3.54102f, 21.1154f, 13.3867f, 17.1771f, 17.325f)
        curveTo(15.2327f, 19.2694f, 12.4783f, 19.9101f, 10f, 19.2472f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 20.5f)
        lineTo(15.5f, 8.5f)
        }
        }.build()

        return _leaf03!!
    }

private var _leaf03: ImageVector? = null
