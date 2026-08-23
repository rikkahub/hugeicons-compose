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

val HugeIcons.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = ImageVector.Builder(
            name = "Shrimp",
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
            moveTo(10.4922f, 4.99988f)
            curveTo(5.79777f, 4.99988f, 1.99219f, 8.80546f, 1.99219f, 13.4999f)
            curveTo(1.99219f, 18.1943f, 5.79777f, 21.9999f, 10.4922f, 21.9999f)
            curveTo(15.1866f, 21.9999f, 18.9922f, 18.1943f, 18.9922f, 13.4999f)
            curveTo(18.9922f, 13.0304f, 18.6078f, 12.641f, 18.1476f, 12.7338f)
            curveTo(16.205f, 13.1255f, 14.7422f, 14.8418f, 14.7422f, 16.8999f)
            moveTo(10.4922f, 4.99988f)
            horizontalLineTo(17.2922f)
            curveTo(18.2311f, 4.99988f, 19.014f, 5.77281f, 18.7824f, 6.68268f)
            curveTo(18.0335f, 9.62429f, 15.3669f, 11.7999f, 12.1922f, 11.7999f)
            horizontalLineTo(10.4922f)
            curveTo(9.08386f, 11.7999f, 7.94219f, 12.9416f, 7.94219f, 14.3499f)
            curveTo(7.94219f, 15.7582f, 9.08386f, 16.8999f, 10.4922f, 16.8999f)
            horizontalLineTo(14.7422f)
            moveTo(10.4922f, 4.99988f)
            verticalLineTo(8.39988f)
            moveTo(14.7422f, 16.8999f)
            verticalLineTo(17.7499f)
            moveTo(5.39219f, 20.2999f)
            lineTo(8.79219f, 16.8999f)
            moveTo(3.26719f, 9.24988f)
            lineTo(7.94219f, 13.0749f)
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
            moveTo(8.99219f, 2f)
            horizontalLineTo(20.153f)
            curveTo(21.3132f, 2f, 22.1834f, 3.05108f, 21.9559f, 4.17765f)
            curveTo(21.661f, 5.63726f, 20.3355f, 6.67831f, 18.9111f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.1172f, 8f)
            horizontalLineTo(13.9922f)
            moveTo(14.2422f, 8f)
            curveTo(14.2422f, 8.13807f, 14.1303f, 8.25f, 13.9922f, 8.25f)
            curveTo(13.8541f, 8.25f, 13.7422f, 8.13807f, 13.7422f, 8f)
            curveTo(13.7422f, 7.86193f, 13.8541f, 7.75f, 13.9922f, 7.75f)
            curveTo(14.1303f, 7.75f, 14.2422f, 7.86193f, 14.2422f, 8f)
            close()
        }
        }.build()

        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
