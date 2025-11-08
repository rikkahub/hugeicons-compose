package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = ImageVector.Builder(
            name = "Earth",
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
        moveTo(12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 9.20746f, 3.14465f, 6.68227f, 4.99037f, 4.86802f)
        moveTo(12f, 22f)
        curveTo(11.037f, 21.2864f, 11.1907f, 20.4555f, 11.6738f, 19.6247f)
        curveTo(12.4166f, 18.3474f, 12.4166f, 18.3474f, 12.4166f, 16.6444f)
        curveTo(12.4166f, 14.9414f, 13.4286f, 14.1429f, 17f, 14.8571f)
        curveTo(18.6047f, 15.1781f, 19.7741f, 12.9609f, 21.8573f, 13.693f)
        moveTo(12f, 22f)
        curveTo(16.9458f, 22f, 21.053f, 18.4096f, 21.8573f, 13.693f)
        moveTo(21.8573f, 13.693f)
        curveTo(21.9511f, 13.1427f, 22f, 12.5771f, 22f, 12f)
        curveTo(22f, 7.11857f, 18.5024f, 3.05405f, 13.8766f, 2.17579f)
        moveTo(13.8766f, 2.17579f)
        curveTo(14.3872f, 3.11599f, 14.1816f, 4.23551f, 13.1027f, 4.66298f)
        curveTo(11.3429f, 5.3603f, 12.6029f, 6.64343f, 11.1035f, 7.4356f)
        curveTo(10.1038f, 7.96372f, 8.6044f, 7.83152f, 7.10496f, 6.24716f)
        curveTo(6.31517f, 5.41264f, 5.83966f, 4.95765f, 4.99037f, 4.86802f)
        moveTo(13.8766f, 2.17579f)
        curveTo(13.2687f, 2.06039f, 12.6414f, 2f, 12f, 2f)
        curveTo(9.26969f, 2f, 6.79495f, 3.09421f, 4.99037f, 4.86802f)
        }
        }.build()

        return _earth!!
    }

private var _earth: ImageVector? = null
