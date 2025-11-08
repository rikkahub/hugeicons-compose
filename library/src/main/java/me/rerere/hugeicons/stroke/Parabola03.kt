package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Parabola03: ImageVector
    get() {
        if (_parabola03 != null) {
            return _parabola03!!
        }
        _parabola03 = ImageVector.Builder(
            name = "Parabola03",
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
        moveTo(21f, 2f)
        curveTo(21f, 10.2843f, 16.9706f, 17f, 12f, 17f)
        curveTo(7.02944f, 17f, 3f, 10.2843f, 3f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 20f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 4.5f)
        curveTo(11.1f, 2.68572f, 11.45f, 2f, 12f, 2f)
        moveTo(14.5f, 4.5f)
        curveTo(12.9f, 2.68572f, 12.55f, 2f, 12f, 2f)
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }
        }.build()

        return _parabola03!!
    }

private var _parabola03: ImageVector? = null
