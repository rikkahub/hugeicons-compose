package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rotate360: ImageVector
    get() {
        if (_rotate360 != null) {
            return _rotate360!!
        }
        _rotate360 = ImageVector.Builder(
            name = "Rotate360",
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
        moveTo(20.4371f, 12.5061f)
        curveTo(23.4219f, 7.00258f, 22.0614f, 3.26685f, 16.9548f, 3f)
        curveTo(13.2433f, 3.07086f, 9.41471f, 5.07063f, 6.35871f, 8.16433f)
        curveTo(3.79408f, 10.7606f, 1.26891f, 14.479f, 2.1959f, 18.018f)
        curveTo(2.40059f, 18.7994f, 2.79969f, 19.3318f, 3.43015f, 19.8328f)
        curveTo(5.12441f, 21.1791f, 6.7874f, 21.2976f, 9.99031f, 20.5113f)
        curveTo(13.2339f, 19.5257f, 15.2448f, 18.0408f, 16.9404f, 16.5217f)
        moveTo(16.9404f, 16.5217f)
        curveTo(16.9421f, 16.5201f, 16.9439f, 16.5185f, 16.9457f, 16.5169f)
        curveTo(16.9489f, 16.5141f, 16.9468f, 16.5087f, 16.9425f, 16.5087f)
        curveTo(16.9393f, 16.5087f, 16.937f, 16.512f, 16.9381f, 16.515f)
        curveTo(16.9389f, 16.5173f, 16.9396f, 16.5195f, 16.9404f, 16.5217f)
        moveTo(16.9404f, 16.5217f)
        curveTo(17.3108f, 17.6169f, 17.0762f, 18.5944f, 16.4385f, 20.5113f)
        }
        }.build()

        return _rotate360!!
    }

private var _rotate360: ImageVector? = null
