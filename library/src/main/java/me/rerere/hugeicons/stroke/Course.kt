package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Course: ImageVector
    get() {
        if (_course != null) {
            return _course!!
        }
        _course = ImageVector.Builder(
            name = "Course",
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
        moveTo(20.0002f, 15f)
        curveTo(20.0002f, 16.8638f, 20.0002f, 17.7956f, 19.6957f, 18.5307f)
        curveTo(19.2897f, 19.5108f, 18.511f, 20.2895f, 17.5309f, 20.6955f)
        curveTo(16.7958f, 21f, 15.8639f, 21f, 14.0002f, 21f)
        horizontalLineTo(11.0002f)
        curveTo(7.22898f, 21f, 5.34334f, 21f, 4.17177f, 19.8284f)
        curveTo(3.00019f, 18.6568f, 3.00021f, 16.7712f, 3.00024f, 12.9999f)
        lineTo(3.0003f, 6.99983f)
        curveTo(3.00032f, 4.79078f, 4.79112f, 3f, 7.00017f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0002f, 8.5f)
        lineTo(10.4339f, 12.4689f)
        curveTo(10.4753f, 12.8007f, 10.6792f, 13.0899f, 10.9864f, 13.2219f)
        curveTo(11.6724f, 13.5165f, 12.9572f, 14f, 14.0002f, 14f)
        curveTo(15.0433f, 14f, 16.3281f, 13.5165f, 17.0141f, 13.2219f)
        curveTo(17.3213f, 13.0899f, 17.5252f, 12.8007f, 17.5666f, 12.4689f)
        lineTo(18.0002f, 8.5f)
        moveTo(20.5002f, 7.5f)
        verticalLineTo(11.2692f)
        moveTo(14.0002f, 4f)
        lineTo(7.00024f, 7f)
        lineTo(14.0002f, 10f)
        lineTo(21.0002f, 7f)
        lineTo(14.0002f, 4f)
        }
        }.build()

        return _course!!
    }

private var _course: ImageVector? = null
