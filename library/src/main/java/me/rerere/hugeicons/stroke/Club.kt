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

val HugeIcons.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = ImageVector.Builder(
            name = "Club",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.9375f, 7f)
            curveTo(15.9375f, 9.20914f, 12.9844f, 12f, 12f, 12f)
            curveTo(11.0156f, 12f, 8.0625f, 9.20914f, 8.0625f, 7f)
            curveTo(8.0625f, 4.79086f, 9.82538f, 3f, 12f, 3f)
            curveTo(14.1746f, 3f, 15.9375f, 4.79086f, 15.9375f, 7f)
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
            moveTo(12f, 13.6875f)
            curveTo(12f, 14.6719f, 9.20914f, 17.625f, 7f, 17.625f)
            curveTo(4.79086f, 17.625f, 3f, 15.8621f, 3f, 13.6875f)
            curveTo(3f, 11.5129f, 4.79086f, 9.75f, 7f, 9.75f)
            curveTo(9.20914f, 9.75f, 12f, 12.7031f, 12f, 13.6875f)
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
            moveTo(21f, 13.6875f)
            curveTo(21f, 15.8621f, 19.2091f, 17.625f, 17f, 17.625f)
            curveTo(14.7909f, 17.625f, 12f, 14.6719f, 12f, 13.6875f)
            curveTo(12f, 12.7031f, 14.7909f, 9.75f, 17f, 9.75f)
            curveTo(19.2091f, 9.75f, 21f, 11.5129f, 21f, 13.6875f)
            close()
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
            moveTo(12f, 14.25f)
            verticalLineTo(17.625f)
            curveTo(12f, 18.4389f, 12f, 18.8458f, 11.9061f, 19.1786f)
            curveTo(11.67f, 20.0158f, 11.0158f, 20.67f, 10.1786f, 20.9061f)
            curveTo(9.84579f, 21f, 9.43886f, 21f, 8.625f, 21f)
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
            moveTo(12f, 14.25f)
            verticalLineTo(17.625f)
            curveTo(12f, 18.4389f, 12f, 18.8458f, 12.0939f, 19.1786f)
            curveTo(12.33f, 20.0158f, 12.9842f, 20.67f, 13.8214f, 20.9061f)
            curveTo(14.1542f, 21f, 14.5611f, 21f, 15.375f, 21f)
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
            moveTo(9.75f, 21f)
            horizontalLineTo(14.25f)
        }
        }.build()

        return _club!!
    }

private var _club: ImageVector? = null
