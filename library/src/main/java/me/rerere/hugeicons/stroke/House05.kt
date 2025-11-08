package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.House05: ImageVector
    get() {
        if (_house05 != null) {
            return _house05!!
        }
        _house05 = ImageVector.Builder(
            name = "House05",
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
        moveTo(4f, 11f)
        horizontalLineTo(20f)
        verticalLineTo(22f)
        horizontalLineTo(4f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 22f)
        verticalLineTo(19f)
        curveTo(14.5f, 18.0572f, 14.5f, 17.5858f, 14.2071f, 17.2929f)
        curveTo(13.9142f, 17f, 13.4428f, 17f, 12.5f, 17f)
        horizontalLineTo(11.5f)
        curveTo(10.5572f, 17f, 10.0858f, 17f, 9.79289f, 17.2929f)
        curveTo(9.5f, 17.5858f, 9.5f, 18.0572f, 9.5f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9.72254f)
        curveTo(2f, 9.14501f, 2.26952f, 8.68201f, 2.81725f, 8.49897f)
        lineTo(10.9302f, 5.78773f)
        curveTo(11.7893f, 5.50062f, 12f, 5.0255f, 12f, 4.18608f)
        curveTo(12f, 3.42891f, 11.8761f, 1.9173f, 13.0641f, 2.00228f)
        curveTo(13.3438f, 2.02229f, 13.6832f, 2.28692f, 14.3619f, 2.81619f)
        lineTo(21.439f, 8.33464f)
        curveTo(21.8381f, 8.64581f, 22f, 9.01714f, 22f, 9.53489f)
        curveTo(22f, 10.4781f, 21.6036f, 11f, 20.6848f, 11f)
        horizontalLineTo(3.14677f)
        curveTo(2.40983f, 11f, 2f, 10.4554f, 2f, 9.72254f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 15f)
        lineTo(16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7.5f)
        lineTo(5f, 3f)
        }
        }.build()

        return _house05!!
    }

private var _house05: ImageVector? = null
