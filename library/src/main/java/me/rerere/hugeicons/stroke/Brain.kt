package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = ImageVector.Builder(
            name = "Brain",
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
        moveTo(16.998f, 7.12652f)
        curveTo(17.3182f, 7.04393f, 17.654f, 7f, 18f, 7f)
        curveTo(20.2091f, 7f, 22f, 8.79086f, 22f, 11f)
        curveTo(22f, 13.2091f, 20.2091f, 15f, 18f, 15f)
        curveTo(17.6451f, 15f, 17.3009f, 14.9538f, 16.9733f, 14.867f)
        moveTo(16.998f, 7.12652f)
        curveTo(16.9993f, 7.08451f, 17f, 7.04233f, 17f, 7f)
        curveTo(17f, 4.79086f, 15.2091f, 3f, 13f, 3f)
        curveTo(11.0824f, 3f, 9.47994f, 4.34939f, 9.09041f, 6.15043f)
        moveTo(16.998f, 7.12652f)
        curveTo(16.9769f, 7.80763f, 16.7854f, 8.44584f, 16.4649f, 9f)
        moveTo(16.9733f, 14.867f)
        curveTo(16.9909f, 14.7472f, 17f, 14.6247f, 17f, 14.5f)
        curveTo(17f, 13.2905f, 16.1411f, 12.2816f, 15f, 12.05f)
        moveTo(16.9733f, 14.867f)
        curveTo(16.7957f, 16.0737f, 15.756f, 17f, 14.5f, 17f)
        horizontalLineTo(14f)
        curveTo(11.7909f, 17f, 10f, 18.7909f, 10f, 21f)
        moveTo(9.09041f, 6.15043f)
        curveTo(8.74377f, 6.05243f, 8.37801f, 6f, 8f, 6f)
        curveTo(5.79086f, 6f, 4f, 7.79086f, 4f, 10f)
        curveTo(4f, 10.3886f, 4.05542f, 10.7643f, 4.15878f, 11.1195f)
        moveTo(9.09041f, 6.15043f)
        curveTo(10.1015f, 6.43625f, 10.9498f, 7.10965f, 11.4649f, 8f)
        moveTo(4.15878f, 11.1195f)
        curveTo(2.9114f, 11.4832f, 2f, 12.6352f, 2f, 14f)
        curveTo(2f, 15.6569f, 3.34315f, 17f, 5f, 17f)
        curveTo(6.30622f, 17f, 7.41746f, 16.1652f, 7.82929f, 15f)
        moveTo(4.15878f, 11.1195f)
        curveTo(4.24921f, 11.4303f, 4.37632f, 11.7255f, 4.53513f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.8361f, 11.7435f)
        curveTo(11.3257f, 12.2353f, 10.453f, 12.3202f, 9.70713f, 11.9008f)
        curveTo(8.9612f, 11.4814f, 8.58031f, 10.6917f, 8.73535f, 10f)
        }
        }.build()

        return _brain!!
    }

private var _brain: ImageVector? = null
