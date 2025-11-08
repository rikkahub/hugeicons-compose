package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = ImageVector.Builder(
            name = "Student",
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
        moveTo(19f, 5f)
        lineTo(12f, 2f)
        lineTo(5f, 5f)
        lineTo(8.5f, 6.5f)
        verticalLineTo(8.5f)
        curveTo(8.5f, 8.5f, 9.66667f, 8f, 12f, 8f)
        curveTo(14.3333f, 8f, 15.5f, 8.5f, 15.5f, 8.5f)
        verticalLineTo(6.5f)
        lineTo(19f, 5f)
        moveTo(19f, 5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 8.5f)
        verticalLineTo(9.5f)
        curveTo(15.5f, 11.433f, 13.933f, 13f, 12f, 13f)
        curveTo(10.067f, 13f, 8.5f, 11.433f, 8.5f, 9.5f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.78256f, 16.7033f)
        curveTo(6.68218f, 17.3878f, 3.79706f, 18.7854f, 5.55429f, 20.5342f)
        curveTo(6.41269f, 21.3885f, 7.36872f, 21.9995f, 8.57068f, 21.9995f)
        horizontalLineTo(15.4293f)
        curveTo(16.6313f, 21.9995f, 17.5873f, 21.3885f, 18.4457f, 20.5342f)
        curveTo(20.2029f, 18.7854f, 17.3178f, 17.3878f, 16.2174f, 16.7033f)
        curveTo(13.6371f, 15.0982f, 10.3629f, 15.0982f, 7.78256f, 16.7033f)
        }
        }.build()

        return _student!!
    }

private var _student: ImageVector? = null
