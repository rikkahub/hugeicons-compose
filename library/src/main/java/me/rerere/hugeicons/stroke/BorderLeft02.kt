package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderLeft02: ImageVector
    get() {
        if (_borderLeft02 != null) {
            return _borderLeft02!!
        }
        _borderLeft02 = ImageVector.Builder(
            name = "BorderLeft02",
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
        moveTo(17.6668f, 21.2482f)
        curveTo(18.7151f, 21.0549f, 19.4867f, 20.713f, 20.0967f, 20.1084f)
        curveTo(20.7066f, 19.5037f, 21.0515f, 18.7388f, 21.2465f, 17.6996f)
        moveTo(10.0001f, 21.4946f)
        curveTo(10.5897f, 21.4996f, 11.2269f, 21.4996f, 11.9168f, 21.4996f)
        curveTo(12.6067f, 21.4996f, 13.2439f, 21.4996f, 13.8335f, 21.4946f)
        moveTo(21.4951f, 13.8996f)
        curveTo(21.5001f, 13.3152f, 21.5001f, 12.6835f, 21.5001f, 11.9996f)
        curveTo(21.5001f, 11.3157f, 21.5001f, 10.684f, 21.4951f, 10.0995f)
        moveTo(21.2465f, 6.2996f)
        curveTo(21.0515f, 5.26036f, 20.7066f, 4.49552f, 20.0967f, 3.89085f)
        curveTo(19.4867f, 3.28618f, 18.7151f, 2.94431f, 17.6668f, 2.75103f)
        moveTo(10.0001f, 2.50456f)
        curveTo(10.5894f, 2.4996f, 11.2272f, 2.4996f, 11.9168f, 2.4996f)
        curveTo(12.6066f, 2.4996f, 13.2438f, 2.4996f, 13.8333f, 2.50456f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.50012f, 21.4996f)
        curveTo(5.40618f, 21.3011f, 4.60108f, 20.9499f, 3.96459f, 20.3288f)
        curveTo(2.50012f, 18.8997f, 2.50012f, 16.5997f, 2.50012f, 11.9996f)
        curveTo(2.50012f, 7.39951f, 2.50012f, 5.09947f, 3.96459f, 3.67041f)
        curveTo(4.60108f, 3.0493f, 5.40618f, 2.69814f, 6.50012f, 2.4996f)
        }
        }.build()

        return _borderLeft02!!
    }

private var _borderLeft02: ImageVector? = null
