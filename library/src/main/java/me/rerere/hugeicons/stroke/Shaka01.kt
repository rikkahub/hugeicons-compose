package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shaka01: ImageVector
    get() {
        if (_shaka01 != null) {
            return _shaka01!!
        }
        _shaka01 = ImageVector.Builder(
            name = "Shaka01",
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
        moveTo(12.329f, 5.95241f)
        lineTo(10.5f, 8.14663f)
        curveTo(11.8897f, 8.14663f, 12.5845f, 8.14663f, 13.1133f, 8.36021f)
        curveTo(14.0353f, 8.73264f, 14.7191f, 9.5491f, 14.9405f, 10.542f)
        curveTo(15.0675f, 11.1113f, 14.9644f, 11.8179f, 14.7583f, 13.2311f)
        lineTo(14f, 17.4011f)
        horizontalLineTo(19.25f)
        curveTo(20.2165f, 17.4011f, 21f, 18.2067f, 21f, 19.2005f)
        curveTo(21f, 20.1943f, 20.2165f, 21f, 19.25f, 21f)
        horizontalLineTo(11.0505f)
        curveTo(8.20258f, 21f, 6.7786f, 21f, 5.69477f, 20.4208f)
        curveTo(4.78184f, 19.9329f, 4.03745f, 19.1673f, 3.56312f, 18.2282f)
        curveTo(3f, 17.1134f, 3f, 15.6488f, 3f, 12.7195f)
        curveTo(3f, 11.1625f, 3f, 10.384f, 3.25654f, 9.68332f)
        curveTo(3.33566f, 9.46725f, 3.43232f, 9.25841f, 3.54552f, 9.05902f)
        curveTo(3.91257f, 8.41248f, 4.50018f, 7.92155f, 5.67536f, 6.93972f)
        lineTo(9.91166f, 3.40042f)
        curveTo(10.5469f, 2.86973f, 11.4559f, 2.86619f, 12.095f, 3.39191f)
        curveTo(12.8631f, 4.02379f, 12.9692f, 5.18442f, 12.329f, 5.95241f)
        }
        }.build()

        return _shaka01!!
    }

private var _shaka01: ImageVector? = null
