package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowReload01: ImageVector
    get() {
        if (_circleArrowReload01 != null) {
            return _circleArrowReload01!!
        }
        _circleArrowReload01 = ImageVector.Builder(
            name = "CircleArrowReload01",
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
        moveTo(14.4f, 7.5f)
        lineTo(15.3153f, 8.67019f)
        curveTo(15.8415f, 9.34278f, 15.7447f, 9.54545f, 14.8973f, 9.54545f)
        lineTo(9.6f, 9.54545f)
        curveTo(8.13846f, 9.54545f, 8f, 10.3125f, 8f, 11.5909f)
        moveTo(9.6f, 16.5f)
        lineTo(8.68465f, 15.3298f)
        curveTo(8.15854f, 14.6572f, 8.25535f, 14.4545f, 9.10274f, 14.4545f)
        horizontalLineTo(14.4f)
        curveTo(15.8615f, 14.4545f, 16f, 13.6875f, 16f, 12.4091f)
        }
        }.build()

        return _circleArrowReload01!!
    }

private var _circleArrowReload01: ImageVector? = null
