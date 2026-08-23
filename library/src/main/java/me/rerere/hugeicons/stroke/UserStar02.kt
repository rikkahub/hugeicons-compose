package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 14f)
            curveTo(5f, 14f, 2f, 16.5f, 2f, 19f)
            curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
            horizontalLineTo(16f)
            curveTo(17.1046f, 21f, 18f, 20.1046f, 18f, 19f)
            curveTo(18f, 16.5f, 15f, 14f, 10f, 14f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.5183f, 8.39715f)
            lineTo(20.0462f, 9.37304f)
            curveTo(20.1182f, 9.50889f, 20.3102f, 9.63919f, 20.4722f, 9.66414f)
            lineTo(21.4291f, 9.81108f)
            curveTo(22.041f, 9.90534f, 22.185f, 10.3157f, 21.744f, 10.7204f)
            lineTo(21.0001f, 11.408f)
            curveTo(20.8741f, 11.5244f, 20.8051f, 11.749f, 20.8441f, 11.9098f)
            lineTo(21.0571f, 12.7609f)
            curveTo(21.2251f, 13.4346f, 20.8381f, 13.6952f, 20.1932f, 13.3431f)
            lineTo(19.2963f, 12.8524f)
            curveTo(19.1343f, 12.7637f, 18.8674f, 12.7637f, 18.7024f, 12.8524f)
            lineTo(17.8055f, 13.3431f)
            curveTo(17.1636f, 13.6952f, 16.7736f, 13.4319f, 16.9416f, 12.7609f)
            lineTo(17.1546f, 11.9098f)
            curveTo(17.1935f, 11.749f, 17.1246f, 11.5244f, 16.9986f, 11.408f)
            lineTo(16.2547f, 10.7204f)
            curveTo(15.8167f, 10.3157f, 15.9577f, 9.90534f, 16.5696f, 9.81108f)
            lineTo(17.5265f, 9.66414f)
            curveTo(17.6855f, 9.63919f, 17.8775f, 9.50889f, 17.9495f, 9.37304f)
            lineTo(18.4774f, 8.39715f)
            curveTo(18.7654f, 7.86762f, 19.2333f, 7.86762f, 19.5183f, 8.39715f)
            close()
        }
        }.build()

        return _userStar02!!
    }

private var _userStar02: ImageVector? = null
