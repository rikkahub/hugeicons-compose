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

val HugeIcons.LockKeyhole: ImageVector
    get() {
        if (_lockKeyhole != null) {
            return _lockKeyhole!!
        }
        _lockKeyhole = ImageVector.Builder(
            name = "LockKeyhole",
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
            moveTo(16.4964f, 9f)
            verticalLineTo(6.5f)
            curveTo(16.4964f, 4.01472f, 14.4817f, 2f, 11.9964f, 2f)
            curveTo(9.51112f, 2f, 7.4964f, 4.01472f, 7.4964f, 6.5f)
            verticalLineTo(9f)
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
            moveTo(13.4958f, 9f)
            horizontalLineTo(10.4964f)
            curveTo(8.16158f, 9f, 6.99417f, 9f, 6.11049f, 9.47237f)
            curveTo(5.41275f, 9.84535f, 4.84128f, 10.4169f, 4.46837f, 11.1146f)
            curveTo(3.99608f, 11.9984f, 3.99619f, 13.1658f, 3.99641f, 15.5006f)
            curveTo(3.99662f, 17.835f, 3.99673f, 19.0023f, 4.46907f, 19.8858f)
            curveTo(4.84203f, 20.5835f, 5.41347f, 21.1548f, 6.11115f, 21.5277f)
            curveTo(6.99475f, 22f, 8.16197f, 22f, 10.4964f, 22f)
            horizontalLineTo(13.4958f)
            curveTo(15.8304f, 22f, 16.9978f, 22f, 17.8814f, 21.5277f)
            curveTo(18.5791f, 21.1548f, 19.1506f, 20.5833f, 19.5235f, 19.8856f)
            curveTo(19.9958f, 19.0019f, 19.9958f, 17.8346f, 19.9958f, 15.5f)
            curveTo(19.9958f, 13.1654f, 19.9958f, 11.9981f, 19.5235f, 11.1144f)
            curveTo(19.1506f, 10.4167f, 18.5791f, 9.84525f, 17.8814f, 9.47231f)
            curveTo(16.9978f, 9f, 15.8304f, 9f, 13.4958f, 9f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.9964f, 15.5f)
            arcTo(2f, 2f, 0f, true, false, 9.9964f, 15.5f)
            arcTo(2f, 2f, 0f, true, false, 13.9964f, 15.5f)
            close()
        }
        }.build()

        return _lockKeyhole!!
    }

private var _lockKeyhole: ImageVector? = null
