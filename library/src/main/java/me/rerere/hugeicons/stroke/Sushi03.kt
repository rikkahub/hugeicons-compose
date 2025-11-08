package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sushi03: ImageVector
    get() {
        if (_sushi03 != null) {
            return _sushi03!!
        }
        _sushi03 = ImageVector.Builder(
            name = "Sushi03",
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
        moveTo(5f, 9.5f)
        curveTo(5f, 10.8807f, 7.01472f, 12f, 9.5f, 12f)
        curveTo(11.9853f, 12f, 14f, 10.8807f, 14f, 9.5f)
        curveTo(14f, 8.11929f, 11.9853f, 7f, 9.5f, 7f)
        curveTo(7.01472f, 7f, 5f, 8.11929f, 5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 16.6471f)
        curveTo(14f, 17.9466f, 11.9853f, 19f, 9.5f, 19f)
        curveTo(7.01472f, 19f, 5f, 17.9466f, 5f, 16.6471f)
        verticalLineTo(9.5f)
        moveTo(14f, 9.5f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 9.5f)
        lineTo(9.49102f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 18f)
        lineTo(22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        lineTo(5f, 12.65f)
        moveTo(22f, 5f)
        lineTo(14f, 8.6f)
        }
        }.build()

        return _sushi03!!
    }

private var _sushi03: ImageVector? = null
