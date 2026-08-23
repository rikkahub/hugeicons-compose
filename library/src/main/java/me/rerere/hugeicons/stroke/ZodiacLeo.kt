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

val HugeIcons.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) {
            return _zodiacLeo!!
        }
        _zodiacLeo = ImageVector.Builder(
            name = "ZodiacLeo",
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
            moveTo(7f, 18f)
            curveTo(8.65685f, 18f, 10f, 16.6569f, 10f, 15f)
            curveTo(10f, 13.3431f, 8.65685f, 12f, 7f, 12f)
            curveTo(5.34315f, 12f, 4f, 13.3431f, 4f, 15f)
            curveTo(4f, 16.6569f, 5.34315f, 18f, 7f, 18f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.75f, 18f)
            curveTo(20.75f, 17.5858f, 20.4142f, 17.25f, 20f, 17.25f)
            curveTo(19.5858f, 17.25f, 19.25f, 17.5858f, 19.25f, 18f)
            horizontalLineTo(20f)
            horizontalLineTo(20.75f)
            close()
            moveTo(9.25f, 15f)
            curveTo(9.25f, 15.4142f, 9.58579f, 15.75f, 10f, 15.75f)
            curveTo(10.4142f, 15.75f, 10.75f, 15.4142f, 10.75f, 15f)
            horizontalLineTo(10f)
            horizontalLineTo(9.25f)
            close()
            moveTo(20f, 18f)
            horizontalLineTo(19.25f)
            curveTo(19.25f, 19.2426f, 18.2426f, 20.25f, 17f, 20.25f)
            verticalLineTo(21f)
            verticalLineTo(21.75f)
            curveTo(19.0711f, 21.75f, 20.75f, 20.0711f, 20.75f, 18f)
            horizontalLineTo(20f)
            close()
            moveTo(17f, 21f)
            verticalLineTo(20.25f)
            curveTo(15.7574f, 20.25f, 14.75f, 19.2426f, 14.75f, 18f)
            horizontalLineTo(14f)
            horizontalLineTo(13.25f)
            curveTo(13.25f, 20.0711f, 14.9289f, 21.75f, 17f, 21.75f)
            verticalLineTo(21f)
            close()
            moveTo(10f, 15f)
            horizontalLineTo(10.75f)
            curveTo(10.75f, 12.932f, 10.4906f, 11.3788f, 10.2354f, 10.1029f)
            curveTo(9.97442f, 8.79784f, 9.75f, 7.90361f, 9.75f, 7f)
            horizontalLineTo(9f)
            horizontalLineTo(8.25f)
            curveTo(8.25f, 8.09639f, 8.52558f, 9.20216f, 8.76456f, 10.3971f)
            curveTo(9.00939f, 11.6212f, 9.25f, 13.068f, 9.25f, 15f)
            horizontalLineTo(10f)
            close()
            moveTo(9f, 7f)
            horizontalLineTo(9.75f)
            curveTo(9.75f, 5.20507f, 11.2051f, 3.75f, 13f, 3.75f)
            verticalLineTo(3f)
            verticalLineTo(2.25f)
            curveTo(10.3766f, 2.25f, 8.25f, 4.37665f, 8.25f, 7f)
            horizontalLineTo(9f)
            close()
            moveTo(13f, 3f)
            verticalLineTo(3.75f)
            curveTo(14.7949f, 3.75f, 16.25f, 5.20507f, 16.25f, 7f)
            horizontalLineTo(17f)
            horizontalLineTo(17.75f)
            curveTo(17.75f, 4.37665f, 15.6234f, 2.25f, 13f, 2.25f)
            verticalLineTo(3f)
            close()
            moveTo(17f, 7f)
            horizontalLineTo(16.25f)
            curveTo(16.25f, 9.33077f, 15.5588f, 10.958f, 14.819f, 12.5607f)
            curveTo(14.0832f, 14.1549f, 13.25f, 15.8067f, 13.25f, 18f)
            horizontalLineTo(14f)
            horizontalLineTo(14.75f)
            curveTo(14.75f, 16.1933f, 15.4168f, 14.8451f, 16.181f, 13.1893f)
            curveTo(16.9412f, 11.542f, 17.75f, 9.66923f, 17.75f, 7f)
            horizontalLineTo(17f)
            close()
        }
        }.build()

        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
