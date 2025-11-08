package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) {
            return _easeOutControlPoint!!
        }
        _easeOutControlPoint = ImageVector.Builder(
            name = "EaseOutControlPoint",
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
        moveTo(4f, 21f)
        curveTo(4f, 21f, 11f, 5f, 22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 5f)
        horizontalLineTo(13f)
        moveTo(6f, 5f)
        lineTo(8f, 5f)
        moveTo(6f, 5f)
        curveTo(6f, 6.10457f, 5.10457f, 7f, 4f, 7f)
        curveTo(2.89543f, 7f, 2f, 6.10457f, 2f, 5f)
        curveTo(2f, 3.89543f, 2.89543f, 3f, 4f, 3f)
        curveTo(5.10457f, 3f, 6f, 3.89543f, 6f, 5f)
        }
        }.build()

        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
