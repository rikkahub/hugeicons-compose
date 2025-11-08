package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IceCream02: ImageVector
    get() {
        if (_iceCream02 != null) {
            return _iceCream02!!
        }
        _iceCream02 = ImageVector.Builder(
            name = "IceCream02",
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
        moveTo(7.5f, 12f)
        lineTo(8.32693f, 14.6957f)
        curveTo(9.82073f, 19.5652f, 10.5676f, 22f, 12f, 22f)
        curveTo(13.4324f, 22f, 14.1793f, 19.5652f, 15.6731f, 14.6957f)
        lineTo(16.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.66667f)
        curveTo(12f, 9.26343f, 12.1647f, 9.82357f, 12.4531f, 10.3081f)
        moveTo(12.4531f, 10.3081f)
        curveTo(11.7173f, 11.3298f, 10.4825f, 12f, 9.08333f, 12f)
        curveTo(6.82817f, 12f, 5f, 10.2589f, 5f, 8.11111f)
        curveTo(5f, 6.22776f, 6.40574f, 4.6571f, 8.27244f, 4.2989f)
        curveTo(8.91067f, 2.94384f, 10.3396f, 2f, 12f, 2f)
        curveTo(14.0719f, 2f, 15.7833f, 3.46957f, 16.0479f, 5.37393f)
        moveTo(12.4531f, 10.3081f)
        curveTo(13.0544f, 11.3183f, 14.1936f, 12f, 15.5f, 12f)
        curveTo(17.433f, 12f, 19f, 10.5076f, 19f, 8.66667f)
        curveTo(19f, 7.00322f, 17.7206f, 5.62436f, 16.0479f, 5.37393f)
        moveTo(15.6904f, 7.55556f)
        curveTo(15.9423f, 7.05041f, 16.0833f, 6.48533f, 16.0833f, 5.88889f)
        curveTo(16.0833f, 5.71431f, 16.0713f, 5.54242f, 16.0479f, 5.37393f)
        }
        }.build()

        return _iceCream02!!
    }

private var _iceCream02: ImageVector? = null
