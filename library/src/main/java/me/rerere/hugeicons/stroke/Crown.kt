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

val HugeIcons.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = ImageVector.Builder(
            name = "Crown",
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
            moveTo(5f, 21f)
            horizontalLineTo(19f)
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
            moveTo(12.125f, 12.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 12.75f)
            curveTo(12.25f, 12.8881f, 12.1381f, 13f, 12f, 13f)
            curveTo(11.8619f, 13f, 11.75f, 12.8881f, 11.75f, 12.75f)
            curveTo(11.75f, 12.6119f, 11.8619f, 12.5f, 12f, 12.5f)
            curveTo(12.1381f, 12.5f, 12.25f, 12.6119f, 12.25f, 12.75f)
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
            moveTo(14.9152f, 7.61089f)
            lineTo(13.8078f, 5.38179f)
            curveTo(13.019f, 3.79393f, 12.6246f, 3f, 12f, 3f)
            curveTo(11.3754f, 3f, 10.981f, 3.79393f, 10.1922f, 5.38179f)
            lineTo(9.08483f, 7.61089f)
            curveTo(8.58107f, 8.62494f, 8.32919f, 9.13197f, 7.87976f, 9.24608f)
            curveTo(7.8485f, 9.25401f, 7.81689f, 9.26043f, 7.78503f, 9.26533f)
            curveTo(7.32682f, 9.3357f, 6.89919f, 8.96678f, 6.04393f, 8.22895f)
            curveTo(4.0124f, 6.47635f, 2.99663f, 5.60004f, 2.38034f, 5.94899f)
            curveTo(2.34045f, 5.97157f, 2.30213f, 5.99686f, 2.26565f, 6.02467f)
            curveTo(1.70197f, 6.45439f, 2.09541f, 7.74136f, 2.88229f, 10.3153f)
            lineTo(4.04783f, 14.1279f)
            curveTo(4.47098f, 15.5121f, 4.68255f, 16.2042f, 5.21787f, 16.6021f)
            curveTo(5.75318f, 17f, 6.47261f, 17f, 7.91147f, 17f)
            lineTo(16.0886f, 16.9999f)
            curveTo(17.5274f, 16.9999f, 18.2468f, 16.9999f, 18.7821f, 16.602f)
            curveTo(19.3175f, 16.2041f, 19.529f, 15.512f, 19.9522f, 14.1279f)
            lineTo(21.1177f, 10.3153f)
            curveTo(21.9046f, 7.74137f, 22.298f, 6.4544f, 21.7344f, 6.02468f)
            curveTo(21.6979f, 5.99687f, 21.6595f, 5.97158f, 21.6197f, 5.94899f)
            curveTo(21.0034f, 5.60006f, 19.9876f, 6.47636f, 17.9561f, 8.22896f)
            curveTo(17.1008f, 8.96679f, 16.6732f, 9.3357f, 16.215f, 9.26533f)
            curveTo(16.1831f, 9.26043f, 16.1515f, 9.25401f, 16.1202f, 9.24607f)
            curveTo(15.6708f, 9.13197f, 15.4189f, 8.62494f, 14.9152f, 7.61089f)
            close()
        }
        }.build()

        return _crown!!
    }

private var _crown: ImageVector? = null
