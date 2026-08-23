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

val HugeIcons.RotateCcwKey: ImageVector
    get() {
        if (_rotateCcwKey != null) {
            return _rotateCcwKey!!
        }
        _rotateCcwKey = ImageVector.Builder(
            name = "RotateCcwKey",
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
            moveTo(11.6296f, 22f)
            curveTo(12.0918f, 22f, 12.5467f, 21.9695f, 12.9922f, 21.9106f)
            moveTo(2.2549f, 9f)
            curveTo(2.14363f, 9.38726f, 2.05631f, 9.77865f, 1.99219f, 10.1722f)
            moveTo(2.02641f, 13.7496f)
            curveTo(2.09601f, 14.1396f, 2.18667f, 14.5258f, 2.29762f, 14.9063f)
            moveTo(3.80677f, 18.0963f)
            curveTo(4.04271f, 18.4409f, 4.29849f, 18.7726f, 4.57321f, 19.0892f)
            moveTo(7.36647f, 21.3767f)
            curveTo(7.71664f, 21.574f, 8.0811f, 21.7526f, 8.45914f, 21.9106f)
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
            moveTo(3.99219f, 2f)
            verticalLineTo(5.13219f)
            curveTo(3.99219f, 5.42605f, 4.35943f, 5.55908f, 4.54746f, 5.33333f)
            curveTo(6.37759f, 3.2875f, 9.03718f, 2f, 11.9973f, 2f)
            curveTo(17.5173f, 2f, 21.9922f, 6.47715f, 21.9922f, 12f)
            curveTo(21.9922f, 15.9582f, 19.6937f, 19.3793f, 16.3592f, 21f)
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
            moveTo(11.9922f, 13.1229f)
            verticalLineTo(6.75f)
            moveTo(11.9922f, 8.75281f)
            horizontalLineTo(13.9922f)
            moveTo(13.4064f, 13.831f)
            curveTo(14.1874f, 14.6131f, 14.1874f, 15.8812f, 13.4064f, 16.6634f)
            curveTo(12.6254f, 17.4455f, 11.359f, 17.4455f, 10.578f, 16.6634f)
            curveTo(9.79693f, 15.8812f, 9.79693f, 14.6131f, 10.578f, 13.831f)
            curveTo(11.359f, 13.0488f, 12.6254f, 13.0488f, 13.4064f, 13.831f)
            close()
        }
        }.build()

        return _rotateCcwKey!!
    }

private var _rotateCcwKey: ImageVector? = null
