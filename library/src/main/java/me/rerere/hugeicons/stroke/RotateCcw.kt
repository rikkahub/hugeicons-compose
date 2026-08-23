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

val HugeIcons.RotateCcw: ImageVector
    get() {
        if (_rotateCcw != null) {
            return _rotateCcw!!
        }
        _rotateCcw = ImageVector.Builder(
            name = "RotateCcw",
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
            moveTo(11.7269f, 22.0003f)
            curveTo(12.1938f, 22.0003f, 12.6533f, 21.9691f, 13.1033f, 21.9086f)
            moveTo(2.25756f, 8.66699f)
            curveTo(2.14516f, 9.06418f, 2.05696f, 9.4656f, 1.99219f, 9.86925f)
            moveTo(2.02676f, 13.5383f)
            curveTo(2.09706f, 13.9384f, 2.18863f, 14.3345f, 2.30071f, 14.7247f)
            moveTo(3.8251f, 17.9966f)
            curveTo(4.06343f, 18.35f, 4.32178f, 18.6902f, 4.59928f, 19.0149f)
            moveTo(7.42075f, 21.361f)
            curveTo(7.77446f, 21.5634f, 8.14261f, 21.7466f, 8.52446f, 21.9086f)
        }
        }.build()

        return _rotateCcw!!
    }

private var _rotateCcw: ImageVector? = null
