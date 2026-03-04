package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PillOff: ImageVector
    get() {
        if (_pillOff != null) {
            return _pillOff!!
        }
        _pillOff = ImageVector.Builder(
            name = "PillOff",
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
        moveTo(10.5f, 6.5f)
        lineTo(12.5503f, 4.44975f)
        curveTo(13.4785f, 3.52149f, 14.7375f, 3f, 16.0503f, 3f)
        curveTo(18.7839f, 3f, 21f, 5.21608f, 21f, 7.94975f)
        curveTo(21f, 9.2625f, 20.4785f, 10.5215f, 19.5503f, 11.4497f)
        lineTo(17.5f, 13.5f)
        moveTo(8.5f, 8.5f)
        lineTo(4.44975f, 12.5503f)
        curveTo(3.52149f, 13.4785f, 3f, 14.7375f, 3f, 16.0503f)
        curveTo(3f, 18.7839f, 5.21608f, 21f, 7.94975f, 21f)
        curveTo(9.2625f, 21f, 10.5215f, 20.4785f, 11.4497f, 19.5503f)
        lineTo(15.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }
        }.build()

        return _pillOff!!
    }

private var _pillOff: ImageVector? = null
