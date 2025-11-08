package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Parabola01: ImageVector
    get() {
        if (_parabola01 != null) {
            return _parabola01!!
        }
        _parabola01 = ImageVector.Builder(
            name = "Parabola01",
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
        moveTo(21f, 3f)
        curveTo(21f, 11.2843f, 16.9706f, 18f, 12f, 18f)
        curveTo(7.02944f, 18f, 3f, 11.2843f, 3f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        horizontalLineTo(4.05882f)
        moveTo(15.7059f, 21f)
        horizontalLineTo(16.7647f)
        moveTo(19.9412f, 21f)
        horizontalLineTo(21f)
        moveTo(7.23529f, 21f)
        horizontalLineTo(8.29412f)
        moveTo(11.4706f, 21f)
        horizontalLineTo(12.5294f)
        }
        }.build()

        return _parabola01!!
    }

private var _parabola01: ImageVector? = null
