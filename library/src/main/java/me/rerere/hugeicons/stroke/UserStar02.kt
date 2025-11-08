package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserStar02: ImageVector
    get() {
        if (_userStar02 != null) {
            return _userStar02!!
        }
        _userStar02 = ImageVector.Builder(
            name = "UserStar02",
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
        moveTo(14f, 8.5f)
        curveTo(14f, 5.73858f, 11.7614f, 3.5f, 9f, 3.5f)
        curveTo(6.23858f, 3.5f, 4f, 5.73858f, 4f, 8.5f)
        curveTo(4f, 11.2614f, 6.23858f, 13.5f, 9f, 13.5f)
        curveTo(11.7614f, 13.5f, 14f, 11.2614f, 14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20.5f)
        curveTo(16f, 16.634f, 12.866f, 13.5f, 9f, 13.5f)
        curveTo(5.13401f, 13.5f, 2f, 16.634f, 2f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5183f, 8.93325f)
        lineTo(20.0462f, 9.99786f)
        curveTo(20.1182f, 10.1461f, 20.3102f, 10.2882f, 20.4722f, 10.3154f)
        lineTo(21.4291f, 10.4757f)
        curveTo(22.041f, 10.5786f, 22.185f, 11.0262f, 21.744f, 11.4677f)
        lineTo(21.0001f, 12.2178f)
        curveTo(20.8741f, 12.3448f, 20.8051f, 12.5898f, 20.8441f, 12.7652f)
        lineTo(21.0571f, 13.6937f)
        curveTo(21.2251f, 14.4287f, 20.8381f, 14.713f, 20.1932f, 14.3289f)
        lineTo(19.2963f, 13.7936f)
        curveTo(19.1343f, 13.6968f, 18.8674f, 13.6968f, 18.7024f, 13.7936f)
        lineTo(17.8055f, 14.3289f)
        curveTo(17.1636f, 14.713f, 16.7736f, 14.4257f, 16.9416f, 13.6937f)
        lineTo(17.1546f, 12.7652f)
        curveTo(17.1935f, 12.5898f, 17.1246f, 12.3448f, 16.9986f, 12.2178f)
        lineTo(16.2547f, 11.4677f)
        curveTo(15.8167f, 11.0262f, 15.9577f, 10.5786f, 16.5696f, 10.4757f)
        lineTo(17.5265f, 10.3154f)
        curveTo(17.6855f, 10.2882f, 17.8775f, 10.1461f, 17.9495f, 9.99786f)
        lineTo(18.4774f, 8.93325f)
        curveTo(18.7654f, 8.35558f, 19.2333f, 8.35558f, 19.5183f, 8.93325f)
        }
        }.build()

        return _userStar02!!
    }

private var _userStar02: ImageVector? = null
