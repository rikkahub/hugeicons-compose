package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StreetFood: ImageVector
    get() {
        if (_streetFood != null) {
            return _streetFood!!
        }
        _streetFood = ImageVector.Builder(
            name = "StreetFood",
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
        moveTo(7f, 4.5f)
        curveTo(7f, 5.5f, 8f, 5.5f, 8f, 6.5f)
        curveTo(8f, 7.5f, 7f, 7.5f, 7f, 8.5f)
        curveTo(7f, 9.5f, 8f, 9.5f, 8f, 10.5f)
        curveTo(8f, 11.5f, 7f, 11.5f, 7f, 12.5f)
        curveTo(7f, 13.5f, 8f, 13.5f, 8f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4.5f)
        curveTo(16f, 5.5f, 17f, 5.5f, 17f, 6.5f)
        curveTo(17f, 7.5f, 16f, 7.5f, 16f, 8.5f)
        curveTo(16f, 9.5f, 17f, 9.5f, 17f, 10.5f)
        curveTo(17f, 11.5f, 16f, 11.5f, 16f, 12.5f)
        curveTo(16f, 13.5f, 17f, 13.5f, 17f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 5f)
        curveTo(4.5f, 3.34315f, 5.84315f, 2f, 7.5f, 2f)
        curveTo(9.15685f, 2f, 10.5f, 3.34315f, 10.5f, 5f)
        verticalLineTo(14f)
        curveTo(10.5f, 15.6569f, 9.15685f, 17f, 7.5f, 17f)
        curveTo(5.84315f, 17f, 4.5f, 15.6569f, 4.5f, 14f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 5f)
        curveTo(13.5f, 3.34315f, 14.8431f, 2f, 16.5f, 2f)
        curveTo(18.1569f, 2f, 19.5f, 3.34315f, 19.5f, 5f)
        verticalLineTo(14f)
        curveTo(19.5f, 15.6569f, 18.1569f, 17f, 16.5f, 17f)
        curveTo(14.8431f, 17f, 13.5f, 15.6569f, 13.5f, 14f)
        verticalLineTo(5f)
        }
        }.build()

        return _streetFood!!
    }

private var _streetFood: ImageVector? = null
