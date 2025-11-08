package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sun02: ImageVector
    get() {
        if (_sun02 != null) {
            return _sun02!!
        }
        _sun02 = ImageVector.Builder(
            name = "Sun02",
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
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(11.6227f, 2.33333f, 11.0945f, 3.2f, 12f, 4f)
        moveTo(12f, 20f)
        curveTo(12.3773f, 20.3333f, 12.9055f, 21.2f, 12f, 22f)
        moveTo(19.5f, 4.50271f)
        curveTo(18.9685f, 4.46982f, 17.9253f, 4.72293f, 18.0042f, 5.99847f)
        moveTo(5.49576f, 17.5f)
        curveTo(5.52865f, 18.0315f, 5.27555f, 19.0747f, 4f, 18.9958f)
        moveTo(5.00271f, 4.5f)
        curveTo(4.96979f, 5.03202f, 5.22315f, 6.0763f, 6.5f, 5.99729f)
        moveTo(18f, 17.5026f)
        curveTo(18.5315f, 17.4715f, 19.5747f, 17.7108f, 19.4958f, 18.9168f)
        moveTo(22f, 12f)
        curveTo(21.6667f, 11.6227f, 20.8f, 11.0945f, 20f, 12f)
        moveTo(4f, 11.5f)
        curveTo(3.66667f, 11.8773f, 2.8f, 12.4055f, 2f, 11.5f)
        }
        }.build()

        return _sun02!!
    }

private var _sun02: ImageVector? = null
