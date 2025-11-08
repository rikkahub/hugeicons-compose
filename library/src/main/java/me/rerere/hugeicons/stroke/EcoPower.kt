package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EcoPower: ImageVector
    get() {
        if (_ecoPower != null) {
            return _ecoPower!!
        }
        _ecoPower = ImageVector.Builder(
            name = "EcoPower",
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
        moveTo(9f, 20f)
        curveTo(5.22895f, 19.1318f, 3f, 15.6772f, 3f, 12.5102f)
        curveTo(3f, 8.74448f, 6.37016f, 5.02317f, 8.73565f, 2.875f)
        curveTo(10.0204f, 1.70833f, 11.9797f, 1.70833f, 13.2643f, 2.875f)
        curveTo(14.7712f, 4.24338f, 16.5749f, 6.25009f, 17.7511f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 15.5f)
        curveTo(15.5f, 16.5f, 13f, 18.5f, 11f, 22f)
        moveTo(13f, 19f)
        curveTo(10.3362f, 13.1407f, 15.8347f, 11.2355f, 19.9249f, 11.0158f)
        curveTo(20.4185f, 10.9893f, 20.6653f, 10.976f, 20.8425f, 11.147f)
        curveTo(21.0198f, 11.3179f, 21.0095f, 11.5616f, 20.9891f, 12.049f)
        curveTo(20.8194f, 16.1017f, 18.9947f, 21.6068f, 13f, 19f)
        }
        }.build()

        return _ecoPower!!
    }

private var _ecoPower: ImageVector? = null
