package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3rdBracket: ImageVector
    get() {
        if (_icon3rdBracket != null) {
            return _icon3rdBracket!!
        }
        _icon3rdBracket = ImageVector.Builder(
            name = "Icon3rdBracket",
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
        moveTo(18f, 21f)
        curveTo(19.2322f, 21f, 20.231f, 19.8487f, 20.231f, 18.4286f)
        curveTo(20.231f, 16.1808f, 20.1312f, 14.6865f, 21.6733f, 12.9091f)
        curveTo(22.1089f, 12.407f, 22.1089f, 11.593f, 21.6733f, 11.0909f)
        curveTo(20.1312f, 9.31354f, 20.231f, 7.81916f, 20.231f, 5.57143f)
        curveTo(20.231f, 4.15127f, 19.2322f, 3f, 18f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        curveTo(4.76784f, 21f, 3.76897f, 19.8487f, 3.76897f, 18.4286f)
        curveTo(3.76897f, 16.1808f, 3.86877f, 14.6865f, 2.32673f, 12.9091f)
        curveTo(1.89109f, 12.407f, 1.89109f, 11.593f, 2.32673f, 11.0909f)
        curveTo(3.83496f, 9.35251f, 3.76897f, 7.83992f, 3.76897f, 5.57143f)
        curveTo(3.76897f, 4.15127f, 4.76784f, 3f, 6f, 3f)
        }
        }.build()

        return _icon3rdBracket!!
    }

private var _icon3rdBracket: ImageVector? = null
