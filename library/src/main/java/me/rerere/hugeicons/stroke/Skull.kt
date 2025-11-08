package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = ImageVector.Builder(
            name = "Skull",
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
        moveTo(11.5908f, 14.536f)
        curveTo(11.1388f, 14.7038f, 10.7358f, 15.0268f, 10.3317f, 15.2845f)
        curveTo(9.48946f, 15.8216f, 8.63063f, 16.4131f, 7.58474f, 16.3597f)
        curveTo(4.46802f, 16.2004f, 2f, 12.3209f, 2f, 9.56692f)
        curveTo(2f, 5.38782f, 6.10119f, 2f, 11.1603f, 2f)
        curveTo(15.7188f, 2f, 19.4995f, 4.75056f, 20.2031f, 8.35214f)
        curveTo(20.4227f, 9.47603f, 19.9208f, 10.1613f, 19.3027f, 11.0803f)
        lineTo(21.3692f, 13.1287f)
        curveTo(21.797f, 13.5528f, 22.011f, 13.7649f, 21.9996f, 13.9858f)
        curveTo(21.9881f, 14.2066f, 21.7199f, 14.4234f, 21.1834f, 14.8569f)
        curveTo(20.7141f, 15.236f, 20.3205f, 15.6902f, 20.3205f, 16.1249f)
        curveTo(20.5325f, 17.5959f, 21.4196f, 20.0253f, 20.4459f, 21.2837f)
        curveTo(19.2685f, 22.8054f, 16.9884f, 21.5105f, 15.6126f, 20.9801f)
        curveTo(14.178f, 20.4271f, 13.4607f, 20.1506f, 12.9795f, 19.6296f)
        curveTo(11.8449f, 18.4013f, 11.5908f, 14.536f, 11.5908f, 14.536f)
        moveTo(11.5908f, 14.536f)
        curveTo(13.0845f, 13.9816f, 14.3114f, 15.7714f, 15.8378f, 15.1043f)
        curveTo(16.3596f, 14.8762f, 16.8134f, 14.4444f, 17.2671f, 14.1071f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 18.9999f)
        curveTo(20.5f, 18.9999f, 19f, 18.4999f, 18.5f, 17.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9.01907f)
        curveTo(14f, 9.01907f, 12.1384f, 9.01907f, 11.3067f, 10.3287f)
        curveTo(11.0575f, 10.7213f, 10.6752f, 11.0693f, 10.2233f, 10.9881f)
        curveTo(9.01847f, 10.7716f, 7.65343f, 9.99767f, 7f, 8f)
        }
        }.build()

        return _skull!!
    }

private var _skull: ImageVector? = null
