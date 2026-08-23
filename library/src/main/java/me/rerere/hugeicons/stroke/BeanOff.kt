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

val HugeIcons.BeanOff: ImageVector
    get() {
        if (_beanOff != null) {
            return _beanOff!!
        }
        _beanOff = ImageVector.Builder(
            name = "BeanOff",
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
            moveTo(9.2995f, 9.2995f)
            curveTo(8.79739f, 9.8016f, 8.14777f, 10.1562f, 7.42494f, 10.289f)
            curveTo(4.49201f, 10.8277f, 2.55106f, 13.6421f, 3.08979f, 16.5751f)
            curveTo(3.62852f, 19.508f, 6.44296f, 21.4489f, 9.37589f, 20.9102f)
            curveTo(12.3036f, 20.3724f, 14.9183f, 18.9527f, 16.9355f, 16.9355f)
            moveTo(10.8427f, 5.84268f)
            curveTo(11.9228f, 3.83297f, 14.2104f, 2.65544f, 16.5751f, 3.08979f)
            curveTo(19.508f, 3.62852f, 21.4489f, 6.44296f, 20.9102f, 9.37589f)
            curveTo(20.5964f, 11.0842f, 19.9824f, 12.6859f, 19.1245f, 14.1245f)
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
            moveTo(11.1734f, 5.64062f)
            curveTo(11.9536f, 6.14654f, 12.5464f, 6.91691f, 12.8248f, 7.82477f)
            moveTo(5.64142f, 11.1726f)
            curveTo(6.35428f, 12.2719f, 7.5922f, 12.9992f, 8.99998f, 12.9992f)
            curveTo(10.1043f, 12.9992f, 11.1042f, 12.5516f, 11.828f, 11.828f)
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
            moveTo(3f, 3f)
            lineTo(21f, 21f)
        }
        }.build()

        return _beanOff!!
    }

private var _beanOff: ImageVector? = null
