package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowReload02: ImageVector
    get() {
        if (_circleArrowReload02 != null) {
            return _circleArrowReload02!!
        }
        _circleArrowReload02 = ImageVector.Builder(
            name = "CircleArrowReload02",
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
        moveTo(16.5f, 9.6f)
        lineTo(15.3298f, 8.68465f)
        curveTo(14.6572f, 8.15854f, 14.4545f, 8.25535f, 14.4545f, 9.10274f)
        verticalLineTo(14.4f)
        curveTo(14.4545f, 15.8615f, 13.6875f, 16f, 12.4091f, 16f)
        moveTo(7.5f, 14.4f)
        lineTo(8.67019f, 15.3153f)
        curveTo(9.34278f, 15.8415f, 9.54545f, 15.7447f, 9.54545f, 14.8973f)
        lineTo(9.54545f, 9.6f)
        curveTo(9.54545f, 8.13846f, 10.3125f, 8f, 11.5909f, 8f)
        }
        }.build()

        return _circleArrowReload02!!
    }

private var _circleArrowReload02: ImageVector? = null
